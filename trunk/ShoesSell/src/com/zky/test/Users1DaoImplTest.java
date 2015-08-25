package com.zky.test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zky.dao.Users1Dao;

public class Users1DaoImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindAll1() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Users1Dao ss=(Users1Dao)ctx.getBean("users1DaoImpl");
		ss.findAll1("mumu", "123");
	}

}
