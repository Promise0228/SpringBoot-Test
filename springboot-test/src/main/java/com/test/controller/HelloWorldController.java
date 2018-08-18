/**
 * @filename HelloWorldController.java
 * @author lg
 * @date 2018年3月23日 下午9:38:50
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//标识所有方法返回json格式
@RestController //@ResponseBody和@Controller
public class HelloWorldController {
	@RequestMapping("/index")
	public String index(){
		return "succes";
	}
	@RequestMapping("/getMap")
	public Map<String, Object> getMap(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("code", "200");
		return map;
	}
}
