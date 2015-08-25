package com.zky.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.zky.biz.OrderBiz;
import com.zky.dao.OrderDao;
import com.zky.pojo.Orderss;
@Service
public class OrderBizImpl implements OrderBiz {
	@Resource
	private OrderDao orderDao;

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void SaveOrder(Orderss order) {
		orderDao.save(order);
	}
	public List<Orderss> tableList(){
		return orderDao.tableList();
	}

}
