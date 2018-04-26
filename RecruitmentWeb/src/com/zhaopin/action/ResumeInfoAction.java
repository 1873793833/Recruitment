package com.zhaopin.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.ResumeInfo;
import com.zhaopin.model.ResumeInfoExample;
import com.zhaopin.model.ResumeInfoExample.Criteria;
import com.zhaopin.service.ResumeInfoService;

@RequestMapping("/resumeInfo")
@Controller
public class ResumeInfoAction {
	@Autowired
	private ResumeInfoService resumeService;

	/*
	 * 简历修改业务
	 */
	@ResponseBody
	@RequestMapping("/modifyInfo")
	public int modifyInfo(ResumeInfo resumeInfo) {
		int result = 0;
		resumeInfo.setSubmissionDate(new Date());
		resumeService.updateByPrimaryKeySelective(resumeInfo);
		return result;
	}

	/*
	 * 简历删除业务
	 */
	@ResponseBody
	@RequestMapping("/deleteInfo")
	public int deleteInfo(int rId) {
		int result = 0;
		result = resumeService.deleteByPrimaryKey(rId);
		return result;
	}

	/*
	 * 简历提交业务
	 */
	@ResponseBody
	@RequestMapping(value = "/submitResume", method = RequestMethod.POST)
	public int submitResume(ResumeInfo resumeInfo, HttpSession session) {
		resumeInfo.setSubmissionDate(new Date());
		resumeInfo.setrState(0);// 设置简历是否被应聘的状态0待回应 1成功应聘 -1未娉上
		resumeInfo.setIndividualId(((IndividualUser)session.getAttribute("individual")).getiId());
	    int result= resumeService.insertSelective(resumeInfo);
		return result;
	}

