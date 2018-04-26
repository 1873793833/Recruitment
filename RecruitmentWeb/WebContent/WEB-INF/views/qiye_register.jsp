<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>企业用户注册</title>
<!-- style.css -->
<link href="${webPath}/static/css/style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    	<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<%@include file="head.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-lg-3"></div>
			<div class="col-lg-6">
				<h3 class="text-center text-primary">企业会员注册</h3>
					<hr />
					<form name="registerForm" id="registerForm
					" class="form-horizontal" action="${webPath}/enterprise/register" method="post" onsubmit="return inspect()">
						<h5><strong class="text-warning">请设置帐号信息</strong></h5>
						<hr />
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eAccount"><strong class="text-danger">*</strong>&nbsp;用户账号:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eAccount" name="eAccount" placeholder="请输入账号">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="ePassword"><strong class="text-danger">*</strong>&nbsp;用户密码:</label>
							<div class="col-sm-10">
								<input class="form-control" type="password" id="ePassword" name="ePassword" placeholder="请输入密码">
							</div>
						</div>

						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="secondPwd"><strong class="text-danger">*</strong>&nbsp;确认密码:</label>
							<div class="col-sm-10">
								<input class="form-control" type="password" id="secondPwd" name="secondPwd" placeholder="请输入重发密码">
							</div>
						</div>
						
						<h5><strong class="text-warning">请填写企业信息(每项资料要求真实且完整, * 表示该项必填)</strong></h5>
						<hr />
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eCompanyName"><strong class="text-danger">*</strong>&nbsp;企业名称:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eCompanyName" name="eCompanyName" placeholder="请输入企业名称">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eCorporateSector"><strong class="text-danger">*</strong>&nbsp;企业领域:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eCorporateSector" name="eCorporateSector" placeholder="请输入企业领域">
							</div>
						</div>

						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eEnterpriseNature"><strong class="text-danger">*</strong>&nbsp;企业性质:</label>
							<div class="col-sm-10">
								<select class="form-control" id="eEnterpriseNature" name="eEnterpriseNature">
										<option value="民营企业">民营企业</option>
										<option value="私营企业">私营企业</option>
										<option value="三资企业">三资企业</option>
										<option value="股份制企业">股份制企业</option>
										<option value="行政机关">行政机关</option>
										<option value="社会团体">社会团体</option>
										<option value="事业单位">事业单位</option>
										<option value="国有企业">国有企业</option>
										<option value="集体企业">集体企业</option>
										<option value="集体事业">集体事业</option>
										<option value="乡镇企业">乡镇企业</option>
										<option value="跨国集团">跨国集团</option>
										<option value="外资企业">外资企业</option>
										<option value="其他" selected="selected">其他</option>
								</select>
							</div>
						</div>

						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eAddress"><strong class="text-danger">*</strong>&nbsp;公司地址:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eAddress" name="eAddress" placeholder="请输入公司地址">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eContacts"><strong class="text-danger">*</strong>&nbsp;联系人:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eContacts" name="eContacts" placeholder="请输入联系人">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eContactNumber"><strong class="text-danger">*</strong>&nbsp;联系电话:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eContactNumber" name="eContactNumber" placeholder="请输入联系电话">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="ePhoneNumber"><strong class="text-danger">*</strong>&nbsp;手机号码:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="ePhoneNumber" name="ePhoneNumber" placeholder="请输入手机号码">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eEmail"><strong class="text-danger">*</strong>&nbsp;电子信箱:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eEmail" name="eEmail" placeholder="请输入电子信箱">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-3"></div>
							<div class="col-sm-6">
								<button class="btn btn-primary form-control" type="submit">立即注册</button>
							</div>
							<div class="col-sm-3"></div>
						</div>
					</form>
					<br />
					<p class="text-center">
						<a href="${webPath}/enterprise/loginPage" target="_blank">已有帐号，去登录</a>
					</p>
			</div>
			<div class="col-lg-3"></div>
		</div>
	</div>
	<script type="text/javascript">
	var acc=0;
	
	function inspect(){
		var eAccount=document.getElementById("eAccount").value.trim();
		var ePassword= document.getElementById("ePassword").value.trim();
		var secondPwd=document.getElementById("secondPwd").value.trim();
		var eCompanyName=document.getElementById("eCompanyName").value.trim();
		var eCorporateSector=document.getElementById("eCorporateSector").value.trim();
		var eAddress=document.getElementById("eAddress").value.trim();
		var eContacts=document.getElementById("eContacts").value.trim();
		var eContactNumber=document.getElementById("eContactNumber").value.trim();
		var ePhoneNumber=document.getElementById("ePhoneNumber").value.trim();
		var eEmail=document.getElementById("eEmail").value.trim();
			if(eAccount==''||eAccount.length<4||eAccount.length>12){
				alert("请输入正确格式的账号!(4-12个字符)");
				return false;
			}
			if(ePassword==''||ePassword.length<6||ePassword.length>16){
				alert("请输入正确格式的密码！(6-16个字符)");
				return false;
			}
			if(secondPwd==''){
				alert("请输入重复密码");
				return false;
			}
			if(ePassword!=secondPwd){
				alert("两次输入密码不一致");
				return false;
			}
			if(acc==1){
				alert("该用户已被注册请重新输入!");
				return false;
			}
			if(eCompanyName==''||eCompanyName.length<1||eCompanyName.length>30){
				alert("请输入正确格式的企业名称!(1-30个字符)");
				return false;
			}
			if(eCorporateSector==''||eCorporateSector.length<1||eCorporateSector.length>20){
				alert("请输入正确格式的企业领域!(1-20个字符)");
				return false;
			}
			if(eAddress==''||eAddress.length<1||eAddress.length>99){
				alert("请输入正确格式的公司地址!(1-99个字符)");
				return false;
			}
			if(eContacts==''||eContacts.length<1||eContacts.length>20){
				alert("请输入正确格式的联系人!(1-20个字符)");
				return false;
			}
			if(eContactNumber==''||eContactNumber.length<1||eContactNumber.length>20){
				alert("请输入正确格式的联系电话!(1-20个字符)");
				return false;
			}
			if(ePhoneNumber==''||ePhoneNumber.length<1||ePhoneNumber.length>20){
				alert("请输入正确格式的手机号码!(1-20个字符)");
				return false;
			}
			if(eEmail==''||eEmail.length<1||eEmail.length>30){
				alert("请输入正确格式的电子信箱!(1-30个字符)");
				return false;
			}
			};
	$(document)
			.ready(
					function() {
						$("#eAccount").blur(function() {
							$.ajax({
								url : "${webPath}/enterprise/getNameJson",
								cache : false,
								type : "GET",
								dataType : "json",
								async : "true",
								data : {
									account : $("#eAccount").val()
								},
								success : function(msg) {
								if (msg>0){
									acc=1;
									$("#eAccount").val("");
									alert("该账号已被注册请重新输入!");
							    }else{
							    	acc=0;
							    }
								},
								error : function(errordata) {
									alert("出错啦！");
								}
							});
						});
					});
	
		
	</script>
</body>
</html>