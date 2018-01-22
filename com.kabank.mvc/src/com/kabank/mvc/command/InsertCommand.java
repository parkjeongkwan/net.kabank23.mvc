package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.kabank.mvc.iterator.ParamsIterator;

public class InsertCommand implements IOrder {
	Map<?,?> map;
	public InsertCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
	}
	@Override
	public void execute() {
		String id = String.valueOf(map.get("id"));
		String pass = String.valueOf(map.get("pass"));
		String ssn = String.valueOf(map.get("ssn"));
		String name = String.valueOf(map.get("name"));
		String addr = String.valueOf(map.get("addr"));
		String profile = String.valueOf(map.get("profile"));
		String phone = String.valueOf(map.get("phone"));
		String email = String.valueOf(map.get("email"));
		InitCommand.cmd.setData(
						id+"/"+
						pass+"/"+
						ssn+"/"+
						name+"/"+
						addr+"/"+
						profile+"/"+
						phone+"/"+
						email
		);
		
	}

}
