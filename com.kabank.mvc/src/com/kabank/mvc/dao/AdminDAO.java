package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.enums.Table;

public interface AdminDAO {

	public ResultMap createTable(Command cmd);

}
