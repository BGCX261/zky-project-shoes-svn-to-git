package com.zky.dao;

import java.util.List;

import com.zky.pojo.Users1;



public interface Users1Dao {

	public void save(Users1 users1);
	public List<Users1> findAll2(String name);
	public List<Users1> findAll3(String name);
	public List<Users1> findAll();
	public List<Users1> findAll1(String name, String psw);
	

}