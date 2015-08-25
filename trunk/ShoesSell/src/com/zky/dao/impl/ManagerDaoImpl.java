package com.zky.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zky.dao.ManagerDao;
import com.zky.pojo.Manager;

@Transactional
@Service
public class ManagerDaoImpl implements ManagerDao {
	@Resource
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Manager> findByLogin(String name, String psw) {
		Session session = sessionFactory.getCurrentSession();
		List<Manager> list=new ArrayList<Manager>();
		try {
			String hql = "from Manager as muser where muser.managername=? and muser.password=?";
			Query query = session.createQuery(hql);
			query.setString(0, name);
			query.setString(1, psw);
			 list = query.list();
			if (null == list || list.size() == 0) {
				System.out.print("用户名不存在");
			} else {
				System.out.print("登录");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
          return list;
	}

}
