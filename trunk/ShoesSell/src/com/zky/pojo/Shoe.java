package com.zky.pojo;

import org.springframework.stereotype.Controller;

/**
 * Shoe entity. @author MyEclipse Persistence Tools
 */
@Controller
public class Shoe implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Integer newprice;
	private String cid;
	private String type;
	private String name;
	private Integer oldprice;
	private String img;
	private String bank;

	// Constructors

	/** default constructor */
	public Shoe() {
	}

	/** full constructor */
	public Shoe(Integer newprice, String cid, String type, String name,
			Integer oldprice, String img, String bank) {
		this.newprice = newprice;
		this.cid = cid;
		this.type = type;
		this.name = name;
		this.oldprice = oldprice;
		this.img = img;
		this.bank = bank;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNewprice() {
		return this.newprice;
	}

	public void setNewprice(Integer newprice) {
		this.newprice = newprice;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOldprice() {
		return this.oldprice;
	}

	public void setOldprice(Integer oldprice) {
		this.oldprice = oldprice;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

}