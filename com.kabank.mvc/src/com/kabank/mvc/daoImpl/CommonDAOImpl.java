package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.CommonDAO;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.constant.*;
import java.sql.*;

public class CommonDAOImpl implements CommonDAO{
	
	@Override
	public ResultMap selectTableCount(Command cmd) {
		String count = "";
		
		try {
			Class.forName(DBMS.ORACLE_DRIVER);
			Connection conn = 
					DriverManager
						.getConnection(
								DBMS.ORACLE_CONNECTION_URL,
								DBMS.ORACLE_USERNAME,
								DBMS.ORACLE_PASSWORD);
			Statement stmt = conn.createStatement();
			
			ResultSet rs = null;
			while(rs.next()) {
				count = rs.getString("count");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
