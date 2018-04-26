package com.zhaopin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaopin.dao.RecruitmentInfoMapper;
import com.zhaopin.model.RecruitmentInfo;
import com.zhaopin.model.RecruitmentInfoExample;
import com.zhaopin.service.RecruitmentInfoService;

@Service("recruitmentInfoService")
public class RecruitmentInfoServiceImpl implements RecruitmentInfoService {
	@Autowired
	private RecruitmentInfoMapper recruitmentInfoMapper;

	@Override
	public List<RecruitmentInfo> selectByExample(RecruitmentInfoExample example) {
		return recruitmentInfoMapper.selectByExample(example);
	}

	@Override
	public int insertSelective(RecruitmentInfo record) {
		return recruitmentInfoMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(RecruitmentInfo record) {
		return recruitmentInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer iId) {
		return recruitmentInfoMapper.deleteByPrimaryKey(iId);
	}

	@Override
	public List<RecruitmentInfo> selectByAccountAndTime(String account,
			String time) {
		return recruitmentInfoMapper.selectByAccountAndTime(account, time);
	}

	@Override
	public int updateByExampleSelective(RecruitmentInfo record,
			RecruitmentInfoExample example) {
		
		return recruitmentInfoMapper.updateByExampleSelective(record, example);
	}


	@Override
	public List<RecruitmentInfo> selectAll(String position, String companyName,
			Integer state) {
		
		return recruitmentInfoMapper.selectAll(position, companyName,state);
	}

	@Override
	public List<RecruitmentInfo> selectInfoByexample(Integer id, String position,
			String place, String orderBy) {
		return recruitmentInfoMapper.selectInfoByexample(id, position, place, orderBy);
	}

}
