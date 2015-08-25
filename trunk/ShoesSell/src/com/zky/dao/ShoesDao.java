package com.zky.dao;

import java.util.List;

import com.zky.pojo.Shoe;

public interface ShoesDao {

	public void save(Shoe shoes);
	public List<Shoe> findAll();
	public Shoe findById(int id);
	public void update(Shoe shoes);
	public void delete(int id);
	public List<Shoe> findAll(String type);
	public List<Shoe> search(String name);
}