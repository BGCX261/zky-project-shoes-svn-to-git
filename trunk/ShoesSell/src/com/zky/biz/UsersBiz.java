package com.zky.biz;

import java.util.List;
import com.zky.pojo.Users1;

public interface UsersBiz {
	public List<Users1> allUsers();
	public List<Users1> findAll1(String name, String psw);

}
