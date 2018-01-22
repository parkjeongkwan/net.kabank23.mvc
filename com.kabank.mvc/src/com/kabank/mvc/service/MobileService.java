package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.MobileBean;

public interface MobileService {

	public ResultMap openPhone(Command cmd);
	public ResultMap findMobileById(Command cmd);

}
