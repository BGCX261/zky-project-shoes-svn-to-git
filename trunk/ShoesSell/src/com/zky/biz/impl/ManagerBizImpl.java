package com.zky.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zky.biz.ManagerBiz;
import com.zky.dao.ManagerDao;

@Service
public class ManagerBizImpl implements ManagerBiz{
	@Resource
	private ManagerDao managerdao;
	public ManagerDao getManagerdao() {
		return managerdao;
	}

	public void setManagerdao(ManagerDao managerdao) {
		this.managerdao = managerdao;
	}

	public Boolean register(String name, String password) {
		if (managerdao.findByLogin(name, password).size() == 0
				|| managerdao.findByLogin(name, password) == null) {
			return true;
		} else {
			return false;
		}

	}

	
}
