package com.common;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class BLoginTntercept implements Interceptor  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
		
	}

	public void init() {
		
		
	}

	public String intercept(ActionInvocation Invocation) throws Exception {
		String manager=(String)ActionContext.getContext().getSession().get("manager");
		if(manager!=null){
			return Invocation.invoke();
		}else{
			ActionContext.getContext().getSession().put("message", "你没有权限访问");
			return "false";
		}
		
	}

}
