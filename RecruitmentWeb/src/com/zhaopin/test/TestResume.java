package com.zhaopin.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.zhaopin.model.RecruitmentInfoExample.Criteria;
import com.zhaopin.model.ResumeInfo;
import com.zhaopin.model.ResumeInfoExample;
import com.zhaopin.service.ResumeInfoService;

public class TestResume {
	private ApplicationContext context = null;
	private ResumeInfoService resumeService = null;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		resumeService = (ResumeInfoService) context.getBean("resumeService");
	}

	/*@Test
	public void getTestRecruitmentInfos() {
		ResumeInfoExample example = new ResumeInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andIIdEqualTo(1);
		ResumeInfo resume = resumeService.selectResumeRinfoByKey(example);
		System.out.println(resume.getJobPosition() + "---"
				+ resume.getRecruitmentInfo().getCompanyName());
	}*/
	
	@Test
	public void testRinfo(){
		
		List<ResumeInfo> list= resumeService.selectAllByIid(1, "%%", "%%", "%%", 0, "存入");
		System.out.println(list.size());
	}
}
