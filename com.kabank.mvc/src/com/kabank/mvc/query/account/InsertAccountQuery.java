package com.kabank.mvc.query.account;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.enums.AccountProps;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.factory.PropertiesFactory;

public class InsertAccountQuery  implements IQuery{
	PreparedStatement pstmt;
	public InsertAccountQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DML.INSERT+" "
							+DML.INTO+" "
							+Table.ACCOUNT+" "
							+"("
							+PropertiesFactory.create(AccountProps.values())
							+") "
							+DML.VALUES
							+"(customer_num.nextval,?,'0',?)");
			// customer_num.nextval, '1234-5678',0, 'kim' 
			String[] arr = InitCommand.cmd.getData().split("/");
			for(int i=0;i<arr.length;i++) {
				pstmt.setString((i+1), arr[i]);
				pstmt.addBatch();
				pstmt.clearParameters() ;
				if( (i % 10000) == 0){

				    // Batch 실행
				    pstmt.executeBatch() ;

				    // Batch 초기화
				    pstmt.clearBatch();

				    // 커밋

				    }
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
			e.printStackTrace();
		}
		return null;
	}
}
