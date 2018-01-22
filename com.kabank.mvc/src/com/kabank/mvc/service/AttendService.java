package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AttendBean;

public interface AttendService{
	public ResultMap findAttendById(Command cmd);
}
