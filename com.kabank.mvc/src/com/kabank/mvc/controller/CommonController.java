package com.kabank.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.constant.Path;
import com.kabank.mvc.enums.OracleProps;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.service.CommonService;
import com.kabank.mvc.serviceImpl.CommonServiceImpl;

@WebServlet("/common.do")
public class CommonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CommonService service;
	public CommonController() {
		service = new CommonServiceImpl();
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=========Common 서블릿 내부로 들어옴=========");
		String dir = request.getServletPath().split(Path.SEPARATOR)[1];
		String dest = request.getServletPath().split(Path.SEPARATOR)[2].split(Path.DOT)[0];
		Command cmd = new Command();
		request.setAttribute("count", service.countTable(cmd));
		request
			.getRequestDispatcher(Path.VIEW+dir+Path.SEPARATOR+dest+Path.EXTENSION)
			.forward(request, response);
	}

	

}
