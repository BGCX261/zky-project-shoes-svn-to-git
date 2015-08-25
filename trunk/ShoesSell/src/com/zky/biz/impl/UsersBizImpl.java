package com.zky.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.zky.biz.UsersBiz;
import com.zky.dao.Users1Dao;
import com.zky.pojo.Users1;

@Service
public class UsersBizImpl implements UsersBiz {
	@Resource
	private Users1Dao dao;

	public List<Users1> allUsers() {
		return dao.findAll();
	}

	public List<Users1> findAll1(String name, String psw) {
		return dao.findAll1(name, psw);
	}

}
