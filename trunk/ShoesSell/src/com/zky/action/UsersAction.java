package com.zky.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.common.Pagination;
import com.opensymphony.xwork2.ActionContext;
import com.zky.biz.UsersBiz;
import com.zky.pojo.Users1;

@Controller
@Scope("prototype")
public class UsersAction {
	@Resource
	private UsersBiz users;
	private Pagination pagination;
	private int pageNo = 1;
	private int pageSize = 6;
	private int showCount = 6;
	private List<Users1> list;
	private String username;
	private String password;
	private String verify;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public UsersBiz getUsers() {
		return users;
	}

	public void setUsers(UsersBiz users) {
		this.users = users;
	}

	public List<Users1> getList() {
		return list;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public void setList(List<Users1> list) {
		this.list = list;
	}

	public String findusers() {
		List<Users1> all = users.allUsers();
		pagination = new Pagination(pageNo, pageSize, all.size(), showCount,
				"allusers.action", "pagenum");
		list = pagination.getPageDate(all);
		// list=users.allUsers();
		return "success";
	}
	
	public String checkingUser(){
		ActionContext ctx=ActionContext.getContext();
		String rand=(String)ctx.getSession().get("rand");
		list=users.findAll1(username, password);
		if(list.size()!=0 && rand.equals(verify) ){
			ctx.getSession().put("username",username );
			return "success";
		}else{
			return "false";
		}
		
		
	}


}
