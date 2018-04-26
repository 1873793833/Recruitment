package com.zhaopin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaopin.dao.AdminMapper;
import com.zhaopin.model.Admin;
import com.zhaopin.model.AdminExample;
import com.zhaopin.service.AdminService;
@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;
	
	
	@Override
	public List<Admin> selectAdminByExample(AdminExample example) {
		
		return adminMapper.selectByExample(example);
	}


	@Override
	public int updateByPrimaryKeySelective(Admin record) {
		
		return adminMapper.updateByPrimaryKeySelective(record);
	}

}
