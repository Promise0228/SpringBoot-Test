/**
 * @filename IndexController.java
 * @author lg
 * @date 2018年3月23日 下午10:04:28
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {	
	@RequestMapping("/indexController")
	public String indexController(HttpServletRequest request,Map<String, Object> map){
		//request.setAttribute("name", "刘广");
		map.put("name", "lg");
		map.put("sex", 1);
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		map.put("userlist", list);
		return "index";
	}
	
	@RequestMapping("/indexCont")
	public ModelAndView index(HttpServletRequest request,Map<String, Object> map){
		//request.setAttribute("name", "刘广");
		//map.put("name", "lg");
		ModelAndView mod=new ModelAndView("index");
		mod.addObject("name", "刘广你好");
		return mod;
	}
}
