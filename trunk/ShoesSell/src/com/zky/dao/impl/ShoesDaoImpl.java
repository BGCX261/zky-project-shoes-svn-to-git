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
import com.zky.dao.ShoesDao;
import com.zky.pojo.Shoe;


@Transactional
@Service
public class ShoesDaoImpl implements ShoesDao {
	@Resource
	private SessionFactory sessionFactory;
	 

	public void save(Shoe shoes) {

		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(shoes);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Shoe> findAll() {
		List<Shoe> list = new ArrayList<Shoe>();
		try {
			Session session = sessionFactory.getCurrentSession();

			String hql = "from Shoe";
			Query query = session.createQuery(hql);
			list = query.list();
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return list;
	}

	public Shoe findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Shoe shoe = (Shoe) session.createQuery(
				"from Shoe s where s.id='" + id + "'").uniqueResult();
		return shoe;
	}

	public void update(Shoe shoes) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.update(shoes);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Shoe shoes = (Shoe)session.get(Shoe.class, id);
		session.delete(shoes);
	}

	@SuppressWarnings("unchecked")
	public List<Shoe> findAll(String type) {
		List<Shoe> list = new ArrayList<Shoe>();
		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "from Shoe s where s.type='" + type + "'";
			Query query = session.createQuery(hql);
			list = query.list();
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Shoe> search(String name) {

		List<Shoe> list = new ArrayList<Shoe>();
		try {
			Session session = sessionFactory.getCurrentSession();
			String hql = "from Shoe s where s.name like'"+ '%' + name + '%'+"'";
			Query query = session.createQuery(hql);
			list = query.list();
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return list;
	}
	
}
