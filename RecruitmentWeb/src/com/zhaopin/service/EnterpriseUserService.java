package com.zhaopin.service;

import java.util.List;

import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.EnterpriseUserExample;

public interface EnterpriseUserService {
	/*
	 * 根据条件查询个人用户
	 * */ 
	public List<EnterpriseUser> selectByExample(EnterpriseUserExample example);;

	/*
	 * 添加个人用户
	 * */ 
	public int insertSelective(EnterpriseUser record);
	
	/*
	 * 根据用户id选择内容修改
	 * */
	public int updateByPrimaryKeySelective(EnterpriseUser record);
	/*
	 * 根据账号和时间查询用户和招聘信息
	 * */
	public List<EnterpriseUser> selectByAccountAndTime(String account,String time);
	/*
	 * 根据条件查询所有的公司信息和招聘信息
	 * */
	public List<EnterpriseUser> selectAllByexample(EnterpriseUserExample example);
	
	public EnterpriseUser selectUserByAccAndPwd(String account,String password);
	
	
}
