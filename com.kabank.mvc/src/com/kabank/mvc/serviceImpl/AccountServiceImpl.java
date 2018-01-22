package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.daoImpl.AccountDAOImpl;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.service.AccountService;

public class AccountServiceImpl implements AccountService{
	public static AccountService getInstance() {
		return new AccountServiceImpl();
	}
	private AccountServiceImpl() {}
	@Override
	public ResultMap openAccount(Command cmd) {
		InitCommand.cmd.setData(String.valueOf(String.format("%04d", (int) (Math.random()*10000)))+"-"+
				String.valueOf(String.format("%04d", (int) (Math.random()*10000)))+"-"+
				String.valueOf(String.format("%04d", (int) (Math.random()*10000))) + "/" 
					+ cmd.getMember().getUserid());
		AccountDAOImpl.getInstance().insertAccount(cmd);
		return null;
	}
	@Override
	public ResultMap findAccountById(Command cmd) {
		return AccountDAOImpl.getInstance()
				.selectAccountById(cmd);
	}
}
