package com.kabank.mvc.query.account;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.AccountProps;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class SelectAccountByIdQuery implements IQuery{
	PreparedStatement pstmt;
	public SelectAccountByIdQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DML.SELECT
							+"account_num,"
							+"customer_num,"
							+"money "
							+DML.FROM
							+" account  "
							+DML.WHERE
							+" and userid LIKE ?");
			
				pstmt.setString(1, InitCommand.cmd.getData());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ResultMap execute() {
		MemberBean member = null;
		AccountBean account = null;
		try {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				member = new MemberBean();
				account = new AccountBean();
				member.setUserid(rs.getString(MemberProps.USERID.toString()));
				member.setPassword(rs.getString(MemberProps.PASSWORD.toString()));
				member.setName(rs.getString(MemberProps.NAME.toString()));
				member.setEmail(rs.getString(MemberProps.EMAIL.toString()));
				member.setAddr(rs.getString(MemberProps.ADDR.toString()));
				member.setPhone(rs.getString(MemberProps.PHONE.toString()));
				member.setSsn(rs.getString(MemberProps.SSN.toString()));
				member.setProfile(rs.getString(MemberProps.PROFILE.toString()));
				account.setAccountNum(rs.getString(AccountProps.ACCOUNT_NUM.toString()));
				account.setCustomerNum(rs.getString(AccountProps.CUSTOMER_NUM.toString()));
				account.setMoney(rs.getString(AccountProps.MONEY.toString()));
				member.setAccount(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
