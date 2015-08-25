package com.zky.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zky.pojo.Users1;

@Transactional
@Service
public class Aja1 {
	@Resource
	public SessionFactory sessionFactory;
	List<Users1> list = new ArrayList<Users1>();

	@SuppressWarnings("unchecked")
	public List<Users1> find(String name) {

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
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return list;

	}

}
