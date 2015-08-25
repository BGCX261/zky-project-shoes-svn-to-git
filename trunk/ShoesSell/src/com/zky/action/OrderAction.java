package com.zky.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.common.Constant;
import com.common.Email;
import com.common.Pagination;
import com.zky.biz.JavaMailToolBiz;
import com.zky.biz.OrderBiz;
import com.zky.pojo.Orderss;


@Controller
public class OrderAction {
	@Resource
	private JavaMailToolBiz javaMail;
	@Resource
	private OrderBiz orderBiz;
	private Orderss order;
	private List<Orderss> list;
	public Pagination pagination;
	private int pageNo = 1;
	private int pageSize =4;
	private int showCount =6;
	

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

	public List<Orderss> getList() {
		return list;
	}

	public void setList(List<Orderss> list) {
		this.list = list;
	}

	public Orderss getOrder() {
		return order;
	}

	public void setOrder(Orderss order) {
		this.order = order;
	}

	public OrderBiz getOrderBiz() {
		return orderBiz;
	}

	public void setOrderBiz(OrderBiz orderBiz) {
		this.orderBiz = orderBiz;
	}

	public JavaMailToolBiz getJavaMail() {
		return javaMail;
	}

	public void setJavaMail(JavaMailToolBiz javaMail) {
		this.javaMail = javaMail;
	}
	
	public String saveOrder(){
		orderBiz.SaveOrder(order);
		Email email = new Email();
		String text = order.getOrderMsg()+"\n总金额："+order.getAmount()+"\n发货地址："+order.getAddress(); 
		email.setSmtpServSrc("smtp."+Constant.EMAIL_ADDRESS.substring(Constant.EMAIL_ADDRESS.indexOf("@")+1));
		email.setAddressSrc(Constant.EMAIL_ADDRESS);
		email.setAddressStd(order.getEmail());
		email.setUsernameSrc(Constant.EMAIL_USERNAME);
		email.setPasswordSrc(Constant.EMAIL_PASSWORD);
		email.setTitle("购物提醒");
		email.setContent(text);
		javaMail.appacheSimpleSend(email);
		HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession s = request.getSession();
		s.removeAttribute("kk");
		s.removeAttribute("num");
		return "success";
		
	}
	public String orderList(){
		List<Orderss> list1=orderBiz.tableList();
		pagination = new Pagination(pageNo, pageSize, list1.size(), showCount,
				"findTable.action", "pagenum");
		list = pagination.getPageDate(list1);
		return "success";
	}

}
