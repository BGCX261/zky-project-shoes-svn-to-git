package com.zky.biz;

import java.util.List;

import com.zky.pojo.Shoe;

public interface ShoesBiz {

	public void save(Shoe shoes);
	public List<Shoe> findshoes(List<Shoe> list);
	public Shoe editshoes(int id);
	public void updateshoes(Shoe shoe);
	public void deleteshoes(int id);
	public List<Shoe> findshoes(String type);
	public Shoe findshoes(int id);
	public List<Shoe> search(String name);

}