package com.zky.test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zky.biz.impl.Aja1;

public class Aja1Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFind() {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		Aja1 ss=(Aja1) ctx.getBean("aja1");
		ss.find("Ä¾Ä¾Óë");
	}

}
