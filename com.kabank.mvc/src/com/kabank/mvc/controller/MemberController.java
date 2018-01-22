package com.kabank.mvc.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.DeleteCommand;
import com.kabank.mvc.command.IOrder;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.InsertCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.constant.Path;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.FoodBean;
import com.kabank.mvc.domain.LottoBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.MobileBean;
import com.kabank.mvc.factory.ActionFactory;
import com.kabank.mvc.iterator.ParamsIterator;
import com.kabank.mvc.query.member.LoginQuery;
import com.kabank.mvc.enums.Action;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.serviceImpl.AccountServiceImpl;
import com.kabank.mvc.serviceImpl.FoodServiceImpl;
import com.kabank.mvc.serviceImpl.LottoServiceImpl;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;
import com.kabank.mvc.serviceImpl.MobileServiceImpl;
import com.kabank.mvc.util.DispatcherServlet;

@WebServlet("/user.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		new InitCommand(request).execute();
		MemberBean member = null;
		Command cmd = null;
		ResultMap rm = null;
		switch (InitCommand.cmd.getAction()) {
		case MOVE:
			System.out.println("====MEMBER-C: MOVE IN====");
			move(request);
			System.out.println("DEST IS "+InitCommand.cmd.getView());
			System.out.println("====MEMBER-C: MOVE OUT====");
			DispatcherServlet.send(request, response);break;
		case ADD:
			System.out.println("====MEMBER-C: ADD IN====");
			member = new MemberBean();
			member.setUserid(request.getParameter(MemberProps.USERID.toString()));
			member.setPassword(request.getParameter(MemberProps.PASSWORD.toString()));
			member.setName(request.getParameter(MemberProps.NAME.toString()));
			member.setEmail(request.getParameter(MemberProps.EMAIL.toString()));
			member.setSsn(request.getParameter(MemberProps.SSN.toString()));
			member.setPhone(request.getParameter(MemberProps.PHONE.toString()));
			member.setAddr(request.getParameter(MemberProps.ADDR.toString()));
			member.setProfile(request.getParameter(MemberProps.PROFILE.toString()));
			//MemberServiceImpl.getInstance().addMember(member);
			System.out.println("++++" + member.getUserid());
			System.out.println("++++" + member.getPassword());
			System.out.println("====MEMBER-C: ADD OUT====");
			break;
		case LOGIN:
			System.out.println("====MEMBER-C: LOGIN IN====");
			new LoginCommand(request).execute();
			cmd = new Command();
			@SuppressWarnings("unchecked") Map<String,String> paramMap = 
					(Map<String, String>) new InitCommand(request).paramMap();
			System.out.println("넘어온 ID:"+paramMap.get("userid"));
			System.out.println("넘어온 ID:"+paramMap.get("password"));
			cmd.setMember(new MemberBean());
			cmd.getMember().setUserid(paramMap.get("userid"));
			cmd.getMember().setPassword(paramMap.get("password"));
			rm = MemberServiceImpl.getInstance().login(cmd);
			System.out.println("SUCCESS ? "+rm.isSuccess());
			if(!rm.isSuccess()) {
				InitCommand.cmd.setDir("user");
				InitCommand.cmd.setPage("login");
			}else {
				System.out.println("==== 로그인 성공 ====");
				session.setAttribute("user", rm.getMember());
				mypage(request);
				InitCommand.cmd.setDir("user");
				InitCommand.cmd.setPage("mypage");
			}
			move(request);
			DispatcherServlet.send(request, response);break;
		case INSERT_MEMBER: 
			System.out.println("====MEMBER-C: INSERT_MEMBER IN====");
			cmd = new Command();
			new InsertCommand(request).execute();
			cmd.setMember(member);
			MemberServiceImpl.getInstance().addMember(cmd);
			System.out.println("====MEMBER-C: INSERT_MEMBER OUT====");
			break;
		case LEAVE_MEMBER:
			System.out.println("====MEMBER-C: LEAVE_MEMBER IN====");
			cmd = new Command();
			new DeleteCommand(request).execute();
			cmd.setData("");
			MemberServiceImpl.getInstance().deleteMember(cmd);
			session.invalidate();
			move(request);
			System.out.println("====MEMBER-C: LEAVE_MEMBER OUT====");
			break;
		case MYPAGE:
			mypage(request);
			break;
		case LOGOUT:
			
			break;
		default:
			break;
		}
		
	}

	public void move(HttpServletRequest request) {
		new MoveCommand(request).execute();
	}
	public void mypage(HttpServletRequest request) {
		HttpSession session = request.getSession();
		MemberBean member = (MemberBean) session.getAttribute("user");
		Command cmd = new Command();
		cmd.setData(member.getUserid());
		ResultMap a = AccountServiceImpl.getInstance().findAccountById(cmd);
		ResultMap m = MobileServiceImpl.getInstance().findMobileById(cmd);
		ResultMap l = LottoServiceImpl.getInstance().findLottoById(cmd);
		ResultMap f = FoodServiceImpl.getInstance().findFoodById(cmd);
		/*if(a!=null) {member.setAccount(a); }  
		if(m!=null) {member.setMobile(m); }  
		if(l!=null) {member.setLotto(l); }  
		if(f!=null) {member.setFood(f); }  */
		session.setAttribute("user", member);			
	}

}
