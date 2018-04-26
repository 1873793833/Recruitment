<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>简历提交</title>

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
		<div class="row">
			<div class="col-lg-2 col-sm-1"></div>
			<div class="col-lg-8 col-sm-10">
			<h3 class="text-center">填写简历</h3>
				<form class="form-horizontal" id="resumeForm" name="resumeForm"
					method="post">
					<h4 class="text-primary">
						<span class="glyphicon glyphicon-tree-conifer"></span> 基本资料Basic
						information
					</h4>
					<div class="row">
						<div class="col-sm-6">
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rPosition"><strong
									class="text-danger">*</strong>&nbsp;应聘职位:</label>
								<div class="col-sm-8">
									<input id="rId" name="rId" type="hidden"> <input
										class="form-control" type="text" id="rPosition"
										name="rPosition" readonly="readonly" value="${position}">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rName"><strong
									class="text-danger">*</strong>&nbsp;姓名:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rName" name="rName"
										value="${individual.iName }">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rSex"><strong
									class="text-danger">*</strong>&nbsp;性别:</label>
								<div class="col-sm-8">
									<select class="form-control" id="rSex" name="rSex">
											<option value=""<c:if test="${individual.iSex==null&&individual.iSex==''}">selected="selected"</c:if>>请选择</option>
											<option value="男"<c:if test="${individual.iSex=='男'}">selected="selected"</c:if>>男</option>
											<option value="女"<c:if test="${individual.iSex=='女'}">selected="selected"</c:if>>女</option>
										</select>
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rNation"><strong
									class="text-danger">*</strong>&nbsp;民族:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rNation"
										name="rNation" value="${individual.iNation }">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rEducationBg"><strong
									class="text-danger">*</strong>&nbsp;学历:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rEducationBg"
										name="rEducationBg" value="${individual.iEducationalBg}">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rTel"><strong
									class="text-danger">*</strong>&nbsp;联系电话:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rTel" name="rTel"
										value="${individual.iTel }">
								</div>
							</div>
						</div>
						<div class="col-sm-6">
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rDataOfBirth"><strong
									class="text-danger">*</strong>&nbsp;出生日期:</label>
								<div class="col-sm-8">
									<input class="form-control" type="date" id="rDataOfBirth"
										name="rDataOfBirth"
										value="<fmt:formatDate
								value="${individual.iDataOfBirth}" pattern="yyyy-MM-dd" />">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rMajor"><strong
									class="text-danger">*</strong>&nbsp;专业:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rMajor"
										name="rMajor" value="${individual.iMajor }">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rGraduateSchool"><strong
									class="text-danger">*</strong>&nbsp;毕业院校:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rGraduateSchool"
										name="rGraduateSchool" value="${individual.iGraduateSchool }">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rDomicile"><strong
									class="text-danger">*</strong>&nbsp;住所:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rDomicile"
										name="rDomicile" value="${individual.iDomicile }">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rEmail"><strong
									class="text-danger">*</strong>&nbsp;邮箱:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rEmail"
										name="rEmail" value="${individual.iEmial }">
								</div>
							</div>
							<div class="form-group form-group-sm">
								<label class="col-sm-4 control-label" for="rPostCode"><strong
									class="text-danger">*</strong>&nbsp;邮编:</label>
								<div class="col-sm-8">
									<input class="form-control" type="text" id="rPostCode"
										name="rPostCode" value="${individual.iPostCode }">
								</div>
							</div>
						</div>
					</div>
					<h4 class="text-primary">
						<span class="glyphicon glyphicon-leaf"></span>职业技能 Vocational
						skills
					</h4>
					<div class="form-group form-group-sm">
						<label class="col-sm-2 control-label" for="rSkillSpecialty"><strong
							class="text-danger">*</strong>&nbsp;职业技能:</label>
						<div class="col-sm-10">
							<textarea class="form-control" rows="3" id="rSkillSpecialty"
								name="rSkillSpecialty">${individual.iSkill }</textarea>
						</div>
					</div>
					<h4 class="text-primary">
						<span class="glyphicon glyphicon-grain"></span> 工作经历 Work
						experience
					</h4>
					<div class="form-group form-group-sm">
						<label class="col-sm-2 control-label" for="rExperience"><strong
							class="text-danger">*</strong>&nbsp;工作经历:</label>
						<div class="col-sm-10">
							<textarea class="form-control" rows="3" id="rExperience"
								name="rExperience">${individual.iExperience }</textarea>
						</div>
					</div>
					<h4 class="text-primary">
						<span class="glyphicon glyphicon-apple"></span> 自我评价 Self
						evaluation
					</h4>
					<div class="form-group form-group-sm">
						<label class="col-sm-2 control-label" for="rEvaluation"><strong
							class="text-danger">*</strong>&nbsp;自我评价:</label>
						<div class="col-sm-10">
							<textarea class="form-control" rows="3" id="rEvaluation"
								name="rEvaluation">${individual.iEvaluation }</textarea>
						</div>
					</div>
					<div class="form-group form-group-sm">
						<label class="col-sm-2 control-label" for="rHobby"><strong
							class="text-danger">*</strong>&nbsp;兴趣爱好:</label>
						<div class="col-sm-10">
							<textarea class="form-control" rows="3" id="rHobby" name="rHobby">${individual.iHobby }</textarea>
							<input id="drafts" name="drafts" type="hidden"> <input
								id="recruitmentInfoid" name="recruitmentInfoid" type="hidden"
								value="${rid}"> <input id="eId" name="eId" type="hidden"
								value="${eid }">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-6">
							<button id="manuscriptBtn" name="manuscriptBtn"
								class="btn form-control btn-primary btn-block" type="button">存入草稿箱</button>
						</div>
						<div class="col-sm-6">
							<button id="submitResumeBtn" name="submitResumeBtn"
								class="btn form-control btn-warning btn-block" type="button">提交简历</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-lg-2 col-sm-1"></div>
		</div>
	</div>
	<script type="text/javascript">
		
		$(document).ready(function() {
			//将简历放到草稿箱
			$("#manuscriptBtn").click(f("存入"));
			//投递简历
			
			$("#submitResumeBtn").click(f("未存入"));
		});

		var f = function(info) {
			return function() {
				if(info=="未存入"){
					if(inspect()==false){
						return false;
					}
				}
				var con=confirm("完善简历信息能让HR更加关注你,是否确认操作?");
				if(con!=true){
					return false;
				}
				$("#drafts").val(info);
				$.ajax({
					url : "${webPath}/resumeInfo/submitResume",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : $("#resumeForm").serialize(),
					success : function(msg) {
						if (msg > 0) {
							alert("操作成功!");
							window.location.href="${webPath}/resumeInfo/getDraftsByIid";
						} else {
							alert("操作失败,请重试!");
						}
					},
					error : function(errordata) {
						alert("出错啦！");
					}
				});
			};
		};
		function inspect(){
			var rName=document.getElementById("rName").value.trim();
			var rSex=document.getElementById("rSex").value.trim();
			var rNation=document.getElementById("rNation").value.trim();
			var rEducationBg=document.getElementById("rEducationBg").value;
			var rTel=document.getElementById("rTel").value.trim();
			var rDataOfBirth=document.getElementById("rDataOfBirth").value.trim();
			var rMajor=document.getElementById("rMajor").value.trim();
			var rGraduateSchool=document.getElementById("rGraduateSchool").value.trim();
			var rDomicile=document.getElementById("rDomicile").value.trim();
			var rEmail=document.getElementById("rEmail").value.trim();
			var rPostCode=document.getElementById("rPostCode").value.trim();
			var rSkillSpecialty=document.getElementById("rSkillSpecialty").value.trim();
			var rExperience=document.getElementById("rExperience").value.trim();
			var rEvaluation=document.getElementById("rEvaluation").value.trim();
			var rHobby=document.getElementById("rHobby").value.trim();
			if(rName ==''||rName.length>10){
				alert("请输入姓名!(限10个字符以内)");
				return false;
			}
			if(rSex ==''){
				alert("请选择性别!");
				return false;
			}
			if(rNation==''||rNation.length>100){
				alert("请输入正确的民族!");
				return false;
			}
			if(rEducationBg==''||rEducationBg.length>1000){
				alert("请输入学历!(限1000个字符以内)");
				return false;
			}; 
			if(rTel==''||rTel.length>20){
				alert("请输入正确格式的联系电话!");
				return false;
			}
			if(rDataOfBirth==''){
				alert("请输入出生日期!");
				return false;
			}
			if(rMajor==''||rMajor.length>255){
				alert("请输入专业!(限255个字符以内)");
				return false;
			}
			if(rGraduateSchool==''||rGraduateSchool.length>255){
				alert("请输入毕业院校!(限255个字符以内)");
				return false;
			}
			if(rDomicile==''||rDomicile.length>100){
				alert("请输入现居地址!(限100个字符以内)");
				return false;
			};
			if(rEmail==''||rEmail.length>30){
				alert("请输入正确格式的邮箱!");
				return false;
			}
			if(rPostCode==''||rPostCode.length>10){
				alert("请输入邮编!(限10个字符以内)");
				return false;
			} 
			if(rSkillSpecialty==''||rSkillSpecialty.length>500){
				alert("请输入职业技能!(限500个字符以内)");
				return false;
			} 
			if(rExperience==''||rExperience.length>1000){
				alert("请输入工作经历!(限1000个字符以内)");
				return false;
			} 
			if(rEvaluation==''||rEvaluation.length>1000){
				alert("请输入自我评价!(限1000个字符以内)");
				return false;
			} 
			if(rHobby==''||rHobby.length>500){
				alert("请输入兴趣爱好!(限500个字符以内)");
				return false;
			} 
			
		}
	</script>

</body>
</html>