package com.kabank.mvc.daoImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.AccountDAO;
import com.kabank.mvc.decoration.ExecuteUpdate;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.query.account.InsertAccountQuery;
import com.kabank.mvc.query.account.SelectAccountByIdQuery;

public class AccountDAOImpl implements AccountDAO{
	public static AccountDAO getInstance() {
		return new AccountDAOImpl();
	}
	private AccountDAOImpl() {}
	@Override
	public ResultMap insertAccount(Command cmd) {
		new ExecuteUpdate(new InsertAccountQuery(cmd)).execute();
		return null;
	}
	@Override
	public ResultMap selectAccountById(Command cmd) {
		return null;
	}
}
