package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.AttendBean;

public interface AttendDAO {
	public ResultMap selectAttendById(Command cmd);
}
