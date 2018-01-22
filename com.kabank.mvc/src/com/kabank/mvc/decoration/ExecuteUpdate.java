package com.kabank.mvc.decoration;

import java.util.Map;

import com.kabank.mvc.command.ResultMap;

public class ExecuteUpdate extends QueryDecorator{
	public ExecuteUpdate(IQuery query) {
		super(query);
	}
	@Override
	public ResultMap execute() {
		return super.execute();
	}
}
