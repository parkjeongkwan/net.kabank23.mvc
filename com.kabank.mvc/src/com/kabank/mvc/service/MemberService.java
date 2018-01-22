package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.IOrder;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;

public interface MemberService {
	public ResultMap  addMember(Command cmd);
	public ResultMap  findMemberById(Command cmd);
	public ResultMap  login(Command cmd);
	public ResultMap  deleteMember(Command cmd);
	

}
