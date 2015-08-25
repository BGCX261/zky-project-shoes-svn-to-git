package com.zky.pojo;

/**
 * Orderss entity. @author MyEclipse Persistence Tools
 */

public class Orderss implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String memo;
	private String orderMsg;
	private String email;
	private String address;
	private Integer amount;
	private String orderId;

	// Constructors

	/** default constructor */
	public Orderss() {
	}

	/** minimal constructor */
	public Orderss(String orderId) {
		this.orderId = orderId;
	}

	/** full constructor */
	public Orderss(String memo, String orderMsg, String email, String address,
			Integer amount, String orderId) {
		this.memo = memo;
		this.orderMsg = orderMsg;
		this.email = email;
		this.address = address;
		this.amount = amount;
		this.orderId = orderId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderMsg() {
		return this.orderMsg;
	}

	public void setOrderMsg(String orderMsg) {
		this.orderMsg = orderMsg;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}