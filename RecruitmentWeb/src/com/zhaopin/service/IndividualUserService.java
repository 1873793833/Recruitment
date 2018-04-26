package com.zhaopin.service;

import java.util.List;

import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.IndividualUserExample;

public interface IndividualUserService {
	/* 
	 * 根据条件查询所有的个人用户
	 * */
	public List<IndividualUser> selectByExample(IndividualUserExample example);

	/*
	 * 添加个人用户
	 * */ 
	public int insertSelective(IndividualUser record);

	/*
	 * 根据id和内容选择更新
	 * */ 
	public int updateByPrimaryKeySelective(IndividualUser record);
	/*
	 * 根据账号和密码查询用户
	 * */
	public IndividualUser selectUserByAccAndPwd(String account,String password);
}
