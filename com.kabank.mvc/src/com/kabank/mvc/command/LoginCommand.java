package com.kabank.mvc.command;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import com.kabank.mvc.iterator.ParamsIterator;

public class LoginCommand implements IOrder{
	Map<?,?> map;
	public LoginCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
	}
	@Override
	public void execute() {
		String userid = String.valueOf(map.get("userid"));
		String password = String.valueOf(map.get("password"));
		InitCommand.cmd.setData(userid+"/"+password);
	}
}
