package com.zhaopin.action;


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

import com.zhaopin.model.IndividualUser;
import com.zhaopin.model.IndividualUserExample;
import com.zhaopin.model.IndividualUserExample.Criteria;
import com.zhaopin.service.IndividualUserService;

@RequestMapping("/individual")
@Controller
public class IndividualUserAction {

	@Autowired
	private IndividualUserService individualUserService;
	
	/*
	 * 个人账户登录业务
	 */
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public int getindividualUsers(String account,String password,
			HttpSession session) {
		int result=0;
		IndividualUserExample example = new IndividualUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIAccountEqualTo(account);
		criteria.andIPasswordEqualTo(password);
		List<IndividualUser> list = individualUserService
				.selectByExample(example);
		if (list.size() > 0) {
			if (list.get(0).getAccStatus()==1) {
				session.setAttribute("individual", list.get(0));
				result=1;
			}else {
				result=-1;
			}
		}
		return result;
	}

	/*
	 * ajax 根据姓名查找业务
	 */ 
	@ResponseBody
	@RequestMapping(value = "/getNameJson",method=RequestMethod.GET)
	public int getNameJson(String account) {
		int result=0;
		IndividualUserExample example = new IndividualUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIAccountEqualTo(account);
		List<IndividualUser> list = individualUserService.selectByExample(example);
		if (list.size() > 0) {
			result=1;
		}
		return result;
	}

	
	/*
	 * 个人账户注册业务
	 * */
	@RequestMapping("/register")
	public String register(IndividualUser iUser, HttpSession session) {
		iUser.setiUpdatatime(new Date());
		iUser.setiRegtime(new Date());
		iUser.setType("个人账号");
		iUser.setAccStatus(1);
		if (individualUserService.insertSelective(iUser)>0) {
			// 查询
			IndividualUserExample example = new IndividualUserExample();
			Criteria criteria = example.createCriteria();
			criteria.andIAccountEqualTo(iUser.getiAccount());
			criteria.andIPasswordEqualTo(iUser.getiPassword());
			List<IndividualUser> list = individualUserService
					.selectByExample(example);
			session.setAttribute("individual", list.get(0));
		}
		return "redirect:/individual/registerSuccess";
	}
	
	
	/*
	 *用户退出业务
	 * */
	@RequestMapping("/logOffUser")
	public String exit(HttpSession session) {
		session.removeAttribute("individual");
		return "redirect:/individual/loginPage";
	}
	
	/*
	 *个人用户修改密码业务
	 * */
	@ResponseBody
	@RequestMapping(value = "/modifyPwd", method = RequestMethod.POST)
	public int modifyPwd(String newpwd ,String oldpwd, HttpSession session) {
		int result=0;
		if (!oldpwd.equals(((IndividualUser) session
				.getAttribute("individual")).getiPassword())) {
			return result;
		}
		IndividualUser individualUser = new IndividualUser();
		individualUser.setiId(((IndividualUser) session
				.getAttribute("individual")).getiId());
		individualUser.setiPassword(newpwd);
		result = individualUserService
				.updateByPrimaryKeySelective(individualUser);
		session.removeAttribute("individual");
		return result;
	}
	

	/*
	 *个人用户修改信息业务
	 * */
	@RequestMapping(value = "/modifyInfo", method = RequestMethod.POST)
	public String modifyInfo(IndividualUser iUser, HttpSession session) {
		iUser.setiUpdatatime(new Date());
		iUser.setiId(((IndividualUser)session.getAttribute("individual")).getiId());
		if (individualUserService.updateByPrimaryKeySelective(iUser)>0) {
			IndividualUserExample example=new IndividualUserExample();
			Criteria criteria=example.createCriteria();
			criteria.andIIdEqualTo(((IndividualUser)session.getAttribute("individual")).getiId());
			List<IndividualUser> list=individualUserService.selectByExample(example);
			session.setAttribute("individual",list.get(0));
		}
		return "redirect:/individual/infoPage";
	}
	/*
	 * 跳转到用户信息页面
	 * */
	@RequestMapping("/infoPage")
	public String infoPage(){
		return "geren_info";
	}
	/*
	 * 跳转到编写简历页面
	 * */
	@RequestMapping("/writeResumePage")
	public String writeResumePage(@RequestParam(value="eid",defaultValue="0")Integer eid,
			@RequestParam(value="rid",defaultValue="0")Integer rid,
			@RequestParam(value="position",defaultValue="position") String position,
			Map<String,Object> map){
		map.put("eid", eid);
		map.put("rid", rid);
		map.put("position", position);
		return "geren_submitResume";
	}
	
	/*
	 * 跳转到个人用户信息修改页面
	 * */
	@RequestMapping("/modifyInfoPage")
	public String modifyInfoPage() {
		return "geren_modifyInfo";
	}
	
	/*
	 * 跳转到个人用户密码修改页面
	 * */
	@RequestMapping("/modifyPwdPage")
	public String modifyPwdPage() {
		return "geren_modifyPwd";
	}
	
	/*
	 * 跳转到个人用户登录页面
	 * */
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "geren_login";
	}
	/*
	 * 跳转到个人用户注册页面
	 * */
	@RequestMapping("/registerPage")
	public String registerPage() {
		return "geren_register";
	}
	/*
	 * 注册成功页面
	 * */
	@RequestMapping("/registerSuccess")
	public String registerSuccess() {
		return "geren_success";
	}
	
	
	/*
	 * 请求的参数的日期格式化
	 * */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,
				false));
	}
}
