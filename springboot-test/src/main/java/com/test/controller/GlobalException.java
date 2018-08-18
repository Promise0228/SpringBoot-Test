/**
 * @filename GlobalException.java
 * @author lg
 * @date 2018年3月23日 下午10:56:45
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//全局铺货异常//采用spring异常通知
@ControllerAdvice
public class GlobalException {

	// 拦截运行异常
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> error500() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "500");
		map.put("msg", "系统异常");
		return map;
	}

}
