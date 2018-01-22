package com.kabank.mvc.daoImpl;

import java.util.List;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.decoration.ExecuteQuery;
import com.kabank.mvc.decoration.ExecuteUpdate;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.query.member.DeleteMemberQuery;
import com.kabank.mvc.query.member.InsertMemberQuery;
import com.kabank.mvc.query.member.LoginQuery;
import com.kabank.mvc.query.member.SelectMemberByIdQuery;

public class MemberDAOImpl implements MemberDAO {
	public static MemberDAO getInstance() {
		return new MemberDAOImpl();
	}
	private MemberDAOImpl() {}
	@Override
	public ResultMap selectMembers(Command cmd) {
		return null;
	}
	@Override
	public ResultMap selectMemberById(Command cmd) {
		 return new ExecuteQuery(
				new SelectMemberByIdQuery(cmd))
				.execute();
		
	}
	@Override
	public ResultMap login(Command cmd) {
		return new ExecuteQuery(
				new LoginQuery(cmd))
				.execute();
		
	}
	@Override
	public ResultMap deleteMember(Command cmd) {
		new ExecuteUpdate(
				new DeleteMemberQuery(cmd))
			.execute();
		return null;
	}

	@Override
	public ResultMap insertMember(Command cmd) {
		new ExecuteUpdate(
				new InsertMemberQuery(cmd)).execute();
		return null;
	}
	
	
}







