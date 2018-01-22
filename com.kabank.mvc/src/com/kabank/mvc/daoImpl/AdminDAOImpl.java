package com.kabank.mvc.daoImpl;
import java.sql.*;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.constant.DBMS;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.enums.Table;
public class AdminDAOImpl implements AdminDAO {
	public static AdminDAO getInstance() {
		return new AdminDAOImpl();
	}
	private AdminDAOImpl() {}

	@Override
	public ResultMap createTable(Command cmd) {
		switch (cmd.getTable()) {
		case MEMBER:
			break;
		case MOBILE:
			break;
		default:
			break;
		}
		return null;
	}
}
