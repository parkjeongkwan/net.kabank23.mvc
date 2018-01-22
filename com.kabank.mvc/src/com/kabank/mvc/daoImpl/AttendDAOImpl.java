package com.kabank.mvc.daoImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.AttendDAO;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.domain.AttendBean;

public class AttendDAOImpl implements AttendDAO{
	public static AttendDAO getInstance() {
		return new AttendDAOImpl();
	}
	private AttendDAOImpl() {}
	@Override
	public ResultMap selectAttendById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
}
