package com.zky.test;



import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zky.biz.ShoesBiz;
import com.zky.pojo.Shoe;

public class ShoesBizImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEditshoes() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		ShoesBiz shoesbiz=(ShoesBiz)ctx.getBean("shoesBizImpl");
		Shoe shoe=shoesbiz.editshoes(7);
		System.out.print(shoe.getName());
	}

}
