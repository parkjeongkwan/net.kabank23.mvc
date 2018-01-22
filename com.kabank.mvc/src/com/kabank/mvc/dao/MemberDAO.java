package com.kabank.mvc.dao;

import java.util.List;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.IOrder;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;

public interface MemberDAO {
	public ResultMap selectMembers(Command cmd);
	public ResultMap selectMemberById(Command cmd);
	public ResultMap login(Command cmd);
	public ResultMap deleteMember(Command cmd);
	public ResultMap insertMember(Command cmd);
	
}
