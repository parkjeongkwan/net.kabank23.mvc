package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.DeleteCommand;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.InsertCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.serviceImpl.AccountServiceImpl;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;
import com.kabank.mvc.util.DispatcherServlet;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		new InitCommand(request).execute();
		
		switch (InitCommand.cmd.getAction()) {
		case MOVE:
			new MoveCommand(request).execute();
			DispatcherServlet.send(request, response);break;
		case OPEN_ACCOUNT:
			System.out.println("OPEN_ACCOUNT");
			MemberBean m = (MemberBean) request.getSession().getAttribute("user");
			Command cmd = new Command();
			cmd.setData(m.getUserid());
			AccountServiceImpl.getInstance().openAccount(cmd);
			new MoveCommand(request).execute();
			DispatcherServlet.send(request, response);break;
		default:
			break;
		}
		
	}

}
