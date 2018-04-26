package com.zhaopin.dao;

import com.zhaopin.model.RecruitmentInfo;
import com.zhaopin.model.RecruitmentInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RecruitmentInfoMapper {
	int countByExample(RecruitmentInfoExample example);

	int deleteByExample(RecruitmentInfoExample example);

	int deleteByPrimaryKey(Integer iId);

	int insert(RecruitmentInfo record);

	int insertSelective(RecruitmentInfo record);

	List<RecruitmentInfo> selectByExample(RecruitmentInfoExample example);

	List<RecruitmentInfo> selectAll(String position,String companyName,Integer state);
	
	RecruitmentInfo selectByPrimaryKey(Integer iId);

	int updateByExampleSelective(@Param("record") RecruitmentInfo record,
			@Param("example") RecruitmentInfoExample example);

	int updateByExample(@Param("record") RecruitmentInfo record,
			@Param("example") RecruitmentInfoExample example);

	int updateByPrimaryKeySelective(RecruitmentInfo record);

	int updateByPrimaryKey(RecruitmentInfo record);

	List<RecruitmentInfo> selectByAccountAndTime(String account, String time);
	
	List<RecruitmentInfo> selectInfoByexample(Integer id,String position,String place,String orderBy);
}