package com.kabank.mvc.query.admin;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.enums.DDL;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.factory.PropertiesFactory;

public class CreateMemberQuery  implements IQuery{
	PreparedStatement pstmt;
	public CreateMemberQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DDL.CREATE+" "
							+DDL.TABLE+" "
							+Table.MEMBER
							+"("
							+" id VARCHAR2(20) PRIMARY KEY, "	
							+" pass VARCHAR2(20), "
							+" name VARCHAR2(20), "
							+" ssn VARCHAR2(20), "
							+" phone VARCHAR2(20), "
							+" email VARCHAR2(20), "
							+" profile VARCHAR2(20), "
							+" addr VARCHAR2(20) "
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
