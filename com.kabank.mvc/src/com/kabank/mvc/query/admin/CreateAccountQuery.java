package com.kabank.mvc.query.admin;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.enums.DDL;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class CreateAccountQuery   implements IQuery{
	PreparedStatement pstmt;
	public CreateAccountQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DDL.CREATE+" "
							+DDL.TABLE+" "
							+Table.ACCOUNT
							+"("
							+" customer_num decimal primary key, "	
							+" account_num varchar2(20), "
							+" money varchar2(20) default 0, "
							+" userid varchar2(20), "
							+" foreign key(userid) references member(userid) "
							+")");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultMap execute() {
		try {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
