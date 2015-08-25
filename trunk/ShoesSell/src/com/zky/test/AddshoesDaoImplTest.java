package com.zky.test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zky.dao.ShoesDao;
import com.zky.pojo.Shoe;

public class AddshoesDaoImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSave() {
		Shoe add=new Shoe();
		add.setBank("ÀîÄþ");
		add.setCid("#c0001");
		add.setImg("ddddddddddddddd");
		add.setName("Ä¾Ä¾");
		add.setNewprice(123);
		add.setOldprice(1234);
		add.setType("ÔË¶¯");
		//AddshoesDaoImpl ss=new AddshoesDaoImpl();
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		ShoesDao ss=(ShoesDao)ctx.getBean("addshoesDaoImpl");
		ss.save(add);
	}

}
