/**
 * 
 */
function isNull(eCompanyName,eCorporateSector,eAddress,eContacts,eContactNumber,ePhoneNumber,eEmail){
	if(eCompanyName==''){
		alert("请输入公司名称");
		return false;
	}
}

function login() {
	if (document.loginForm.email.value.trim() == "") {
		alert("请输入邮箱！");
		return false;
	}
	if (document.loginForm.password.value.trim() == "") {
		alert("请输入密码！");
		return false;
	}
}




function registerIuser() {
	if (document.regIuserForm.uEmail.value.trim() == "") {
		alert("请输入正确邮箱账号！");
		return false;
	}
	if (document.regIuserForm.uPassword.value.trim() == "") {
		alert("请输入注册密码！");
		return false;
	}
	if (document.regIuserForm.uPassword2.value.trim() == "") {
		alert("请再次输入密码！");
		return false;
	}
	if (document.regIuserForm.uPassword.value != document.registerForm.uPassword2.value) {
		alert("两次输入密码不一致！");
		return false;
	}
}

function registerEuser() {
	if (document.regEuserForm.eEmail.value.trim() == "") {
		alert("请输入正确邮箱账号！");
		return false;
	}
	if (document.regEuserForm.ePassword.value.trim() == "") {
		alert("请输入注册密码！");
		return false;
	}
	if (document.regEuserForm.ePassword2.value.trim() == "") {
		alert("请再次输入密码！");
		return false;
	}
	if (document.regEuserForm.ePassword.value != document.registerForm.ePassword2.value) {
		alert("两次输入密码不一致！");
		return false;
	}

	function recruitmentInfo() {
		if (document.recruitmentInfoForm.position.value.trim() == ""
				&& documet.recruitmentInfoForm.position.length > 10) {
			alert("请输入小于10个字符的职位信息！");
			return false;
		}
		if (document.recruitmentInfoForm.companyName.value.trim() == "") {
			alert("请输入公司名称！");
			return false;
		}
		if (document.recruitmentInfoForm.companyType.value.trim() == "") {
			alert("请输入公司性质！");
			return false;
		}
		if (document.recruitmentInfoForm.operationDirection.value.trim() == "") {
			alert("请输入运营方向！");
			return false;
		}
		if (document.recruitmentInfoForm.salary.value.trim() == "") {
			alert("请输入工作薪资！");
			return false;
		}
		if (document.recruitmentInfoForm.workingPlace.value.trim() == "") {
			alert("请输入工作地点！");
			return false;
		}
		if (document.recruitmentInfoForm.positionType.value.trim() == "") {
			alert("请输入职能类别！");
			return false;
		}
		if (document.recruitmentInfoForm.keyword.value.trim() == "") {
			alert("请输入公司福利！");
			return false;
		}
		if (document.recruitmentInfoForm.jobRequirements.value.trim() == "") {
			alert("请输入职位要求！");
			return false;
		}
		if (document.recruitmentInfoForm.contactInfo.value.trim() == "") {
			alert("请输入联系方式！");
			return false;
		}
		if (document.recruitmentInfoForm.companyInfo.value.trim() == "") {
			alert("请输入公司信息！");
			return false;
		}
	}

	function resume() {
		if (document.resumeForm.rName.value.trim() == "") {
			alert("请输入姓名！");
			return false;
		}
		if (document.resumeForm.rAge.value.trim() == "") {
			alert("请输入年龄！");
			return false;
		}
		if (document.resumeForm.rTel.value.trim() == "") {
			alert("请输入电话！");
			return false;
		}
		if (document.resumeForm.rEmail.value.trim() == "") {
			alert("请输入邮箱！");
			return false;
		}
		if (document.resumeForm.residentialAddress.value.trim() == "") {
			alert("请输入地址！");
			return false;
		}
		if (document.resumeForm.skillSpecialty.value.trim() == "") {
			alert("请输入技能特长！");
			return false;
		}
		if (document.resumeForm.hobby.value.trim() == "") {
			alert("请输入兴趣爱好！");
			return false;
		}
		if (document.resumeForm.jobPosition.value.trim() == "") {
			alert("请输入职位！");
			return false;
		}
		if (document.resumeForm.workNature.value.trim() == "") {
			alert("请输入工作性质！");
			return false;
		}
		if (document.resumeForm.expectedSalary.value.trim() == "") {
			alert("请输入薪资！");
			return false;
		}
		if (document.resumeForm.workingPlace.value.trim() == "") {
			alert("请输入工作地点！");
			return false;
		}
		if (document.resumeForm.education.value.trim() == "") {
			alert("请输入教育背景！");
			return false;
		}
		if (document.resumeForm.experience.value.trim() == "") {
			alert("请输入工作经验！");
			return false;
		}
		if (document.resumeForm.honour.value.trim() == "") {
			alert("请输入奖项荣誉！");
			return false;
		}
		if (document.resumeForm.evaluation.value.trim() == "") {
			alert("请输入自我评价！");
			return false;
		}
	}

	function confirmDialog() {
		return confirm("确定退出该用户吗？");
	}
}
