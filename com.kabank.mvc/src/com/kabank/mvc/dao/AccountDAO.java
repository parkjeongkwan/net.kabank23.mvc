package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;

public interface AccountDAO {

	public ResultMap insertAccount(Command cmd);
	public ResultMap selectAccountById(Command cmd);
}
