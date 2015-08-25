package com.zky.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



import com.zky.biz.ShoesBiz;
import com.zky.dao.ShoesDao;
import com.zky.pojo.Shoe;
@Service
public class ShoesBizImpl implements ShoesBiz  {
	@Resource
	private ShoesDao addsh;

	private Shoe shoe;

	public ShoesDao getAddsh() {
		return addsh;
	}

	public void setAddsh(ShoesDao addsh) {
		this.addsh = addsh;
	}

	public void save(Shoe shoes) {
		addsh.save(shoes);

	}

	public List<Shoe> findshoes(List<Shoe> list) {
		list = addsh.findAll();
		return list;
	}

	public Shoe editshoes(int id) {
		shoe = addsh.findById(id);
		return shoe;
	}

	public void updateshoes(Shoe shoe) {
		addsh.update(shoe);
	}

	public void deleteshoes(int id) {
		addsh.delete(id);
	}

	public List<Shoe> findshoes(String type) {
		return addsh.findAll(type);
	}

	public Shoe findshoes(int id) {
		shoe = addsh.findById(id);
		return shoe;
	}

	public List<Shoe> search(String name) {
		return addsh.search(name);
	}

}
