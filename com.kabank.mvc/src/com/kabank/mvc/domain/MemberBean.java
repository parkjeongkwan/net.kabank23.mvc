package com.kabank.mvc.domain;

import lombok.Data;

@Data
public class MemberBean {
	private String userid,password,name,ssn,
				phone,email,profile,addr;
	private AccountBean account;
	private MobileBean mobile;
	private LottoBean lotto;
	private FoodBean food;


	@Override
	public String toString() {
		return "회원정보 [ID: " + userid + ", 비밀번호: " + password + ", 이름: " + name 
					+ ", 주민번호(생년월일-첫번째 번호): " + ssn + ", 전화번호: " + phone
				+ ", 이메일: " + email + ", 프로필사진: " 
					+ profile + ", 주소: " + addr + "]";
	}
	
	
}
