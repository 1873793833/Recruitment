package com.zhaopin.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaopin.model.Admin;
import com.zhaopin.model.AdminExample;
import com.zhaopin.model.AdminExample.Criteria;
import com.zhaopin.service.AdminService;

public class AdminTest {
	private ApplicationContext context = null;
	private AdminService adminService = null;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		adminService = (AdminService) context.getBean("adminService");
	}

	@Test
	public void getTestAdmin() {
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo("admin");
		criteria.andPasswordEqualTo("root");
		List<Admin> list = adminService.selectAdminByExample(example);
		System.out.println(list.size()+"---"+list.get(0).getName());
	}

	
}
