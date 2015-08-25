package com.zky.dao;

import java.util.List;

import com.zky.pojo.Orderss;

public interface OrderDao {
	public void save(Orderss order);
	public List<Orderss> tableList();

}
