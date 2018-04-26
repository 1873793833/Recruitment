<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>完善信息</title>

<!-- style.css -->
<link href="${webPath}/static/css/style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    	<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<!-- 个人简历编写-->
<body>
<%@include file="head.jsp" %>
	<div class="container">
		<%@include file="geren_head.jsp"%>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a href="${webPath}/resumeInfo/getInfoByIid">我的简历</a></li>
						<li><a href="${webPath}/resumeInfo/getDraftsByIid">草稿箱</a></li>
						<li class="active"><a href="${webPath}/individual/infoPage">个人信息</a></li>
						<li><a href="${webPath}/individual/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					
					<div class="col-sm-8 col-md-10">
						<form class="form-horizontal"
							action="${webPath}/individual/modifyInfo" method="post" onsubmit="return inspect()">
							<h4 class="text-primary">基本资料Basic information</h4>
							<div class="row">
								<div class="col-sm-6 col-md-6">
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iName"><strong
											class="text-danger">*</strong>&nbsp;姓名:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iName"
												name="iName" placeholder="请输入姓名" value="${individual.iName}">
										</div>
									</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iSex"><strong class="text-danger">*</strong>&nbsp;性别:</label>
											<div class="col-sm-9">
												<select class="form-control" id="iSex" name="iSex">
												<option value="" <c:if test="${individual.iSex==null&&individual.iSex==''}">selected="selected"</c:if>>请选择</option> 
												<option value="男" <c:if test="${individual.iSex=='男'}">selected="selected"</c:if>>男</option> 
												<option value="女" <c:if test="${individual.iSex=='女'}">selected="selected"</c:if>>女</option>
												</select>
											</div>
										</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iNation"><strong
											class="text-danger">*</strong>&nbsp;民族:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iNation"
												name="iNation" placeholder="请输入名族" value="${individual.iNation}">
										</div>
									</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iDataOfBirth"><strong
											class="text-danger">*</strong>&nbsp;出生日期:</label>
										<div class="col-sm-9">
											
											<input class="form-control" type="date" id="iDataOfBirth"
												name="iDataOfBirth" value="<fmt:formatDate value="${individual.iDataOfBirth}" pattern="yyyy-MM-dd"/>">
										</div>
									</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iMajor"><strong
											class="text-danger">*</strong>&nbsp;专业:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iMajor"
												name="iMajor" placeholder="请输入专业" value="${individual.iMajor}">
										</div>
									</div>
								</div>
								<div class="col-sm-6 col-md-6">
									
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iGraduateSchool"><strong
											class="text-danger">*</strong>&nbsp;毕业院校:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iGraduateSchool"
												name="iGraduateSchool" placeholder="请输入毕业院校" value="${individual.iGraduateSchool}">
										</div>
									</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iDomicile"><strong
											class="text-danger">*</strong>&nbsp;地址:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iDomicile"
												name="iDomicile" placeholder="请输入地址" value="${individual.iDomicile}">
										</div>
									</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iEmail"><strong
											class="text-danger">*</strong>&nbsp;邮箱:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iEmial"
												name="iEmial" placeholder="请输入邮箱" value="${individual.iEmial}"></div>
									</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iPostCode"><strong
											class="text-danger">*</strong>&nbsp;邮编:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iPostCode"
												name="iPostCode" placeholder="请输入邮编" value="${individual.iPostCode}">
										</div>
									</div>
									<div class="form-group form-group-sm">
										<label class="col-sm-3 control-label" for="iTel"><strong
											class="text-danger">*</strong>&nbsp;联系电话:</label>
										<div class="col-sm-9">
											<input class="form-control" type="text" id="iTel" name="iTel"
												placeholder="请输入联系电话" value="${individual.iTel}">
										</div>
									</div>
								</div>
							</div>
							<h4 class="text-primary">求职意向Job Hunting Intention</h4>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="iJobIntension"><strong
									class="text-danger">*</strong>&nbsp;求职意向:</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="iJobIntension"
										name="iJobIntension">${individual.iJobIntension}</textarea>
								</div>
							</div>

							
							<h4 class="text-primary">教育背景Education background</h4>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="iEducationalBg"><strong
									class="text-danger">*</strong>&nbsp;教育背景:</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="iEducationalBg"
										name="iEducationalBg">${individual.iEducationalBg}</textarea>
								</div>
							</div>
							<h4 class="text-primary">职业技能 Vocational skills</h4>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="iSkill"><strong
									class="text-danger">*</strong>&nbsp;职业技能:</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="iSkill"
										name="iSkill">${individual.iSkill}</textarea>
								</div>
							</div>
							<h4 class="text-primary">工作经历 Work experience</h4>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="iExperience"><strong
									class="text-danger">*</strong>&nbsp;工作经历:</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="iExperience"
										name="iExperience">${individual.iExperience}</textarea>
								</div>
							</div>
							<h4 class="text-primary">自我评价 Self evaluation</h4>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="iEvaluation"><strong
									class="text-danger">*</strong>&nbsp;自我评价:</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="iEvaluation"
										name="iEvaluation">${individual.iEvaluation}</textarea>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-2 control-label" for="iHobby"><strong
									class="text-danger">*</strong>&nbsp;兴趣爱好:</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="iHobby"
										name="iHobby">${individual.iHobby}</textarea>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-2"></div>
								<div class="col-sm-4">
									<button class="btn form-control btn-primary btn-block"
										type="submit">提交信息</button>
								</div>
								<div class="col-sm-4">
									<a class="btn form-control btn-default btn-block"
										href="${webPath}/individual/infoPage">取消编辑</a>
								</div>
								<div class="col-sm-2"></div>
							</div>
						</form>
					</div>
					<div class="col-sm-2 col-md-1"></div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		
		function inspect(){
			var iName= document.getElementById("iName").value.trim();
			var iSex= document.getElementById("iSex").value.trim();
			var iNation=document.getElementById("iNation").value.trim();
			var iDataOfBirth=document.getElementById("iDataOfBirth").value.trim();
			var iMajor=document.getElementById("iMajor").value.trim();
			var iGraduateSchool=document.getElementById("iGraduateSchool").value.trim();
			var iDomicile=document.getElementById("iDomicile").value.trim();
			var iEmail=document.getElementById("iEmail").value.trim();
			var iPostCode=document.getElementById("iPostCode").value.trim();
			var iTel=document.getElementById("iTel").value.trim();
			var iJobIntension=document.getElementById("iJobIntension").value.trim();
			var iEducationalBg=document.getElementById("iEducationalBg").value.trim();
			var iSkill=document.getElementById("iSkill").value.trim();
			var iExperience=document.getElementById("iExperience").value.trim();
			var iEvaluation=document.getElementById("iEvaluation").value.trim();
			var iHobby=document.getElementById("iHobby").value.trim();
			alert(1);
			if(iName==""||iName.length>10){
				alert("请输入姓名(限10个字符以内)");
				return false;
			}
			alert(2);
			if(iSex==""){
				alert("请选择性别");
				return false;
			}
			alert(3);
			if(iNation==""||iNation.length>50){
				alert("请输入正确格式的民族");
				return false;
			}
			alert(4);
			if(iDataOfBirth==""){
				alert("请选择出身日期");
				return false;
			}
			alert(5);
			if(iMajor.length>50){
				alert("专业限50个字符的输入");
				return false;
			}
			alert(6);
			if(iGraduateSchool.length>50){
				alert("毕业院校限50个字符的输入");
				return false;
			}
			alert(7);
			if(iDomicile==""||iDomicile.length>500){
				alert("请输入正确的居住地址(限500个字符以内)");
				return false;
			}
			alert(8);
			if(iEmail==""||iEmail.length>25){
				alert("请输入正确格式的邮箱(25个字符以内)");
				return false;
			}
			alert(9);
			if(iPostCode>10){
				alert("请输入正确格式的邮编");
				return false;
			}
			alert(10);
			if(iTel.length>12||iTel.length<1){
				alert("请输入正确格式的联系电话");
				return false;
			}
			alert(11);
			if(iJobIntension>500){
				alert("求职意向限500个字符以内的输入");
				return false;
			}
			alert(12);
			if(iEducationalBg>1000){
				alert("教育背景限1000个字符以内的输入");
				return false;
			}
			alert(13);
			if(iSkill.length>500){
				alert("职业技能限500个字符以内的输入");
				return false;
			}
			alert(14);
			if(iExperience.length>500){
				alert("工作经验限500个字符以内的输入");
				return false;
			}
			alert(15);
			if(iEvaluation.length>500){
				alert("自我评价限500个字符以内的输入");
				return false;
			}
			alert(16);
			if(iHobby.length>500){
				alert("兴趣爱好限500个字符以内的输入");
				return false;
			}
			alert(17);
			var con= confirm("是否提交该信息?(建议完善信息,方便后续简历的编写)");
			if(con!=true){
				return false;
			}
		}
	</script>
</body>
</html>