	/*
	 * 根据登录的企业id查询所有简历
	 */
	@RequestMapping(value = "/getInfoByid")
	public String getInfoByid(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "time", defaultValue = "") String time,
			@RequestParam(value = "position", defaultValue = "") String position,
			@RequestParam(value = "state", defaultValue = "0") int state,
			HttpSession session, Map<String, Object> map) {
		PageHelper.startPage(pageNum, 10);
		List<ResumeInfo> list = resumeService.selectByEid(
				((EnterpriseUser) session.getAttribute("enterprise")).geteId(),
				"%" + position + "%", state, time, "未存入");
		PageInfo<ResumeInfo> info = new PageInfo<>(list, 3);
		map.put("list", list);
		map.put("info", info);
		map.put("position", position);
		map.put("state", state);
		map.put("time", time);
		return "qiye_index";
	}

	/*
	 * 根据个人用户的id查询所有的简历
	 */
	@RequestMapping("/getInfoByIid")
	public String getInfoByIid(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "time", defaultValue = "") String time,
			@RequestParam(value = "position", defaultValue = "") String position,
			@RequestParam(value = "state", defaultValue = "0") int state,
			HttpSession session, Map<String, Object> map) {
		PageHelper.startPage(pageNum, 10);
		ResumeInfoExample example = new ResumeInfoExample();
		com.zhaopin.model.ResumeInfoExample.Criteria criteria = example
				.createCriteria();
		criteria.andIndividualIdEqualTo(((IndividualUser) session
				.getAttribute("individual")).getiId());
		criteria.andRPositionLike("%" + position + "%");
		criteria.andRStateEqualTo(state);
		criteria.andDraftsEqualTo("未存入");
		if (!time.trim().equals("")) {
			try {
				criteria.andSubmissionDateGreaterThanOrEqualTo(new SimpleDateFormat(
						"yyyy-MM-dd").parse(time));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		List<ResumeInfo> list = resumeService.selectAllByRinfoExample(example);
		PageInfo<ResumeInfo> info = new PageInfo<>(list, 3);
		map.put("list", list);
		map.put("info", info);
		map.put("position", position);
		map.put("state", state);
		return "geren_index";
	}
	/*
	*模态框数据 根据简历id查询简历
	*/
	@ResponseBody
	@RequestMapping("/getResumeInfoByiId")
	public ResumeInfo getResumeInfoByiId(int rId){
		ResumeInfoExample example=new ResumeInfoExample();
		Criteria criteria= example.createCriteria();
		criteria.andRIdEqualTo(rId);
		List<ResumeInfo> list= resumeService.selectByExample(example);
		return list.get(0);
	}
	
	/*
	 * 查询是否已经向指定id的招聘信息投递过简历
	 * */
	@ResponseBody
	@RequestMapping("/checkDuplicate")
	public int checkDuplicate(int id,HttpSession session){
		ResumeInfoExample example=new ResumeInfoExample();
		Criteria criteria=example.createCriteria();
		criteria.andRecruitmentInfoidEqualTo(id);
		criteria.andIndividualIdEqualTo(((IndividualUser)session.getAttribute("individual")).getiId());
		criteria.andDraftsEqualTo("未存入");
		List<ResumeInfo> list= resumeService.selectByExample(example);
		return list.size();
	}
	
	
	/*
	 * 根据条件查询草稿箱中简历
	 */
	@RequestMapping("/getDraftsByIid")
	public String getDraftsByIid(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "example", defaultValue = "1") Integer example,
			@RequestParam(value = "keyword", defaultValue = "") String keyword,
			@RequestParam(value = "salary", defaultValue = "0") Integer salary,
			HttpSession session, Map<String, Object> map) {
		PageHelper.startPage(pageNum, 10);
		String name = "", place = "", position = "";
		if (example == 1) {
			position = keyword;
		} else if (example == 2) {
			name = keyword;
		} else {
			place = keyword;
		}
		List<ResumeInfo> list = resumeService.selectAllByIid(
				((IndividualUser) session.getAttribute("individual")).getiId(),
				"%" + name + "%", "%" + place + "%", "%" + position + "%",
				salary, "存入");
		PageInfo<ResumeInfo> info = new PageInfo<>(list, 3);
		map.put("list", list);
		map.put("info", info);
		map.put("example", example);
		map.put("keyword", keyword);
		map.put("salary", salary);
		return "geren_drafts";
	}

	/*
	 * 提交简历业务
	 * */
	@ResponseBody
	@RequestMapping("/uploadResumene")
	public int uploadResumene(int rId){
		int result=0;
		ResumeInfo resumeInfo=new ResumeInfo();
		resumeInfo.setrId(rId);
		resumeInfo.setDrafts("未存入");
		resumeInfo.setSubmissionDate(new Date());
		result= resumeService.updateByPrimaryKeySelective(resumeInfo);
		return result;
	}
	
	/*
	 *模态框功能,根据简历id删除简历
	 * */
	@ResponseBody
	@RequestMapping("/delResumeByRid")
	public int delResumeByRid(int rId){
		int result=0;
		result=resumeService.deleteByPrimaryKey(rId);
		return result;
	}
	/*
	 * 模态框功能,修改简历信息
	 * */
	@ResponseBody
	@RequestMapping("/updataResume")
	public int updataResume(ResumeInfo resumeInfo){
		int result=resumeService.updateByPrimaryKeySelective(resumeInfo);
		return result;
	}
	/*
	 * 企业发送offer给求职者,这里是将简历的状态做处理
	 * */
	@ResponseBody
	@RequestMapping("/senMessage")
	public int senMessage(int rId){
		int result;
		ResumeInfo resumeInfo=new ResumeInfo();
		resumeInfo.setrId(rId);
		resumeInfo.setrState(1);
		result= resumeService.updateByPrimaryKeySelective(resumeInfo);
		return result;
	} 
	
	/*
	 * 跳转到简历提交页面
	 */
	@RequestMapping("/submitResumePage")
	public String submitResumePage() {
		return "geren_submitResume";
	}

	/*
	 * 请求的参数的日期格式化,spring无法对日期类型数据做转换所以必须加这个否则回报400错误
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,
				false));
	}
}
