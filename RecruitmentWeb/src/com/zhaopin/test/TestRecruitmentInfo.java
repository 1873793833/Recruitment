package com.zhaopin.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaopin.model.RecruitmentInfo;
import com.zhaopin.model.RecruitmentInfoExample;
import com.zhaopin.model.RecruitmentInfoExample.Criteria;
import com.zhaopin.service.RecruitmentInfoService;

public class TestRecruitmentInfo {
	private ApplicationContext context = null;
	private RecruitmentInfoService recruitmentInfoService = null;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		recruitmentInfoService = (RecruitmentInfoService) context
				.getBean("recruitmentInfoService");
	}
	/*
	@Test
	public void getTestRecruitmentInfos() {
		// pageNump第几页,ageSize每页显示几条
		Page<Object> page = PageHelper.startPage(1, 2);
		RecruitmentInfoExample example = new RecruitmentInfoExample();
		Criteria criteria = example.createCriteria();
		 criteria.andPositionLike("%"+"%"); 
		List<RecruitmentInfo> list = recruitmentInfoService
				.getRecruitmentInfos(example);
		PageInfo<RecruitmentInfo> info = new PageInfo<>(list, 2);
		for (RecruitmentInfo r : list) {
			System.out.println(r);
		}
		System.out.println(info.getPages() + "---" + info.getPageNum());
	}

	@Test
	public void getRinfoByRid() {
		RecruitmentInfoExample example = new RecruitmentInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andIIdEqualTo(1);
		List<RecruitmentInfo> list = recruitmentInfoService
				.getRecruitmentInfos(example);

		System.out.println(list.get(0).getiId());
	}*/
	
	@Test
	public void testRecruitmentInfo(){
		String account="",time="";
		List<RecruitmentInfo> list= recruitmentInfoService.selectByAccountAndTime("%"+account+"%", time);
		System.out.println(list.size());
	}
}
