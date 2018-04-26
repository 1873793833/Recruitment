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
		<%@include file="qiye_head.jsp" %>
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
					<div class="col-sm-2 col-md-2"></div>
					<div class="col-sm-10 col-md-10">
						<div class="form-horizontal">
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eAccount"><strong
									class="text-danger">*</strong>&nbsp;用户账号:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eAccount}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eCompanyName"><strong
									class="text-danger">*</strong>&nbsp;企业名称:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eCompanyName}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eCorporateSector"><strong
									class="text-danger">*</strong>&nbsp;企业领域:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eCorporateSector}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eEnterpriseNature"><strong
									class="text-danger">*</strong>&nbsp;企业性质:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eEnterpriseNature}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eAddress"><strong
									class="text-danger">*</strong>&nbsp;公司地址:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eAddress}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eContacts"><strong
									class="text-danger">*</strong>&nbsp;联系人:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eContacts}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eContactNumber"><strong
									class="text-danger">*</strong>&nbsp;联系电话:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eContactNumber}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="ePhoneNumber"><strong
									class="text-danger">*</strong>&nbsp;手机号码:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.ePhoneNumber}</p>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="eEmail"><strong
									class="text-danger">*</strong>&nbsp;电子信箱:</label>
								<div class="col-sm-10">
									<p class="form-control-static">${enterprise.eEmail}</p>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-6">
									<a href="${webPath}/enterprise/modifyInfoPage"
										class="btn btn-primary form-control">修改企业信息</a>
								</div>
								<div class="col-sm-3"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
</body>
</html>