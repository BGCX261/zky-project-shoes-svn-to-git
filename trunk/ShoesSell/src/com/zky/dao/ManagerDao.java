package com.zky.dao;

import java.util.List;

import com.zky.pojo.Manager;


public interface ManagerDao {
	public List<Manager> findByLogin(String name, String psw);

}
