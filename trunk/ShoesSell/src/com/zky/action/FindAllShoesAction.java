package com.zky.action;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.common.Pagination;
import com.zky.biz.ShoesBiz;
import com.zky.pojo.Shoe;

@Controller
@Scope("prototype")
public class FindAllShoesAction {
	@Resource
	private ShoesBiz shoesbiz;
	private Shoe Shoe;
	private List<Shoe> list;
	private List<Shoe> list1;
	public Pagination pagination;
	private int pageNo = 1;
	private int pageSize =4;
	private int showCount =6;

	public int getPageNo() {
		return pageNo;
	}


	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public ShoesBiz getShoesbiz() {
		return shoesbiz;
	}


	public void setShoesbiz(ShoesBiz shoesbiz) {
		this.shoesbiz = shoesbiz;
	}


	public Shoe getShoe() {
		return Shoe;
	}


	public void setShoe(Shoe shoe) {
		Shoe = shoe;
	}


	public List<Shoe> getList() {
		return list;
	}


	public void setList(List<Shoe> list) {
		this.list = list;
	}


	public List<Shoe> getList1() {
		return list1;
	}


	public void setList1(List<Shoe> list1) {
		this.list1 = list1;
	}


	public Pagination getPagination() {
		return pagination;
	}


	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public String findshoes() {
		List<Shoe> all = shoesbiz.findshoes(list);
		pagination = new Pagination(pageNo, pageSize, all.size(), showCount,
				"find.action", "pagenum");
		list1 = pagination.getPageDate(all);
		return "success";

	}

}
