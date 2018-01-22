package com.kabank.mvc.query.mobile;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.enums.MobileProps;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.factory.PropertiesFactory;

public class InsertMobileQuery  implements IQuery{
	PreparedStatement pstmt;
	public InsertMobileQuery(Command cmd) {
		System.out.println("모바일 쿼리 엔트");
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DML.INSERT+" "
							+DML.INTO+" "
							+Table.MOBILE+" "
							+"("
							+PropertiesFactory.create(MobileProps.values())
							+") "
							+DML.VALUES
							+"(customer_num.nextval,?,sysdate,?)");
			String[] arr = InitCommand.cmd.getData().split("/");
			for(int i=0;i<arr.length;i++) {
				pstmt.setString((i+1), arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultMap execute() {
		try {
			System.out.println("=======폰 개통 실행========");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
