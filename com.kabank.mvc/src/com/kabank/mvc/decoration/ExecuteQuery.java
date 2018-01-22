package com.kabank.mvc.decoration;

import com.kabank.mvc.command.ResultMap;

public class ExecuteQuery extends QueryDecorator{
	public ExecuteQuery(IQuery query) {
		super(query);
	}
	@Override
	public ResultMap execute() {
		return super.execute();
	}
}
