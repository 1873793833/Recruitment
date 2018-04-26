package com.zhaopin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaopin.dao.IndividualUserMapper;
import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.IndividualUserExample;
import com.zhaopin.service.IndividualUserService;

@Service("individualUserService")
public class IndividualUserServiceImpl implements IndividualUserService {

	@Autowired
	private IndividualUserMapper individualUserMapper;

	@Override
	public List<IndividualUser> selectByExample(IndividualUserExample example) {

		return individualUserMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(IndividualUser record) {

		return individualUserMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(IndividualUser record) {

		return individualUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public IndividualUser selectUserByAccAndPwd(String account, String password) {
		
		return individualUserMapper.selectUserByAccAndPwd(account, password);
	}

}
