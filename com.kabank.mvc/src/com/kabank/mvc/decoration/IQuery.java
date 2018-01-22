package com.kabank.mvc.decoration;

import com.kabank.mvc.command.ResultMap;

public interface IQuery {
	public abstract ResultMap execute();
}
