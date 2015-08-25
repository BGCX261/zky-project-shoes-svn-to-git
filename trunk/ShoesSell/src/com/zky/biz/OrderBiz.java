package com.zky.biz;

import java.util.List;

import com.zky.pojo.Orderss;

public interface OrderBiz {
	public void SaveOrder(Orderss order);
	public List<Orderss> tableList();

}
