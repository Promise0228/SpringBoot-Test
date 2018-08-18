/**
 * @filename App.java
 * @author lg
 * @date 2018年3月23日 下午10:11:03
 * @version 1.0
 * Copyright (C) 2018 
 */

package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages={"com.test.controller","com.test.service"})
//@EnableJpaRepositories("com.test.dao")//这里必须用@EnableJpaRepositories进行扫描，才能注入到jpa容器中
//@EntityScan("com.test.entity")//扫描实体类
//@EnableAutoConfiguration //开启自动配置，只扫描当前controller，注入spring容器，创建tomcat加载spring配置
public class App {

	public static void main(String[] args) {
		//主函数运行SpringBoot项目
		SpringApplication.run(App.class, args);
	}
}
