package com.zhaopin.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaopin.model.EnterpriseUser;
import com.zhaopin.model.EnterpriseUserExample;
import com.zhaopin.model.EnterpriseUserExample.Criteria;
import com.zhaopin.service.EnterpriseUserService;

@RequestMapping("/enterprise")
@Controller
public class EnterpriseUserAction {
	@Autowired
	private EnterpriseUserService enterpriseUserService;
	
	
	
	
	/*
	 * 企业用户登录业务
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public int login(String account, String password, HttpSession session) {
		int reslut = -2;
		EnterpriseUserExample example = new EnterpriseUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEAccountEqualTo(account);
		criteria.andEPasswordEqualTo(password);
		List<EnterpriseUser> list = enterpriseUserService
				.selectByExample(example);
		if (list.size() > 0) {
			if (list.get(0).getAccStatus() == 1) {
				session.setAttribute("enterprise", list.get(0));
				reslut = 1;
			}else if(list.get(0).getAccStatus() == 0){
				reslut = 0;
			}else if(list.get(0).getAccStatus() == -1){
				reslut = -1;
			}
			
		}
		return reslut;
	}

	/*
	 * 注册企业用户业务
	 */
	@RequestMapping(value = "/register",method=RequestMethod.POST)
	public String register(EnterpriseUser eUser,HttpSession session) {
		eUser.seteRegtime(new Date());
		eUser.seteUpdatatime(new Date());
		eUser.setType("企业账号");// 设置用户角色
		eUser.setAccStatus(0);
		if (enterpriseUserService.insertSelective(eUser) > 0) {
			// 注册完之后查询
			EnterpriseUserExample example = new EnterpriseUserExample();
			Criteria criteria = example.createCriteria();
			criteria.andEAccountEqualTo(eUser.geteAccount());
			List<EnterpriseUser> list = enterpriseUserService
					.selectByExample(example);
			session.setAttribute("enterprise", list.get(0));
			
		}

		return "redirect:/enterprise/success";
	}
	/*
	 * ajax 根据姓名查找业务
	 */ 
	@ResponseBody
	@RequestMapping(value = "/getNameJson",method=RequestMethod.GET)
	public int getNameJson(String account) {
		int result=0;
		EnterpriseUserExample example = new EnterpriseUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEAccountEqualTo(account);
		List<EnterpriseUser> list = enterpriseUserService.selectByExample(example);
		if (list.size() > 0) {
			result=1;
		}
		return result;
	}

	/*
	 * 企业用户修改密码业务
	 */
	@ResponseBody
	@RequestMapping(value = "/modifyPwd", method = RequestMethod.POST)
	public int modifyPwd(String newpwd,String oldpwd, HttpSession session) {
		
		int result=0;
		if (!oldpwd.equals(((EnterpriseUser) session.getAttribute("enterprise")).getePassword())) {
			return result;
		}
		EnterpriseUser enterpriseUser = new EnterpriseUser();
		enterpriseUser.seteId(((EnterpriseUser) session
				.getAttribute("enterprise")).geteId());
		enterpriseUser.setePassword(newpwd);
		result = enterpriseUserService
				.updateByPrimaryKeySelective(enterpriseUser);
		session.removeAttribute("enterprise");
		return result;
	}
	
	/*
	 * 企业用户修改企业信息业务
	 * */
	@RequestMapping(value = "/modifyInfo", method = RequestMethod.POST)
	public String modifyInfo(EnterpriseUser eUser, HttpSession session) {
		eUser.seteId(((EnterpriseUser)session.getAttribute("enterprise")).geteId());
		eUser.seteUpdatatime(new Date());
		if (enterpriseUserService.updateByPrimaryKeySelective(eUser)>0) {
			EnterpriseUserExample example=new EnterpriseUserExample();
			Criteria criteria=example.createCriteria();
			criteria.andEIdEqualTo(((EnterpriseUser)session.getAttribute("enterprise")).geteId());
			List<EnterpriseUser> list=enterpriseUserService.selectByExample(example);
			session.setAttribute("enterprise",list.get(0));
		}
		return "redirect:/enterprise/infoPage";
	}
	
	
	/*
	 *用户退出业务
	 * */
	@RequestMapping("/logOffUser")
	public String exit(HttpSession session) {
		session.removeAttribute("enterprise");
		return "redirect:/enterprise/loginPage";
	}
	
	
	/*
	 * 跳到企业登录页面
	 * */
	@RequestMapping("/loginPage")
	public String loginPage(){
		return "qiye_login";
	}
	
	
	
	/*
	 * 跳转企业注册页面
	 */
	@RequestMapping(value = "/registerPage")
	public String registerPage() {
		return "qiye_register";
	}
	/*
	 * 企业注册成功页面
	 * */
	@RequestMapping(value="/success")
	public String successPage(){
		return "qiye_success";
	}
	
	
	/*
	 * 跳到企业信息页面
	 * */
	@RequestMapping("/infoPage")
	public String infoPage(){
		return "qiye_info";
	}
	
	/*
	 * 跳到企业信息修改页面
	 * */
	@RequestMapping(value = "/modifyInfoPage")
	public String modifyInfoPage() {
		return "qiye_modifyInfo";
	}
	
	/*
	 * 跳到企业用户修改密码页面
	 * */
	@RequestMapping(value = "/modifyPwdoPage")
	public String modifyPwdoPage() {
		return "qiye_modifyPwd";
	}
	
}
