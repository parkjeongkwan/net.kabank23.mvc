package com.kabank.mvc.query.member;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class DeleteMemberQuery  implements IQuery{
	PreparedStatement pstmt;
	public DeleteMemberQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DML.DELETE+" "
							+DML.FROM+" "
							+Table.MEMBER+" "
							+DML.WHERE+" "
							+"id = '?'"
							);
				pstmt.setString(1, InitCommand.cmd.getData());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultMap execute() {
		int rs = 0;
		try {
			rs = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("결과 :"+rs);
		return null;
	}
}
