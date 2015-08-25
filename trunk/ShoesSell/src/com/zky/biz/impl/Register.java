package com.zky.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zky.biz.Iregister;
import com.zky.dao.Users1Dao;
import com.zky.pojo.Users1;
@Service
public class Register implements Iregister {
	@Resource
	private Users1Dao users1Dao;

	public Users1Dao getUsers1Dao() {
		return users1Dao;
	}

	public void setUsers1Dao(Users1Dao users1Dao) {
		this.users1Dao = users1Dao;
	}

	public Boolean register(String name) {
		if (users1Dao.findAll3(name).size() == 0
				|| users1Dao.findAll3(name) == null) {
			return true;
		} else {
			return false;
		}

	}

	public void add(Users1 users1) {
		users1Dao.save(users1);

	}

}
