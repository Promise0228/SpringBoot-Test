/**
 * @filename UserController.java
 * @author lg
 * @date 2018年3月24日 下午7:26:17
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;
import com.test.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/saveUser")
	public String saveUser(User user){
		HashMap<String, User> map=new HashMap<String, User>();
		map.put("user", user);
		userService.saveUser(map);
		return "success";
	}
	
	
	@RequestMapping("/saveJpaUser")
	public String saveJpaUser(User user){
		userService.saveJpaUser(user);
		return "success";
	}
	
	@RequestMapping("/findUser")
	public User findUser(Integer id){
		return userService.findUser(id);
	}
}
