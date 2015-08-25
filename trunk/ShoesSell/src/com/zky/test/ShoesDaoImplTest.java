package com.zky.test;



import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zky.dao.ShoesDao;
import com.zky.pojo.Shoe;

public class ShoesDaoImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindAllString() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ShoesDao s=(ShoesDao)ctx.getBean("shoesDaoImpl");
		List<Shoe> list=s.findAll("ÐÝÏÐÐ¬");
		for(Shoe shoe:list){
			System.out.println(shoe.getName());
		}
		
	}

}
