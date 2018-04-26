package com.zhaopin.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.RecruitmentInfo;
import com.zhaopin.model.RecruitmentInfoExample;
import com.zhaopin.model.RecruitmentInfoExample.Criteria;
import com.zhaopin.service.RecruitmentInfoService;

@RequestMapping("/recruitmentInfo")
@Controller
public class RecruitmentInfoAction {
	@Autowired
	private RecruitmentInfoService recruitmentInfoService;

	/*
	 * 查询所有招聘信息
	 */
	@RequestMapping("/AllInfos")
	public String AllInfos(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "select", defaultValue = "1") Integer select,
			@RequestParam(value = "example", defaultValue = "") String example,
			Map<String, Object> map) {
		String position="" ,companyName="";
		if (select==1) {
			position=example;
		}else{
			companyName=example;
		}
		PageHelper.startPage(pageNum, 10);
		List<RecruitmentInfo> list=recruitmentInfoService.selectAll("%"+position+"%", "%"+companyName+"%",1);
		PageInfo<RecruitmentInfo> info=new PageInfo<>(list, 3);
		map.put("info", info);
		map.put("list", list);
		map.put("select", select);
		map.put("example", example);	
		return "homePage";
	}

	/*
	 * 发布招聘信息业务
	 */
	@RequestMapping("/postTheAD")
	public String PostTheAD(RecruitmentInfo recruitmentInfo, HttpSession session) {
		recruitmentInfo.setEnterpriseId(((EnterpriseUser) session
				.getAttribute("enterprise")).geteId());
		recruitmentInfo.setState(1);// 设置已发布状态
		recruitmentInfo.setReleaseTime(new Date());
		recruitmentInfo.setUpdateTime(new Date());
		recruitmentInfoService.insertSelective(recruitmentInfo);
		return "redirect:/recruitmentInfo/getRinfosByEid";
	}

	/*
	 * 修改招聘信息业务
	 */
	@ResponseBody
	@RequestMapping("/modifyInfo")
	public int modifyInfo(RecruitmentInfo recruitmentInfo) {
		int result = 0;
		recruitmentInfo.setUpdateTime(new Date());
		recruitmentInfo.setState(1);
		result = recruitmentInfoService
				.updateByPrimaryKeySelective(recruitmentInfo);
		return result;
	}

	/*
	 * 关闭或重新开启已发布的招聘信息
	 */
	@ResponseBody
	@RequestMapping("/closeOrOpenInfo")
	public int closeOrOpenInfo(int id, int state) {
		int result = 0;
		RecruitmentInfo recruitmentInfo = new RecruitmentInfo();
		recruitmentInfo.setiId(id);
		if (state == 1) {
			recruitmentInfo.setState(0);
		} else if (state == 0) {
			recruitmentInfo.setState(1);
		}
		result = recruitmentInfoService
				.updateByPrimaryKeySelective(recruitmentInfo);
		return result;
	}

	/*
	 * 根据登录的企业用户id查询该账户下的所有招聘信息
	 */
	@RequestMapping("/getRinfosByEid")
	public String getRinfosByEid(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "position", defaultValue = "") String position,
			@RequestParam(value = "time", defaultValue = "") String time,
			@RequestParam(value = "state", defaultValue = "1") Integer state,
			HttpSession session, Map<String, Object> map) {
		PageHelper.startPage(pageNum, 10);
		RecruitmentInfoExample example = new RecruitmentInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andEnterpriseIdEqualTo(((EnterpriseUser) session
				.getAttribute("enterprise")).geteId());
		criteria.andPositionLike("%" + position + "%");
		criteria.andStateEqualTo(state);
		if (!time.trim().equals("")) {
			try {
				criteria.andUpdateTimeGreaterThanOrEqualTo(new SimpleDateFormat(
						"yyyy-MM-dd").parse(time));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		List<RecruitmentInfo> list = recruitmentInfoService
				.selectByExample(example);
		PageInfo<RecruitmentInfo> info = new PageInfo<>(list, 3);
		map.put("time", time);
		map.put("position", position);
		map.put("state", state);
		map.put("list", list);
		map.put("info", info);
		return "qiye_recruitmentInfos";
	}

	/*
	 * 根据id查询招聘信息
	 * */
	@RequestMapping("/selectInfoByid")
	public String selectInfoByid(@RequestParam(value="id") Integer id,Map<String,Object> map){
		RecruitmentInfoExample example=new RecruitmentInfoExample();
		Criteria criteria= example.createCriteria();
		criteria.andIIdEqualTo(id);
		List<RecruitmentInfo> list= recruitmentInfoService.selectByExample(example);
		map.put("list", list.get(0));
		return "h_Rinfo";
	}
	
	/*
	 * 根据招聘信息id查询招聘信息
	 */
	@ResponseBody
	@RequestMapping("/getRInfoByiId")
	public RecruitmentInfo getRInfoByiId(int iId) {
		RecruitmentInfoExample example = new RecruitmentInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andIIdEqualTo(iId);
		List<RecruitmentInfo> list = recruitmentInfoService
				.selectByExample(example);
		return list.get(0);
	}

	/*
	 * 搜索企业账号信息和招聘信息业务
	 * */
	@RequestMapping("/allCompanyInfo")
	public String allCompanyInfo(@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,
			@RequestParam(value="id")Integer id,
			@RequestParam(value="position",defaultValue="")String position,
			@RequestParam(value="place",defaultValue="")String place,
			@RequestParam(value="select",defaultValue="1")Integer select,
			Map<String,Object>map){
		PageHelper.startPage(pageNum, 10);
		String orderBy=""; 
		if (select==1) {
			orderBy="asc";
		}else if(select==2){
			orderBy="desc";
		}
		List<RecruitmentInfo> list= recruitmentInfoService .selectInfoByexample(id, "%"+position+"%","%"+place+"%", orderBy);
		PageInfo<RecruitmentInfo> info=new PageInfo<>(list, 3);
		map.put("list", list);
		map.put("info", info);
		map.put("position", position);
		map.put("place", place);
		map.put("select", select);
		map.put("id", id);
		return "h_companyInfo";
	}
	
	@RequestMapping(value = "/addRinfoPage")
	public String recruitment_info() {
		return "qiye_addRinfo";
	}

}
