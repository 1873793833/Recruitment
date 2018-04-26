package com.zhaopin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaopin.dao.EnterpriseUserMapper;
import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.EnterpriseUserExample;
import com.zhaopin.service.EnterpriseUserService;

@Service("enterpriseUserService")
public class EnterpriseUserServiceImpl implements EnterpriseUserService {
	@Autowired
	private EnterpriseUserMapper enterpriseUserMapper;

	@Override
	public List<EnterpriseUser> selectByExample(EnterpriseUserExample example) {

		return enterpriseUserMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(EnterpriseUser record) {

		return enterpriseUserMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(EnterpriseUser record) {

		return enterpriseUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<EnterpriseUser> selectByAccountAndTime(String account,
			String time) {
		return enterpriseUserMapper.selectByAccountAndTime(account, time);
	}

	@Override
	public List<EnterpriseUser> selectAllByexample(EnterpriseUserExample example) {
		return enterpriseUserMapper.selectAllByexample(example);
	}

	@Override
	public EnterpriseUser selectUserByAccAndPwd(String account, String password) {
		return enterpriseUserMapper.selectUserByAccAndPwd(account, password);
	}


}
