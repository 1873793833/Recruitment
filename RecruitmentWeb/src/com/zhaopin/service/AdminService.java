package com.zhaopin.service;

import java.util.List;

import com.zhaopin.model.Admin;
import com.zhaopin.model.AdminExample;

public interface AdminService {
	/*
	 * 根据条件查询用户集合
	 */
	public List<Admin> selectAdminByExample(AdminExample example);
	
	/*
	 * 根据条件更新用户信息
	 * */
	public int updateByPrimaryKeySelective(Admin record);
}
