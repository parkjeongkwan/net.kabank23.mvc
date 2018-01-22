package com.kabank.mvc.query.member;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.decoration.IQuery;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.DML;
import com.kabank.mvc.enums.MemberProps;
import com.kabank.mvc.enums.Table;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.factory.PropertiesFactory;

public class SelectMemberByIdQuery  implements IQuery{
	PreparedStatement pstmt;
	public SelectMemberByIdQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DML.SELECT
							+" "
							+PropertiesFactory.create(MemberProps.values())
							+" "
							+DML.FROM
							+" "
							+Table.MEMBER
							+" "
							+DML.WHERE
							+" id LIKE '?'");
				pstmt.setString(1, InitCommand.cmd.getData());
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public ResultMap execute() {
		ResultSet rs;
		MemberBean member = null;
			try {
				rs = pstmt.executeQuery();
				while (rs.next()) {
					member = new MemberBean();
					member.setUserid(rs.getString(MemberProps.USERID.toString()));
					member.setPassword(rs.getString(MemberProps.PASSWORD.toString()));
					member.setName(rs.getString(MemberProps.NAME.toString()));
					member.setEmail(rs.getString(MemberProps.EMAIL.toString()));
					member.setAddr(rs.getString(MemberProps.ADDR.toString()));
					member.setPhone(rs.getString(MemberProps.PHONE.toString()));
					member.setSsn(rs.getString(MemberProps.SSN.toString()));
					member.setProfile(rs.getString(MemberProps.PROFILE.toString()));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
}