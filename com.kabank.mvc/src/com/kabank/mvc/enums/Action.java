package com.kabank.mvc.enums;

public enum Action {
	MOVE,ADD,LOGIN,JOIN,SEARCH,LEAVE_MEMBER,INSERT_MEMBER,
	OPEN_ACCOUNT,OPEN_PHONE,MYPAGE,LOGOUT,
	VIEW{
		@Override
		public String toString() {
			return "/WEB-INF/views/";
		}
	},
	EXTENSION{
		@Override
		public String toString() {
			return ".jsp";
		}
	},
	SEPARATOR{
		@Override
		public String toString() {
			return "/";
		}
	}
}
