package com.kabank.mvc.query.member;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

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
import com.kabank.mvc.template.Conn;

public class LoginQuery implements IQuery{
	PreparedStatement pstmt;
	public LoginQuery(Command cmd) {
		try {
			pstmt = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.prepareStatement(
							DML.SELECT
							+" "
							+" userid,"
							+" password,"
							+" name,"
							+" ssn,"
							+" phone,"
							+" email,"
							+" profile,"
							+" addr "
							+DML.FROM
							+" Member  "
							+DML.WHERE
							+" userid LIKE ? AND password LIKE ?");
			System.out.println("DAO ID:"+cmd.getMember().getUserid());
			System.out.println("DAO ID:"+cmd.getMember().getPassword());
				pstmt.setString(1, cmd.getMember().getUserid());
				pstmt.setString(2, cmd.getMember().getPassword());
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	@Override
	public ResultMap execute() {
		ResultMap rm = new ResultMap();
		MemberBean member = null;
		ResultSet rs = null;
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
		}finally {
			Conn.close(rs);
		}
		if(!member.getUserid().equals("")) {
			rm.setSuccess(true);
			rm.setMember(member);
		}else {
			rm.setSuccess(false);
		}
		
		return rm;
	}
}
