/**
 * @filename User.java
 * @author lg
 * @date 2018年3月25日 下午4:48:53
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user1")
public class User {
    @Id
    @GeneratedValue
	private Integer userid;
	//@Column(name="num1")
	private Integer username;
	private String userpass;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getUsername() {
		return username;
	}
	public void setUsername(Integer username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	
	
	
}
