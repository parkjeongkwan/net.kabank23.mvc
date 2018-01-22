package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.IOrder;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.service.MemberService;

public class MemberServiceImpl implements MemberService {
	public static MemberService getInstance() {
		return new MemberServiceImpl();
	}
	private MemberServiceImpl() {}
	@Override
	public ResultMap addMember(Command cmd) {
		MemberDAOImpl.getInstance().insertMember(cmd);
		return null;
	}
	@Override
	public ResultMap findMemberById(Command cmd) {
		return MemberDAOImpl.getInstance().selectMemberById(cmd);
	}
	@Override
	public ResultMap login(Command cmd) {
		return MemberDAOImpl.getInstance().login(cmd);
	}
	@Override
	public ResultMap deleteMember(Command cmd) {
		MemberDAOImpl.getInstance().deleteMember(cmd);
		return null;
	}
	
}





