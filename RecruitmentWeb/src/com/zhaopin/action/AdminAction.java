package com.zhaopin.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
import com.zhaopin.model.Admin;
import com.zhaopin.model.AdminExample;
import com.zhaopin.model.AdminExample.Criteria;
import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.EnterpriseUserExample;
import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.IndividualUserExample;
import com.zhaopin.model.RecruitmentInfo;
import com.zhaopin.model.RecruitmentInfoExample;
import com.zhaopin.service.AdminService;
import com.zhaopin.service.EnterpriseUserService;
import com.zhaopin.service.IndividualUserService;
import com.zhaopin.service.RecruitmentInfoService;
import com.zhaopin.service.ResumeInfoService;

@Controller
@RequestMapping("/admin")
public class AdminAction {
	@Autowired
	private AdminService adminService;
	@Autowired
	private EnterpriseUserService enterpriseUserService;
	@Autowired
	private IndividualUserService individualUserService;
	@Autowired
	private RecruitmentInfoService recruitmentInfoService;
	@Autowired
	private ResumeInfoService resumeInfoService;

	/*
	 * ajax管理员登录
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Admin loginAdmin(String account, String password, HttpSession session) {
		AdminExample example = new AdminExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(account);
		criteria.andPasswordEqualTo(password);
		List<Admin> admins = adminService.selectAdminByExample(example);
		if (admins.size() > 0 && admins.get(0) != null) {
			session.setAttribute("admin", admins.get(0));
			return admins.get(0);
		}else{
			return null;
		}
		
	}

	/*
	 * 管理员首页招聘信息管理业务
	 */
	@RequestMapping("/index")
	public String indexPage(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "time", defaultValue = "") String time,
			@RequestParam(value = "account", defaultValue = "") String account,
			Map<String, Object> map) {
		PageHelper.startPage(pageNum, 10);
		List<RecruitmentInfo> list = recruitmentInfoService
				.selectByAccountAndTime("%" + account + "%", time);
		PageInfo<RecruitmentInfo> info = new PageInfo<>(list, 3);
		map.put("list", list);
		map.put("info", info);
		map.put("time", time);
		map.put("account", account);
		return "admin_index";
	}

	/*
	 * 管理员账号管理业务
	 */
	@RequestMapping("/accountManagement")
	public String accountManagement(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "time", defaultValue = "") String time,
			@RequestParam(value = "account", defaultValue = "") String account,
			@RequestParam(value = "type", defaultValue = "个人账号") String type,
			Map<String, Object> map) {
		PageHelper.startPage(pageNum, 10);
		if (type.equals("个人账号")) {
			IndividualUserExample example = new IndividualUserExample();
			com.zhaopin.model.IndividualUserExample.Criteria criteria = example
					.createCriteria();
			if (!time.trim().equals("")) {
				try {
					criteria.andIRegtimeGreaterThanOrEqualTo(new SimpleDateFormat(
							"yyyy-MM-dd").parse(time));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			criteria.andIAccountLike("%" + account + "%");
			List<IndividualUser> list = individualUserService
					.selectByExample(example);
			PageInfo<IndividualUser> info = new PageInfo<>(list, 3);
			map.put("list", list);
			map.put("info", info);
			map.put("time", time);
			map.put("account", account);
			map.put("type", type);
		}
		if (type.equals("企业账号")) {
			EnterpriseUserExample example = new EnterpriseUserExample();
			com.zhaopin.model.EnterpriseUserExample.Criteria criteria = example
					.createCriteria();
			if (!time.trim().equals("")) {
				try {
					criteria.andERegtimeGreaterThanOrEqualTo(new SimpleDateFormat(
							"yyyy-MM-dd").parse(time));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			criteria.andEAccountLike("%" + account + "%");
			List<EnterpriseUser> list = enterpriseUserService
					.selectByExample(example);
			PageInfo<EnterpriseUser> info = new PageInfo<>(list, 3);
			map.put("list", list);
			map.put("info", info);
			map.put("time", time);
			map.put("account", account);
			map.put("type", type);
		}
		return "admin_accountManagement";
	}

	/*
	 * 管理员修改个人信息业务
	 */
	@ResponseBody
	@RequestMapping("/modifyAdminInfo")
	public int modifyAdminInfo(Admin admin, HttpSession session) {
		admin.setId(((Admin) session.getAttribute("admin")).getId());
		int result = adminService.updateByPrimaryKeySelective(admin);
		if (result > 0) {
			AdminExample example = new AdminExample();
			Criteria criteria = example.createCriteria();
			criteria.andIdEqualTo(((Admin) session.getAttribute("admin"))
					.getId());
			List<Admin> list = adminService.selectAdminByExample(example);
			session.setAttribute("admin", list.get(0));
		}
		return result;
	}

	/*
	 * 管理员修改密码业务
	 */
	@ResponseBody
	@RequestMapping("/modifyPwd")
	public int modifyPwd(String newpwd,String oldpwd, HttpSession session) {
		int result=0; 
		if (!oldpwd.equals(((Admin)session.getAttribute("admin")).getPassword())) {
			return result;
		}
		Admin admin = new Admin();
		admin.setId(((Admin) session.getAttribute("admin")).getId());
		admin.setPassword(newpwd);
		result = adminService.updateByPrimaryKeySelective(admin);
		session.removeAttribute("admin");
		return result;
	}

	/*
	 * 激活账户业务
	 */
	@ResponseBody
	@RequestMapping("/accountStatus")
	public int accountStatus(int id,String type,int status) {
		int result=0;
		if (type.trim().equals("个人账号")) {
			IndividualUser individualUser = new IndividualUser();
			individualUser.setiId(id);
			if (status == 1) {
				individualUser.setAccStatus(-1);
			}
			if (status == -1) {
				individualUser.setAccStatus(1);
			}
			result=individualUserService.updateByPrimaryKeySelective(individualUser);
		}
		if (type.trim().equals("企业账号")) {
			EnterpriseUser enterpriseUser = new EnterpriseUser();
			enterpriseUser.seteId(id);
			if (status == 1) {
				enterpriseUser.setAccStatus(-1);
			}
			if (status == -1) {
				enterpriseUser.setAccStatus(1);
			}
			result= enterpriseUserService.updateByPrimaryKeySelective(enterpriseUser);
		}
		return result;
	}

	/*
	 * 审核招聘信息业务
	 */
	@RequestMapping("/recruitmentInfoState")
	public String recruitmentInfoState(
			@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "time", defaultValue = "") String time,
			@RequestParam(value = "account", defaultValue = "") String account,
			@RequestParam(value = "iId") Integer iId,
			@RequestParam(value = "state") Integer state,HttpServletRequest request) {
		RecruitmentInfo recruitmentInfo=new RecruitmentInfo();
		if (state==1) {
			recruitmentInfo.setState(-1);
		}
		if (state==-1) {
			recruitmentInfo.setState(1);
		}
		RecruitmentInfoExample example =new RecruitmentInfoExample();
		com.zhaopin.model.RecruitmentInfoExample.Criteria criteria=example.createCriteria();
		criteria.andIIdEqualTo(iId);
		recruitmentInfoService.updateByExampleSelective(recruitmentInfo, example);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("time", time);
		request.setAttribute("account", account);
		return "forward:index";
	}
	
	/*
	 * 模态框功能，根据招聘信息id删除招聘信息业务
	 * */
	@ResponseBody
	@RequestMapping("/delInfoById")
	public int delInfoById(int iId){
		int result=0;
		result=recruitmentInfoService.deleteByPrimaryKey(iId);
		return result;
	}
	
	
	/*
	 * 模态框数据，根据id查询招聘信息
	 * */
	@ResponseBody
	@RequestMapping("/getInRecruitmentInfoByiId")
	public RecruitmentInfo getInRecruitmentInfoByiId(int iId){
		RecruitmentInfoExample example=new RecruitmentInfoExample();
		com.zhaopin.model.RecruitmentInfoExample.Criteria criteria = example.createCriteria();
		criteria.andIIdEqualTo(iId);
		List<RecruitmentInfo> list= recruitmentInfoService.selectByExample(example);
		if (list!=null) {
			return list.get(0);
		}
			return null;
	}
	
	/*
	 * 模态框数据，根据id查询账号信息
	 * */
	@ResponseBody
	@RequestMapping("/selectAccountInfoByid")
	public Object selectAccountInfoByid(int id,String type){
		if (type.equals("企业账号")) {
			EnterpriseUserExample example=new EnterpriseUserExample();
			com.zhaopin.model.EnterpriseUserExample.Criteria criteria= example.createCriteria();
			criteria.andEIdEqualTo(id);
			List<EnterpriseUser> list= enterpriseUserService.selectByExample(example);
			return list.get(0);
		}else {
			IndividualUserExample example=new IndividualUserExample();
			com.zhaopin.model.IndividualUserExample.Criteria criteria= example.createCriteria();
			criteria.andIIdEqualTo(id);
			List<IndividualUser> list= individualUserService.selectByExample(example);
			return list.get(0);
		}
	}
	
	
	
	
	/*
	 * 管理员发布公告业务
	 */
	@RequestMapping("/announcement")
	public String announcement() {
		return "admin_announcement";
	}

	/*
	 * 跳转管理员登录页面
	 */
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "admin_login";
	}

	/*
	 * 跳到管理员个人信息页面
	 */
	@RequestMapping("/adminInfo")
	public String adminInfo() {
		return "admin_info";
	}

	/*
	 * 跳转到管理员信息修改页面
	 */
	@RequestMapping("/modifyAdminInfoPage")
	public String modifyAdminInfoPage() {
		return "admin_modifyAdminInfo";
	}

	/*
	 * 跳转到管理员修改密码页面
	 */
	@RequestMapping("/modifyPwdPage")
	public String modifyPwdPage() {
		return "admin_modifyPwd";
	}
	/*
	 * 注销管理员登录
	 * */
	@RequestMapping("/logOffUser")
	public String logOffUser(HttpSession session){
		if (session.getAttribute("admin")!=null) {
			session.removeAttribute("admin");
		}
		return "admin_login";
	}
	
	
	// 请求的参数的日期格式化
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,
				false));
	}
}
