package com.zky.action;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zky.biz.ManagerBiz;
import com.zky.pojo.Manager;
@Controller

public class ManagerAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource
	private  ManagerBiz managerbiz;
	private  Manager manager;
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	private String verify;

	public ManagerBiz getManagerbiz() {
		return managerbiz;
	}

	public void setManagerbiz(ManagerBiz managerbiz) {
		this.managerbiz = managerbiz;
	}


	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	public String login() {
		/*
		 * HttpServletRequest request = ServletActionContext.getRequest();
		 * ActionContext ctx = ActionContext.getContext(); HttpSession s =
		 * request.getSession(); (String) s.getAttribute("rand");
		 */
		ActionContext ctx = ActionContext.getContext();
		String num = (String) ctx.getSession().get("rand");
		if (managerbiz.register(manager.getManagername(), manager.getPassword())
				|| num.equals(verify) == false) {
			return "false";
		} else {
			ctx.getSession().put("manager", manager.getManagername());
			return "success";
		}

	}

}
