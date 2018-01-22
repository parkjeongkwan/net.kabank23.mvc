package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.daoImpl.AdminDAOImpl;
import com.kabank.mvc.enums.DDL;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.service.AdminService;

public class AdminServiceImpl implements AdminService {
	public static AdminService getInstance() {
		return new AdminServiceImpl();
	}
	private AdminServiceImpl() {}
	@Override
	public ResultMap makeTable(Command cmd) {
		AdminDAOImpl.getInstance().createTable(cmd);
		return null;
	}
}
