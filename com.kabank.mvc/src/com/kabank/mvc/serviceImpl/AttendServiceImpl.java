package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.service.AccountService;
import com.kabank.mvc.service.AttendService;

public class AttendServiceImpl implements AttendService{
	public static AttendService getInstance() {
		return new AttendServiceImpl();
	}
	private AttendServiceImpl() {}
	@Override
	public ResultMap findAttendById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
}
