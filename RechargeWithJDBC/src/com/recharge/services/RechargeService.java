package com.recharge.services;

import com.recharge.bean.Recharge;
import com.recharge.dao.RechargeDao;

public class RechargeService {
	RechargeDao dao=new RechargeDao();
	public Recharge display(String name) {
		Recharge r= dao.display();
		return r;
	}
}
