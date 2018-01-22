package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.FoodBean;
import com.kabank.mvc.domain.LottoBean;

public interface LottoDAO {
	public ResultMap selectLottoById(Command cmd);
}
