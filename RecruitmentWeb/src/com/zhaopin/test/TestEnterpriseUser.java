package com.zhaopin.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;
import com.zhaopin.dao.EnterpriseUserMapper;
import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.EnterpriseUserExample;
import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.IndividualUserExample;
import com.zhaopin.model.EnterpriseUserExample.Criteria;
import com.zhaopin.service.EnterpriseUserService;
import com.zhaopin.service.IndividualUserService;

public class TestEnterpriseUser {
	private ApplicationContext context = null;
	EnterpriseUserService enterpriseUserService = null;

	@Before
	public void read() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		enterpriseUserService = (EnterpriseUserService) context
				.getBean("enterpriseUserService");
	}

	@Test
	public void getEnterpriseUser() {
		EnterpriseUserExample example = new EnterpriseUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andECompanyNameLike("%%");
		List<EnterpriseUser> list = enterpriseUserService
				.selectAllByexample(example);
		for (EnterpriseUser e : list) {
			System.out.println(e.geteCompanyName() + "----"
					+ e.getRecruitmentInfos().size());
		}
	}

	@Test
	public void getEnterpriseUser2() {
		String time="",account="";
		EnterpriseUserExample example = new EnterpriseUserExample();
		com.zhaopin.model.EnterpriseUserExample.Criteria criteria = example
				.createCriteria();
		criteria.andEAccountLike("%" + account + "%");
		List<EnterpriseUser> list = enterpriseUserService
				.selectByExample(example);
		PageInfo<EnterpriseUser> info = new PageInfo<>(list, 3);
		System.out.println(list.size());
	}
	
	@Test 
	public void getEUser(){
		String time="",account="";
		List<EnterpriseUser> list= enterpriseUserService.selectByAccountAndTime("%"+account+"%", time);
		System.out.println(list.size());
	}
}
