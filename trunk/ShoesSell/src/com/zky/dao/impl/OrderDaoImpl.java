package com.zky.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zky.dao.OrderDao;
import com.zky.pojo.Orderss;
@Transactional
@Service
public class OrderDaoImpl implements OrderDao{
	@Resource
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Orderss order) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(order);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public List<Orderss> tableList(){
		List<Orderss> list=new ArrayList<Orderss>();
		try {
			Session session = sessionFactory.getCurrentSession();
			String hql="from Orderss";
			Query query = session.createQuery(hql);
			list=query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
