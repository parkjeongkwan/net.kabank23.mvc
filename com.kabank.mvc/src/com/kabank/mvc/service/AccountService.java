package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;

public interface AccountService {

	public ResultMap openAccount(Command cmd);
	public ResultMap findAccountById(Command cmd);
}
