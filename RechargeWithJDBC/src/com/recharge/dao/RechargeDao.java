package com.recharge.dao;

import java.util.HashMap;

import com.recharge.bean.Recharge;

public class RechargeDao implements RechargeDaoI{
	HashMap hm = new HashMap();

	public RechargeDao() {
		Recharge r = new Recharge(1024,200);
		hm.put("shubham", r);
	}

	public Recharge display(String name) {
		Recharge rec=null;
		if(name!=null) {
			rec=(Recharge)hm.get(name);
		}
		// TODO Auto-generated method stub
		return rec;
	}
	
}
