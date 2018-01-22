package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.enums.Table;

public interface AdminService {

	public ResultMap makeTable(Command cmd);

}
