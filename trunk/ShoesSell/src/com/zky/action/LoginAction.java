package com.zky.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.zky.biz.Iregister;
import com.zky.pojo.Users1;

@Controller
@Scope("prototype")
public class LoginAction {
	@Resource
	private Iregister register;
	@Resource
	private Users1 users;
	private String username;
	private String password;
	private String email;
	private String verifyCode;

	public Users1 getUsers() {
		return users;
	}

	public void setUsers(Users1 users) {
		this.users = users;
	}

	public Iregister getRegister() {
		return register;
	}

	public void setRegister(Iregister register) {
		this.register = register;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String register() {
		HttpServletRequest request = ServletActionContext.getRequest();
		// HttpServletRequest session = ServletActionContext.getRequest();
		HttpSession s = request.getSession();
		String num = (String) s.getAttribute("rand");
		if (register.register(username) && verifyCode.equals(num)) {
			users.setUsername(username);
			users.setPsw(password);
			users.setEmail(email);
			register.add(users);
			s.setAttribute("username",username);
			return "success";
		} else {
			return "false";
		}
	}

}
