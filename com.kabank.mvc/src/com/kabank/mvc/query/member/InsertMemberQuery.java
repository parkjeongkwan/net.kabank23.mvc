package com.kabank.mvc.query.member;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.factory.PropertiesFactory;

public class InsertMemberQuery implements IQuery{
	PreparedStatement pstmt;
	public InsertMemberQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DML.INSERT+" "
							+DML.INTO+" "
							+Table.MEMBER+" "
							+"("
							+PropertiesFactory.create(MemberProps.values())
							+") "
							+DML.VALUES
							+"(?,?,?,?,?,?,?,'default-profile.jpg')");
			String[] arr = InitCommand.cmd.getData().split("/");
			for(int i=0;i<arr.length-1;i++) {
				pstmt.setString((i+1), arr[i]);
			}
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
