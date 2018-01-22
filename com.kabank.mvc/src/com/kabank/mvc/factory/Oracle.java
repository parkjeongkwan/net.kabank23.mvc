package com.kabank.mvc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.kabank.mvc.enums.OracleProps;

public class Oracle implements IDatabase {
	private Connection conn;
	private String driver,url,username,password;
	
	public Oracle() {
		this.driver = OracleProps.ORACLE_DRIVER.getValue();
		this.url = OracleProps.ORACLE_CONNECTION_URL.getValue();
		this.username = OracleProps.ORACLE_USERNAME.getValue();
		this.password = OracleProps.ORACLE_PASSWORD.getValue();
	}

	@Override
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
