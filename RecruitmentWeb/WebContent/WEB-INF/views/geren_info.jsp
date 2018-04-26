<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>个人信息</title>
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
		<%@include file="geren_head.jsp" %>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a
							href="${webPath}/resumeInfo/getInfoByIid">我的简历</a></li>
						<li><a href="${webPath}/resumeInfo/getDraftsByIid">草稿箱</a></li>
						<li  class="active"><a href="${webPath}/individual/infoPage">个人信息</a></li>
						<li><a href="${webPath}/individual/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<div class="col-sm-6 col-md-6 form-horizontal" >
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;姓名:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iName}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;性别:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iSex}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;民族:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iNation}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;出生日期:</label>
							<div class="col-sm-9">
								<p class="form-control-static"><fmt:formatDate value="${individual.iDataOfBirth}" pattern="yyyy-MM-dd" ></fmt:formatDate></p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;邮箱:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iEmial}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;求职意向:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iJobIntension}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;教育背景:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iEducationalBg}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;职业技能:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iSkill}</p>
							</div>
						</div>
					</div>
					<div class="col-sm-6 col-md-6 form-horizontal" >
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;专业:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iMajor}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;毕业院校:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iGraduateSchool}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;住所</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iDomicile}</p>
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;邮编:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iPostCode}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;联系电话:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iTel}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;工作经历:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iExperience}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;自我评价:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iEvaluation}</p>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-3 control-label"><strong
								class="text-danger">*</strong>&nbsp;兴趣爱好:</label>
							<div class="col-sm-9">
								<p class="form-control-static">${individual.iHobby}</p>
							</div>
						</div>
					</div>
					
					<div class="form-horizontal">
						<div class="form-group">
							<div class="col-sm-2"></div>
							<div class="col-sm-6">
								<a href="${webPath}/individual/modifyInfoPage"
									class="btn form-control btn-primary btn-block">修改/完善个人信息</a>
							</div>
							<div class="col-sm-4"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->

</body>
</html>
