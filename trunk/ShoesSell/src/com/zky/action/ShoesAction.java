package com.zky.action;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionContext;
import com.zky.biz.ShoesBiz;
import com.zky.pojo.Shoe;


@Controller
public class ShoesAction {
	@Resource
	private ShoesBiz addshoe;
	@Resource
	private Shoe add;
	private File uploadImage;// �ϴ����ļ�
	private String uploadImageFileName;// �ϴ����ļ���
	private String uploadImageContentType;// �ϴ����ļ�����
	private String uploadFileName;
	private String name;
	private String bank;
	private String type;
	private String cid;
	private String oldprice;
	private String newprice;
	private int id;
	private String search;
	private List<Shoe> list;
	private List<Shoe> list1;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getOldprice() {
		return oldprice;
	}

	public void setOldprice(String oldprice) {
		this.oldprice = oldprice;
	}

	public String getNewprice() {
		return newprice;
	}

	public void setNewprice(String newprice) {
		this.newprice = newprice;
	}

	public ShoesBiz getAddshoe() {
		return addshoe;
	}

	public void setAddshoe(ShoesBiz addshoe) {
		this.addshoe = addshoe;
	}

	public File getUploadImage() {
		return uploadImage;
	}

	public void setUploadImage(File uploadImage) {
		this.uploadImage = uploadImage;
	}

	public String getUploadImageFileName() {
		return uploadImageFileName;
	}

	public void setUploadImageFileName(String uploadImageFileName) {
		this.uploadImageFileName = uploadImageFileName;
	}

	public String getUploadImageContentType() {
		return uploadImageContentType;
	}

	public void setUploadImageContentType(String uploadImageContentType) {
		this.uploadImageContentType = uploadImageContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public Shoe getAdd() {
		return add;
	}

	public void setAdd(Shoe add) {
		this.add = add;
	}
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	public String upload() {
		// srcDirԴ�ļ� destDirĿ���ļ�
		String realPath = ServletActionContext.getServletContext().getRealPath(
				"/images");
		SimpleDateFormat ss = new SimpleDateFormat("yyyyMMddhhmmss");
		Date date = new Date();
		String da = ss.format(date);
		String addressIma = "images/" + da + getExt(uploadImageFileName);
		File file = new File(realPath, da + getExt(uploadImageFileName));// ���ļ��Ž��ļ�����
		try {
			FileUtils.copyFile(uploadImage, file);
		} catch (IOException e) {

			e.printStackTrace();
		}
		ActionContext.getContext().put("message", "�ϴ��ɹ�");
		add.setBank(bank);
		add.setCid(cid);
		add.setNewprice(Integer.parseInt(newprice));
		add.setOldprice(Integer.parseInt(oldprice));
		add.setName(name);
		add.setType(type);
		add.setImg(addressIma);
		addshoe.save(add);

		return "success";
	}

	public static String getExt(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}

	public String editshoes() {

		add = addshoe.editshoes(id);
		return "success";
	}

	public String updateshoes() {
		addshoe.updateshoes(add);
		return "success";
	}

	public String deleteshoes() {
		addshoe.deleteshoes(id);
		return "success";
	}
	public String findtypeshoes(){
		 list=addshoe.findshoes("����Ь");
		 list1=addshoe.findshoes("��Ь");	
		return "success";
		
	}
	public String findshoes(){
		add = addshoe.findshoes(id);
		return "success";
		
	}
	public String search(){
		if (search.equals("")) {
			return "false";
		} else {
			list = addshoe.search(search);
			return "success";
		}

	}

}
