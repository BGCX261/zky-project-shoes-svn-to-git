package com.zky.pojo;

import org.springframework.stereotype.Controller;

/**
 * Users1 entity. @author MyEclipse Persistence Tools
 */
@Controller
public class Users1 implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String email;
	private String psw;
	private String username;

	// Constructors

	/** default constructor */
	public Users1() {
	}

	/** full constructor */
	public Users1(String email, String psw, String username) {
		this.email = email;
		this.psw = psw;
		this.username = username;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}