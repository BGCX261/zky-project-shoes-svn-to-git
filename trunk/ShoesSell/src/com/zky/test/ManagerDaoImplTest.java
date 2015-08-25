package com.zky.test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zky.dao.ManagerDao;

public class ManagerDaoImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindByLogin() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		ManagerDao manager=(ManagerDao)ctx.getBean("managerDaoImpl");
		manager.findByLogin("linlin", "123");
	}

}
