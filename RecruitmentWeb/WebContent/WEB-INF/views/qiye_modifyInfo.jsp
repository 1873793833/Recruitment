<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>企业信息</title>

<!-- admin.css -->
<link href="${webPath}/static/css/admin.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    	<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<%@include file="head.jsp" %>
	<div class="container">
		<%@include file="qiye_head.jsp"%>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a href="${webPath}/resumeInfo/getInfoByid">简历箱</a></li>
						<li><a href="${webPath}/recruitmentInfo/getRinfosByEid">招聘管理</a></li>
						<li><a href="${webPath}/recruitmentInfo/addRinfoPage">发布招聘</a></li>
						<li class="active"><a href="${webPath}/enterprise/infoPage">企业信息</a></li>
						<li><a href="${webPath}/enterprise/modifyPwdoPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<div class="col-sm-8 col-md-8">
						<h4 class="text-center text-primary">企业会员信息修改</h4>
						<hr />
						<form class="form-horizontal"
							action="${webPath}/enterprise/modifyInfo" onsubmit="return inspect();" method="post">
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="eCompanyName"><strong
									class="text-danger">*</strong>&nbsp;企业名称:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="eCompanyName"
										name="eCompanyName" value="${enterprise.eCompanyName }" readonly="readonly">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="eCorporateSector"><strong
									class="text-danger">*</strong>&nbsp;企业领域:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="eCorporateSector"
										name="eCorporateSector"
										value="${enterprise.eCorporateSector }" readonly="readonly">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="eEnterpriseNature"><strong
									class="text-danger">*</strong>&nbsp;企业性质:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="eEnterpriseNature"
										name="eEnterpriseNature" value="${enterprise.eEnterpriseNature}" readonly="readonly">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="eAddress"><strong
									class="text-danger">*</strong>&nbsp;公司地址:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="eAddress"
										name="eAddress" value="${enterprise.eAddress }">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="eContacts"><strong
									class="text-danger">*</strong>&nbsp;联系人:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="eContacts"
										name="eContacts" value="${enterprise.eContacts}"
										placeholder="请输入联系人">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="eContactNumber"><strong
									class="text-danger">*</strong>&nbsp;联系电话:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="eContactNumber"
										name="eContactNumber" value="${enterprise.eContactNumber }"
										placeholder="请输入联系电话">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="ePhoneNumber"><strong
									class="text-danger">*</strong>&nbsp;手机号码:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="ePhoneNumber"
										name="ePhoneNumber" value="${enterprise.ePhoneNumber }"
										placeholder="请输入手机号码">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="eEmail"><strong
									class="text-danger">*</strong>&nbsp;电子信箱:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="eEmail"
										name="eEmail" value="${enterprise.eEmail }"
										placeholder="请输入电子信箱">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-4">
								</div>
								<div class="col-sm-4">
									<button type="submit" class="btn btn-primary form-control">修改企业信息</button>
								</div>
								<div class="col-sm-4">
									<a href="${webPath}/enterprise/infoPage" class="btn btn-default form-control">取消修改</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<script type="text/javascript">
		
		function inspect(){
			var eAddress =document.getElementById("eAddress").value.trim();
			var eContacts= document.getElementById("eContacts").value.trim();
			var eContactNumber=document.getElementById("eContactNumber").value.trim();
			var ePhoneNumber=document.getElementById("ePhoneNumber").value.trim();
			var eEmail=document.getElementById("eEmail").value.trim();
			if(eAddress.length<1||eAddress.length>100){
				alert("请输入地址(限100个字符以内)");
				return false;
			}
			if(eContacts.length<1||eContacts.length>25){
				alert("请输入联系人(限25个字符以内)");
				return false;
			}
			if(eContactNumber.length<1||eContactNumber.length>20){
				alert("请输入联系电话(限20个字符以内)");
				return false;
			}
			if(ePhoneNumber.length<1||ePhoneNumber.length>20){
				alert("请输入正确格式的手机号码");
				return false;
			}
			if(eEmail.length<1||eEmail.length>50){
				alert("请输入正确格式的电子信箱");
				return false;
			}
			var con= confirm("是否提交该信息?");
			if(con!=true){
				return false;
			}
		}
	</script>
</body>
</html>