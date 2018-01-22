package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.serviceImpl.AccountServiceImpl;
import com.kabank.mvc.serviceImpl.MobileServiceImpl;
import com.kabank.mvc.util.DispatcherServlet;

@WebServlet("/mobile.do")
public class MobileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		new InitCommand(request).execute();
		Command cmd = null;
		switch (InitCommand.cmd.getAction()) {
		case MOVE:
			new MoveCommand(request).execute();
			DispatcherServlet.send(request, response);break;
		case OPEN_PHONE:
			System.out.println("OPEN_PHONE");
			MemberBean m = (MemberBean)request.getSession().getAttribute("user");
			InitCommand.cmd.setData(m.getUserid());
			cmd = new Command();
			cmd.setData(m.getUserid());
			MobileServiceImpl.getInstance().openPhone(cmd);
			new MoveCommand(request).execute();
			DispatcherServlet.send(request, response);break;
		default:
			break;
		}
		
	}

}
