package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.domain.FoodBean;

public interface FoodDAO {
	public ResultMap selectFoodById(Command cmd);
}
