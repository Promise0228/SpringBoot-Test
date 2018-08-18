/**
 * @filename UserService.java
 * @author lg
 * @date 2018年3月24日 下午7:19:36
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.entity.User;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserDao userDao;
	/**
	 * jdbc模板形式保存，执行sql
	 * @param num
	 * @return
	 */
	public boolean saveUser(Map map){
		User user =(User)map.get("user");
		int res=jdbcTemplate.update("insert into users(username,userpass) "
				+ "values(?,?)",
				new Object[]{user.getUsername(),user.getUserpass()});
		System.out.println("保存成功.....");
		return res>0;
	}
	
	/**
	 * jpa封装方式保存，操作对象，不用sql
	 * @param num
	 * @return
	 */
	public boolean saveJpaUser(User user){
		/*User user=new User();
		user.setNum1(Integer.parseInt(num1));*/
		User u=userDao.save(user);
		System.out.println("保存成功.....");
		return u!=null;
	}
	
	/**
	 * jpa封装方式根据id查询，用户对象
	 * @param id
	 * @return
	 */
	public User findUser(Integer id){
		User u=userDao.findOne(id);
		return u;
	}
}
