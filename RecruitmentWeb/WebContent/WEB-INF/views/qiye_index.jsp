<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>简历箱</title>
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
						<li class="active"><a href="${webPath}/resumeInfo/getInfoByid">简历箱</a></li>
						<li><a href="${webPath}/recruitmentInfo/getRinfosByEid">招聘管理</a></li>
						<li><a href="${webPath}/recruitmentInfo/addRinfoPage">发布招聘</a></li>
						<li><a href="${webPath}/enterprise/infoPage">企业信息</a></li>
						<li><a href="${webPath}/enterprise/modifyPwdoPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">

					<form class="form-inline" action="${webPath}/resumeInfo/getInfoByid" method="post">
						<div class="form-group">
							<label>简历状态:</label> <select class="form-control" name="state">
								<option value="0" <c:if test="${state==0 }">selected="selected"</c:if>>待回应</option>
								<option value="1" <c:if test="${state==1 }">selected="selected"</c:if>>已发Offer</option>
							</select>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">大于提交时间:</label> <input name="time" type="date"
								class="form-control" id="time" value="${time}">
						</div>

						<div class="input-group">
							<input type="text" name="position" value="${position}" class="form-control" aria-label="..."
								placeholder="根据应聘职位搜索">
							<div class="input-group-btn">
								<button type="submit" class="btn btn-primary">搜索</button>
							</div>
						</div>
					</form>
					<br />
					<table class="table table-hover table-condensed">

						<tr class="info">
							<th>编号</th>
							<th>姓名</th>
							<th>学历</th>
							<th>应聘职位</th>
							<th>提交时间</th>
							<th>状态</th>
							<th>详情</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${list}" var="i" varStatus="status">
							<tr class="text-center">
								<td>${status.count+((info.pageNum-1)*10)}</td>
								<td>${i.rName}</td>
								<td>${i.rEducationBg}</td>
								<td>${i.rPosition}</td>
								<td>
									<fmt:formatDate value="${i.submissionDate}" pattern="yyyy/MM/dd"/>
								</td>
								
								<c:if test="${i.rState==0}">
									<td class="text-danger"><strong>待回应</strong></td>
								</c:if>
								<c:if test="${i.rState==1 }">
									<td class="text-primary"><strong>已发Offer</strong></td>
								</c:if>
								<td><input id="r${status.count}" type="hidden"
									value="${i.rId }" /> <a id="a${status.count}"> <span
										class="glyphicon glyphicon-search"></span>
								</a></td>
								<c:if test="${i.rState==0 }">
									<td><button class="btn btn-sm btn-primary" id="b${status.count}">发送Offer</button></td>
								</c:if>
								<c:if test="${i.rState==1 }">
									<td><small class="glyphicon glyphicon-ban-circle"></small> </td>
								</c:if>
							</tr>
						</c:forEach>
					</table>
					<div class="text-right">
						<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span>
						<a href="${webPath}/resumeInfo/getInfoByid?pageNum=1&position=${position}&state=${state}">首页</a>

						<c:if test="${info.hasPreviousPage}">
							<a
								href="${webPath}/resumeInfo/getInfoByid?pageNum=${info.pageNum-1}&position=${position}&state=${state}">上一页</a>
						</c:if>
						<c:forEach items="${info.navigatepageNums }" var="pagenumber">
							<a
								href="${webPath}/resumeInfo/getInfoByid?pageNum=${pagenumber}&position=${position}&state=${state}">${pagenumber}</a>
						</c:forEach>
						<c:if test="${info.hasNextPage}">
							<a
								href="${webPath}/resumeInfo/getInfoByid?pageNum=${info.pageNum+1}&position=${position}&state=${state}">下一页</a>
						</c:if>
						<a
							href="${webPath}/resumeInfo/getInfoByid?pageNum=${info.pages}&position=${position}&state=${state}">末页</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="resumeModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title text-center" id="myModalLabel">简历信息</h4>
				</div>
				<div class="modal-body" style="word-break: break-word;">

					<div class="form-horizontal">
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rPosition"><strong
								class="text-danger">*</strong>&nbsp;应聘职位:</label>
							<div class="col-sm-4">
								<input class="form-control" type="text" id="rPosition"
									name="rPosition" readonly="readonly"> <input id="rId" name="rId"
									type="hidden" >
							</div>
							<div class="col-sm-6"><strong>状态:<small id="state"></small></strong>&nbsp;&nbsp;&nbsp;&nbsp;
								<strong>提交时间:<small id="subtime"></small></strong>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rName"><strong
										class="text-danger">*</strong>&nbsp;姓名:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rName"
											name="rName" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rSex"><strong
										class="text-danger">*</strong>&nbsp;性别:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rSex" name="rSex"
											readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rNation"><strong
										class="text-danger">*</strong>&nbsp;民族:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rNation"
											name="rNation" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rEducationBg"><strong
										class="text-danger">*</strong>&nbsp;学历:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rEducationBg"
											name="rEducationBg" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rDataOfBirth"><strong
										class="text-danger">*</strong>&nbsp;出生日期:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rDataOfBirth"
											name="rDataOfBirth" readonly="readonly">
									</div>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rMajor"><strong
										class="text-danger">*</strong>&nbsp;专业:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rMajor"
											name="rMajor" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rGraduateSchool"><strong
										class="text-danger">*</strong>&nbsp;毕业院校:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rGraduateSchool"
											name="rGraduateSchool" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rEmail"><strong
										class="text-danger">*</strong>&nbsp;邮箱:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rEmail"
											name="rEmail" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rPostCode"><strong
										class="text-danger">*</strong>&nbsp;邮编:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rPostCode"
											name="rPostCode" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rTel"><strong
										class="text-danger">*</strong>&nbsp;联系电话:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rTel" name="rTel"
											readonly="readonly">
									</div>
								</div>
							</div>
						</div>


						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rDomicile"><strong
								class="text-danger">*</strong>&nbsp;地址:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="rDomicile"
									name="rDomicile" readonly="readonly">
							</div>
						</div>

						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rSkillSpecialty"><strong
								class="text-danger">*</strong>&nbsp;职业技能:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rSkillSpecialty"
									name="rSkillSpecialty" readonly="readonly"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rExperience"><strong
								class="text-danger">*</strong>&nbsp;工作经历:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rExperience"
									name="rExperience" readonly="readonly"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rEvaluation"><strong
								class="text-danger">*</strong>&nbsp;自我评价:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rEvaluation"
									name="rEvaluation" readonly="readonly"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rHobby"><strong
								class="text-danger">*</strong>&nbsp;兴趣爱好:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rHobby"
									name="rHobby" readonly="readonly"></textarea>
							</div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<!-- /container -->
	<script type="text/javascript">
	$(document).ready(function() {
		for (var i = 1; i <= 10; i++) {
			$("#a" + i).click(f("r" + i));
			$("#b"+i).click(senMessage("r" + i));
		}
			
			$("#c").click(senMessage("rId"));
	});
	
	var senMessage=function(id){
		return function(){
			var con=confirm("是否发送offer?");
			if(con!=true){
				return false;
			}
			var rId = document.getElementById(id).value;
			$.ajax({
						url : "${webPath}/resumeInfo/senMessage",
						cache : false,
						type : "POST",
						dataType : "json",
						async : "true",
						data : {
							rId : rId
						},
						success : function(msg) {
							if(msg>0){
								alert("操作成功!");
								parent.location.reload();
							}else{
								alert("操作失败!");
								parent.location.reload();
							}
						},
						error : function(errordata) {
							alert("出错啦！");
						}
					});
		};
	};
	
	var f = function(i) {
		return function() {
			var rId = document.getElementById(i).value;
			$.ajax({

						url : "${webPath}/resumeInfo/getResumeInfoByiId",
						cache : false,
						type : "POST",
						dataType : "json",
						async : "true",
						data : {
							rId : rId
						},
						success : function(msg) {
							
							document.getElementById("rId").value = msg.rId;
							document.getElementById("rName").value = msg.rName;
							document.getElementById("rSex").value = msg.rSex;
							document.getElementById("rDataOfBirth").value = TimeConversion(msg.rDataOfBirth);
							document.getElementById("rTel").value = msg.rTel;
							document.getElementById("rNation").value = msg.rNation;
							document.getElementById("rEmail").value = msg.rEmail;
							document.getElementById("rPostCode").value = msg.rPostCode;
							document.getElementById("rPosition").value = msg.rPosition;
							document.getElementById("rDomicile").value = msg.rDomicile;
							document.getElementById("rSkillSpecialty").value = msg.rSkillSpecialty;
							document.getElementById("rHobby").value = msg.rHobby;
							document.getElementById("rEducationBg").value = msg.rEducationBg;
							document.getElementById("rMajor").value = msg.rMajor;
							document.getElementById("rGraduateSchool").value = msg.rGraduateSchool;
							document.getElementById("rExperience").value = msg.rExperience;
							document.getElementById("rEvaluation").value = msg.rEvaluation;
							if(msg.rState==0){
								document.getElementById("state").innerHTML = "待回应";
							}else if(msg.rState==1){
								document.getElementById("state").innerHTML = "已发offer";
							}
							document.getElementById("subtime").innerHTML =TimeConversion(msg.submissionDate);
							$("#resumeModal").modal("show");
						},
						error : function(errordata) {
							alert("出错啦！");
						}
					});
		};
	};

	function TimeConversion(time) {
		//首先在前台得到javascript可以识别的date类型
		var date = new Date(parseInt(time, 10));
		var year = date.getFullYear();

		var month = date.getMonth() + 1;

		var day = date.getDate();

		return year + "-" + month + "-" + day;
	};
</script>

</body>
</html>