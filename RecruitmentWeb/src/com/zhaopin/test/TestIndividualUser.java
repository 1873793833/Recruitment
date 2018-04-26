package com.zhaopin.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.EnterpriseUserExample;
import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.IndividualUserExample;
import com.zhaopin.model.IndividualUserExample.Criteria;
import com.zhaopin.service.IndividualUserService;

public class TestIndividualUser {
	private ApplicationContext context = null;
	IndividualUserService individualUserService = null;

	@Before
	public void read() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		individualUserService = (IndividualUserService) context
				.getBean("individualUserService");
	}

	@Test
	public void TestGetIndividualUser() {
		IndividualUserExample iUsereExample = null;
		List<IndividualUser> iUsers = individualUserService
				.selectByExample(iUsereExample);
		for (IndividualUser iUser : iUsers) {
			//System.out.println(iUser.getuEmail() + "---" + iUser.getuPassword());
		}
	}

	@Test
	public void TestIUser() {
		IndividualUserExample example = new IndividualUserExample();
		Criteria criteria = example.createCriteria();
		// 添加查询条件
		//criteria.andUEmailEqualTo("1873793833@qq.com");
		// criteria.andUPasswordEqualTo("123456");

		//List<IndividualUser> list = iUserService.getIndividualUserByEmailAndPwd(example);
		/*
		 * System.out.println(iUser.getuId() + "---" + iUser.getuEmail() + "---"
		 * + iUser.getuPassword());
		 */
		//System.out.println(list.get(0));
	}

	@Test
	public void TestIUserPage() {
		// 放在查询之前
		Page<Object> page = PageHelper.startPage(2, 3);

		IndividualUserExample example = null;
		List<IndividualUser> list = individualUserService.selectByExample(example);
		PageInfo<IndividualUser> info = new PageInfo<IndividualUser>(list, 3);
		for (IndividualUser i : list) {
			//System.out.println(i.getuEmail() + "---" + i.getuPassword());
		}
		System.out.println(info.getPages() + "----" + info.getPageNum());
	}
	
	@Test
	public void getiUser2() {
		String time="",account="";
		IndividualUserExample example = new IndividualUserExample();
		com.zhaopin.model.IndividualUserExample.Criteria criteria = example
				.createCriteria();
		if (!time.equals("")) {
			try {
				criteria.andIRegtimeGreaterThanOrEqualTo(new SimpleDateFormat(
						"yyyy-MM-dd hh:mm:ss").parse(time));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		criteria.andIAccountLike("%" + account + "%");
		List<IndividualUser> list = individualUserService
				.selectByExample(example);
		System.out.println(list.size());
	}
}
