package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.daoImpl.MobileDAOImpl;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.MobileBean;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.service.MobileService;

public class MobileServiceImpl implements MobileService{
	public static MobileService getInstance() {
		return new MobileServiceImpl();
	}
	private MobileServiceImpl() {}
	@Override
	public ResultMap openPhone(Command cmd) {
		System.out.println("모바일 서비스 엔트");
		String phoneNum = "010"+"-"+String.valueOf(String.format(
				"%04d", (int) (Math.random()*10000)))+"-"+
				String.valueOf(String.format(
				"%04d", (int) (Math.random()*10000)));
		String userid = InitCommand.cmd.getData();
		InitCommand.cmd.setData(phoneNum+"/"+userid );
		MobileDAOImpl.getInstance().insertPhone(cmd);
		return null;
	}
	@Override
	public ResultMap findMobileById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
}
