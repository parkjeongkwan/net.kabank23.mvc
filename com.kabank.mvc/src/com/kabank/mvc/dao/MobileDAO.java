package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.LottoBean;
import com.kabank.mvc.domain.MobileBean;

public interface MobileDAO {

	public ResultMap insertPhone(Command cmd);
	public ResultMap selectMobileById(Command cmd);
}
