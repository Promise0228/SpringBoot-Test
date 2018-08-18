/**
 * @filename UserDao.java
 * @author lg
 * @date 2018年3月25日 下午4:55:05
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.User;
/**
 * 
 * @author lg
 * JpaRepository 接口中封装crud方法
 */
public interface UserDao extends JpaRepository<User, Integer>{

}
