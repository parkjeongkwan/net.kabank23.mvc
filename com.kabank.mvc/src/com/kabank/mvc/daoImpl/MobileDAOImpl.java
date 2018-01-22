package com.kabank.mvc.daoImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.dao.MobileDAO;
import com.kabank.mvc.decoration.ExecuteUpdate;
import com.kabank.mvc.domain.MobileBean;
import com.kabank.mvc.query.member.InsertMemberQuery;
import com.kabank.mvc.query.mobile.InsertMobileQuery;

public class MobileDAOImpl implements MobileDAO{
	public static MobileDAO getInstance() {
		return new MobileDAOImpl();
	}
	private MobileDAOImpl() {}
	
	@Override
	public ResultMap insertPhone(Command cmd) {
		System.out.println("모바일 DAO 엔트");
		new ExecuteUpdate(new InsertMobileQuery(cmd)).execute();
		return null;
	}
	@Override
	public ResultMap selectMobileById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
