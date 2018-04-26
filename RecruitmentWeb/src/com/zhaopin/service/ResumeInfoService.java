package com.zhaopin.service;

import java.util.List;

import com.zhaopin.model.ResumeInfo;
import com.zhaopin.model.ResumeInfoExample;

public interface ResumeInfoService {
	/*
	 * 根据招聘信息内容添加简历
	 * */ 
	public int insertSelective(ResumeInfo record);

	/*
	 * 根据条件简历信息
	 * */ 
	public List<ResumeInfo> selectByExample(ResumeInfoExample example);
	
	/*
	 * 根据用户id删除简历信息
	 * */ 
	public int deleteByPrimaryKey(Integer rId);
	
	/*
	 * 根据用户id和内容更新简历信息
	 * */ 
	public int updateByPrimaryKeySelective(ResumeInfo record);
	
	/*
	 * 根据登录用户的id和简历投递的时间和职位和状态查询
	 * */
	public List<ResumeInfo> selectAllByExample(Integer id,String position,Integer state,String time,String drafts);
	
	/*
	 * 根据条件查询个人用户的所有简历
	 * */
	public List<ResumeInfo> selectAllByRinfoExample(ResumeInfoExample example);
	/*
	*根据个人用户id和公司名称或地点或职位或大于该薪资查询简历
	*/
	public List<ResumeInfo> selectAllByIid(Integer Iid,String name,String place,String position,Integer salary,String drafts);
	
	/*
	 * 根据企业id查询所有的简历
	 * */
	public List<ResumeInfo> selectByEid(Integer eId,String position,Integer state,String time,String drafts);
}
