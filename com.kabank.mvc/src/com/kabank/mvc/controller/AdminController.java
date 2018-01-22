package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.constant.Path;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.service.AdminService;
import com.kabank.mvc.serviceImpl.AdminServiceImpl;

@WebServlet("/admin.do")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("=========관리자 서블릿 들어옴=========");
		String dir = request.getServletPath().split(Path.SEPARATOR)[1];
		String action = request.getServletPath().split(Path.SEPARATOR)[2].split(Path.DOT)[0];
		String dest = "";
		Command cmd = null;
		switch (action) {
		case "main":
			dest = action;
			break;
		case "create-table":
			switch (request.getParameter("table_name")) {
			case "member": 
				cmd = new Command();
				cmd.setTable(Table.MEMBER);
				AdminServiceImpl.getInstance().makeTable(cmd);
				break;
			case "attend":break;
			case "mobile":
				cmd = new Command();
				cmd.setTable(Table.MOBILE);
				AdminServiceImpl.getInstance().makeTable(cmd);
				break;
			default:
				break;
			}
			
			dest = "main";
			break;
		default:
			break;
		}
		request
		.getRequestDispatcher(Path.VIEW+dir+Path.SEPARATOR+dest+Path.EXTENSION)
		.forward(request, response);
	}


}
