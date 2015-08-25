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
import com.zky.dao.Users1Dao;
import com.zky.pojo.Users1;



@Transactional
@Service
public class Users1DaoImpl implements Users1Dao {
	@Resource
	private SessionFactory sessionFactory;
	private List<Users1> list = new ArrayList<Users1>();

	
	public void save(Users1 users1) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(users1);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Users1> findAll2(String name) {

		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "from Users1 as muser where muser.username=?";
			Query query = session.createQuery(hql);
			query.setString(0, name);
			list = query.list();
			if (null == list || list.size() == 0) {
				System.out.print("没有");
			} else {
				System.out.print("正确");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Users1> findAll3(String name) {

		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "from Users1 as muser where muser.username=?";
			Query query = session.createQuery(hql);
			query.setString(0, name);
			list = query.list();
			if (null == list || list.size() == 0) {
				System.out.print("正确");
			} else {
				System.out.print("错误");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Users1> findAll() {
		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "from Users1";
			Query query = session.createQuery(hql);
			list = query.list();
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Users1> findAll1(String name, String psw) {
		Session session = sessionFactory.getCurrentSession();
		try {
			String hql = "from Users1 as muser where muser.username=? and muser.psw=?";
			Query query = session.createQuery(hql);
			query.setString(0, name);
			query.setString(1, psw);
			list = query.list();
			if (null == list || list.size() == 0) {
				System.out.print("没有");
			} else {
				System.out.print("正确");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} 
		return list;
	}

}
