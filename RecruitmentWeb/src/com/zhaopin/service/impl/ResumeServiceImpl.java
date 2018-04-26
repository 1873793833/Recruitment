package com.zhaopin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaopin.dao.ResumeInfoMapper;
import com.zhaopin.model.ResumeInfo;
import com.zhaopin.model.ResumeInfoExample;
import com.zhaopin.service.ResumeInfoService;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeInfoService {

	@Autowired
	private ResumeInfoMapper resumeMapper;

	@Override
	public int insertSelective(ResumeInfo record) {
		
		return resumeMapper.insertSelective(record);
	}

	@Override
	public List<ResumeInfo> selectByExample(ResumeInfoExample example) {
		
		return resumeMapper.selectByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer rId) {
		
		return resumeMapper.deleteByPrimaryKey(rId);
	}

	@Override
	public int updateByPrimaryKeySelective(ResumeInfo record) {
		
		return resumeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<ResumeInfo> selectAllByExample(Integer id, String position,
			Integer state, String time,String drafts) {
		
		return resumeMapper.selectAllByExample(id, position, state, time ,drafts);
	}

	@Override
	public List<ResumeInfo> selectAllByRinfoExample(ResumeInfoExample example) {
		
		return resumeMapper.selectAllByRinfoExample(example);
	}

	@Override
	public List<ResumeInfo> selectAllByIid(Integer Iid, String name,
			String place, String position, Integer salary,String drafts) {
		return resumeMapper.selectAllByIid(Iid, name, place, position, salary, drafts);
	}

	@Override
	public List<ResumeInfo> selectByEid(Integer eId, String position,
			Integer state, String time, String drafts) {
		
		return resumeMapper.selectByEid(eId, position, state, time, drafts);
	}


}
