package com.zky.test;



import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zky.dao.OrderDao;
import com.zky.pojo.Orderss;

public class OrderDaoImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTableList() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		OrderDao s=(OrderDao)ctx.getBean("orderDaoImpl");
		List<Orderss> list=s.tableList();
		for(Orderss order:list){
			System.out.println(order.getEmail());
		}
		
		
	}

}
