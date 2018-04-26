package com.zhaopin.service;

import java.util.List;


import com.zhaopin.model.RecruitmentInfo;
import com.zhaopin.model.RecruitmentInfoExample;

public interface RecruitmentInfoService {
	/*
	 * 根据条件查询所有招聘信息
	 */
	public List<RecruitmentInfo> selectByExample(RecruitmentInfoExample example);

	/*
	 * 根据内容添加招聘信息
	 */
	public int insertSelective(RecruitmentInfo record);

	/*
	 * 根据id和内容更新招聘信息
	 */
	public int updateByPrimaryKeySelective(RecruitmentInfo record);

	/*
	 * 根据用户id删除招聘信息
	 */
	public int deleteByPrimaryKey(Integer iId);
	/*
	 * 根据账号和时间查询招聘信息和用户信息
	 * */
	public List<RecruitmentInfo> selectByAccountAndTime(String account,String time);
	
	/*
	 * 根据条件选择内容更新
	 * */
	public int updateByExampleSelective(RecruitmentInfo record,RecruitmentInfoExample example);
	
	/*
	 * 根据职位,公司选择性查询
	 * */
	public List<RecruitmentInfo> selectAll(String position,String companyName,Integer state);
	
	public List<RecruitmentInfo> selectInfoByexample(Integer id,String position,String place,String orderBy);
}
