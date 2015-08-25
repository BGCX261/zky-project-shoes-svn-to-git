package com.zky.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.common.BuyItem;
import com.opensymphony.xwork2.ActionContext;
import com.zky.biz.ShoesBiz;


@Controller
public class ButCartAction {
	@Resource
	private ShoesBiz shoeBiz;
	private SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd-hhmmss");
	private Date date=new Date();
	String da = ss.format(date);
	private int id;
	
	private String orderId="order"+ da;
	
	private String orderMsg;

	private String orderMsg1;	
	
	private List<BuyItem> items;
	
	private int totals;
	
	private int num1;
	
	
	

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	private ActionContext s ;
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderMsg() {
		return orderMsg;
	}

	public void setOrderMsg(String orderMsg) {
		this.orderMsg = orderMsg;
	}

	public String getOrderMsg1() {
		return orderMsg1;
	}

	public void setOrderMsg1(String orderMsg1) {
		this.orderMsg1 = orderMsg1;
	}
	


	public ShoesBiz getShoeBiz() {
		return shoeBiz;
	}

	public void setShoeBiz(ShoesBiz shoeBiz) {
		this.shoeBiz = shoeBiz;
	}

	public ActionContext getS() {
		return s;
	}

	public void setS(ActionContext s) {
		this.s = s;
	}

	public int getTotals() {
		return totals;
	}

	public void setTotals(int totals) {
		this.totals = totals;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<BuyItem> getItems() {
		return items;
	}

	public void setItems(List<BuyItem> items) {
		this.items = items;
	}

	@SuppressWarnings("unchecked")
	public String addShoes() {
		int total=0;
		int number=0;
		s = ActionContext.getContext();
		items = (List<BuyItem>) s.getSession().get("kk");
		if(s.getSession().get("num")==null){
			num1=0;
		}else{
			num1=(Integer)s.getSession().get("num");
		}
		
		if (items == null) {
			items = new ArrayList<BuyItem>();
			BuyItem buyItem = new BuyItem();
			buyItem.setShoe(shoeBiz.findshoes(id));
			buyItem.setAmount(1);
			total=buyItem.getShoe().getNewprice();
			number=buyItem.getAmount();
			num1=number+num1;
			totals=total+totals;
			items.add(buyItem);
			System.out.print(items);
		} else {
			boolean is = false;
			BuyItem buyItem1 = new BuyItem();
			for (int i = 0; i < items.size(); i++) {
				buyItem1 = items.get(i);
				if (buyItem1.getShoe().getId() == id) {
					buyItem1.setAmount(buyItem1.getAmount() + 1);
					total=buyItem1.getShoe().getNewprice()*1;
					number=buyItem1.getAmount();
					num1=num1+1;
					totals=total+totals;
					items.set(i, buyItem1);
					is = true;
					System.out.print("叠加");
					break;
				}
			}
			if (!is) {
				BuyItem buyItem = new BuyItem();
				buyItem.setAmount(1);
				buyItem.setShoe(shoeBiz.findshoes(id));
				number=buyItem.getAmount();
				num1=number+num1;
				total=buyItem.getShoe().getNewprice()*1;
				totals=total+totals;
				System.out.println("不相同");
				items.add(buyItem);
			}
		}
		s.getSession().put("kk", items);
		s.getSession().put("num", num1);
		System.out.println("num="+num1);
		//new BuyItem().setAllprice(totals);
		return "success";
	}
	
	@SuppressWarnings("unchecked")
	public String delShoes() {
		s = ActionContext.getContext();
		String username=(String)s.getSession().get("username");
		
		orderMsg = "尊敬的" + username+"，您好，您的定单信息如下：<br />";
		orderMsg1 = "尊敬的"+username+"，您好，您的定单信息如下：\n";
		items = (List<BuyItem>) s.getSession().get("kk");
		int num1=(Integer)s.getSession().get("num");
		for (BuyItem i : items) {
			if (i.getShoe().getId() == id) {
				items.remove(i);
				totals = totals - (i.getShoe().getNewprice() * i.getAmount());
				num1=num1-(i.getAmount());
				break;
			}
		}
		for (BuyItem i : items) {
			orderMsg = orderMsg + i.getShoe().getName() + "," + i.getAmount()
					+ "件<br />";
			orderMsg1 = orderMsg + i.getShoe().getName() + "," + i.getAmount()
					+ "件\n";
		}
		if(num1==0){
			s.getSession().put("num", null);
		}else{
			s.getSession().put("num", num1);
		}
		System.out.println("num="+num1);
		
		return "success";
	}
	@SuppressWarnings("unchecked")
	public String updateShoes() {
		
		s = ActionContext.getContext();
		String username=(String)s.getSession().get("username");
		HttpServletRequest request = ServletActionContext.getRequest();
		int num = Integer.parseInt(request.getParameter("num"));
		//int num1=(Integer)s.getSession().get("num1");
		int num1=0;
		items = (List<BuyItem>) s.getSession().get("kk");
		int total = 0;
		orderMsg = "尊敬的" +username+ "，您好，您的定单信息如下：<br />";
		orderMsg1 = "尊敬的" +username+"，您好，您的定单信息如下：\n";
		for (BuyItem i : items) {
			if (i.getShoe().getId() == id) {
				i.setAmount(num);
				System.out.println(num);
			}
			num1=num1+i.getAmount();
			total = total + i.getAmount() * i.getShoe().getNewprice();
			orderMsg = orderMsg + i.getShoe().getName() + "," + i.getAmount()
					+ "件<br />";
			orderMsg1 = orderMsg + i.getShoe().getName() + "," + i.getAmount()
					+ "件\n";
			System.out.println(total);
			
		}
		s.getSession().put("num", num1);
		s.getSession().put("kk", items);
		totals = total;
		System.out.println("总价格" + totals);
		System.out.println("num="+num1);
		return "success";
	}
	
	@SuppressWarnings("unchecked")
	public String orderTable() {
		String username=(String)s.getSession().get("username");
		int total = 0;
		int num1=0;
		orderMsg = "尊敬的" + username+"，您好，您的定单信息如下：<br />";
		orderMsg1 = "尊敬的" +username+ "，您好，您的定单信息如下：\n";
		items = (List<BuyItem>) s.getSession().get("kk");
		for (BuyItem i : items) {
			num1=num1+i.getAmount();
			total = total + i.getAmount() * i.getShoe().getNewprice();
			orderMsg = orderMsg + i.getShoe().getName() + "," + i.getAmount()
					+ "件<br />";
			orderMsg1 = orderMsg + i.getShoe().getName() + "," + i.getAmount()
					+ "件\n";
			System.out.println(total);
		}
		totals = total;
		System.out.println("num="+num1);
		s.getSession().put("num", num1);
		return "success";

	}

}
