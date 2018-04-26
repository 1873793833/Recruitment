<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>草稿箱</title>

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
		<%@include file="geren_head.jsp"%>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a href="${webPath}/resumeInfo/getInfoByIid">我的简历</a></li>
						<li class="active"><a
							href="${webPath}/resumeInfo/getDraftsByIid">草稿箱</a></li>
						<li><a href="${webPath}/individual/infoPage">个人信息</a></li>
						<li><a href="${webPath}/individual/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">

					<form class="form-inline"
						action="${webPath}/resumeInfo/getDraftsByIid" method="post">
						<div class="form-group">
							<label for="exampleInputEmail2">预期薪资:</label> <input
								name="salary" type="number" value="${keyword}"
								class="form-control" id="exampleInputEmail2"
								placeholder="输入预期工资">
						</div>
						<div class="input-group">
							<div class="input-group-btn">
								<select class="form-control" name="example">
									<option value="1"
										<c:if test="${example==1}">selected="selected"</c:if>>应聘职位</option>
									<option value="2"
										<c:if test="${example==2}">selected="selected"</c:if>>公司名称</option>
									<option value="3"
										<c:if test="${example==3}">selected="selected"</c:if>>工作地点</option>
								</select>
							</div>
							<input type="text" name="keyword" value="${keyword}"
								class="form-control" aria-label="..." placeholder="请输入关键字">
							<div class="input-group-btn">
								<button type="submit" class="btn btn-primary">搜索</button>
							</div>
						</div>
					</form>
					<br />
					<table class="table table-hover table-condensed">

						<tr class="info">
							<th>编号</th>
							<th>公司名称</th>
							<th>工作地点</th>
							<th>应聘职位</th>
							<th>薪资</th>
							<th>详情</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${list}" var="i" varStatus="status">
							<tr class="text-center">
								<td>${status.count+((info.pageNum-1)*10) }</td>
								<td>${i.recruitmentInfo.corporateName}</td>
								<td>${i.recruitmentInfo.place}</td>
								<td>${i.recruitmentInfo.position}</td>
								<td><fmt:parseNumber integerOnly="true"
										value="${i.recruitmentInfo.salary}"></fmt:parseNumber> /月</td>
								<td><input id="r${status.count}" type="hidden"
									value="${i.rId }" /> <a id="a${status.count}"> <span
										class="glyphicon glyphicon-search"></span>
								</a></td>
								<td>
									<button class="btn btn-sm btn-primary"
										id="uploadbtn${status.count}">
										<span class="glyphicon glyphicon-cloud-upload"></span>
									</button>
									<button class="btn btn-sm btn-danger"
										id="delbtn${status.count}">
										<span class="glyphicon glyphicon-remove"></span>
									</button>
								</td>
							</tr>
						</c:forEach>
					</table>
					<div class="text-right">
						<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span>
						<a
							href="${webPath}/resumeInfo/getDraftsByIid?pageNum=1&example=${example}&keyword=${keyword}&salary=${salary}">首页</a>

						<c:if test="${info.hasPreviousPage}">
							<a
								href="${webPath}/resumeInfo/getDraftsByIid?pageNum=${info.pageNum-1}&example=${example}&keyword=${keyword}&salary=${salary}">上一页</a>
						</c:if>
						<c:forEach items="${info.navigatepageNums }" var="pagenumber">
							<a
								href="${webPath}/resumeInfo/getDraftsByIid?pageNum=${pagenumber}&example=${example}&keyword=${keyword}&salary=${salary}">${pagenumber}</a>
						</c:forEach>
						<c:if test="${info.hasNextPage}">
							<a
								href="${webPath}/resumeInfo/getDraftsByIid?pageNum=${info.pageNum+1}&example=${example}&keyword=${keyword}&salary=${salary}">下一页</a>
						</c:if>
						<a
							href="${webPath}/resumeInfo/getDraftsByIid?pageNum=${info.pages}&example=${example}&keyword=${keyword}&salary=${salary}">末页</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 模态框（Modal） -->
	<div class="modal fade" id="draftsModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title text-center" id="myModalLabel">简历信息</h4>
					<small class="text-danger">注:该窗口下可编辑简历</small>
				</div>
				<div class="modal-body" style="word-break: break-word;">

					<form class="form-horizontal" id="resumeFrom" name="resumeFrom">
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rPosition"><strong
										class="text-danger">*</strong>&nbsp;应聘职位:</label>
									<div class="col-sm-8">
										<input id="rId" name="rId" type="hidden"> <input
											class="form-control" type="text" id="rPosition"
											name="rPosition" readonly="readonly">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rName"><strong
										class="text-danger">*</strong>&nbsp;姓名:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rName"
											name="rName">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rSex"><strong
										class="text-danger">*</strong>&nbsp;性别:</label>
									<div class="col-sm-8">
										<select class="form-control" id="rSex" name="rSex">
											<option value=""<c:if test="${individual.iSex==''&&individual.iSex==null}">selected="selected"</c:if>>请选择</option>
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
											name="rNation">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rEducationBg"><strong
										class="text-danger">*</strong>&nbsp;学历:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rEducationBg"
											name="rEducationBg">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rTel"><strong
										class="text-danger">*</strong>&nbsp;联系电话:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rTel" name="rTel">
									</div>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rDataOfBirth"><strong
										class="text-danger">*</strong>&nbsp;出生日期:</label>
									<div class="col-sm-8">
										<input class="form-control" type="date" id="rDataOfBirth"
											name="rDataOfBirth">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rMajor"><strong
										class="text-danger">*</strong>&nbsp;专业:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rMajor"
											name="rMajor">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rGraduateSchool"><strong
										class="text-danger">*</strong>&nbsp;毕业院校:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rGraduateSchool"
											name="rGraduateSchool">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rDomicile"><strong
										class="text-danger">*</strong>&nbsp;地址:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rDomicile"
											name="rDomicile">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rEmail"><strong
										class="text-danger">*</strong>&nbsp;邮箱:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rEmail"
											name="rEmail">
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-4 control-label" for="rPostCode"><strong
										class="text-danger">*</strong>&nbsp;邮编:</label>
									<div class="col-sm-8">
										<input class="form-control" type="text" id="rPostCode"
											name="rPostCode">
									</div>
								</div>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rSkillSpecialty"><strong
								class="text-danger">*</strong>&nbsp;职业技能:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rSkillSpecialty"
									name="rSkillSpecialty"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rExperience"><strong
								class="text-danger">*</strong>&nbsp;工作经历:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rExperience"
									name="rExperience"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rEvaluation"><strong
								class="text-danger">*</strong>&nbsp;自我评价:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rEvaluation"
									name="rEvaluation"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="rHobby"><strong
								class="text-danger">*</strong>&nbsp;兴趣爱好:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="rHobby"
									name="rHobby"></textarea>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-danger" id="delResumeBtn">删除草稿</button>
					<button type="button" class="btn btn-primary" id="updataResumeBtn">保存编辑</button>
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

				$("#uploadbtn" + i).click(upload("r" + i));

				$("#delbtn" + i).click(del("r" + i));

			}
			$("#delResumeBtn").click(function() {
				var rId = document.getElementById("rId").value;
				var con = confirm("数据无法恢复,确认删除?");
				if (con == true) {
					$.ajax({
						url : "${webPath}/resumeInfo/delResumeByRid",
						cache : false,
						type : "POST",
						dataType : "json",
						async : "true",
						data : {
							rId : rId
						},
						success : function(msg) {
							if (msg > 0) {
								alert("删除成功!");
								parent.location.reload();
							} else {
								alert("删除失败!");
							}
						},
						error : function(errordata) {
							alert("出错啦!");
						}
					});
				}

			});
			$("#updataResumeBtn").click(function() {
				if(inspect()==false){
					return false;
				}
				
				$.ajax({
					url : "${webPath}/resumeInfo/updataResume",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : $("#resumeFrom").serialize(),
					success : function(msg) {
						if (msg > 0) {
							alert("修改成功!");
							parent.location.reload();
						} else {
							alert("修改失败!");
						}
					},
					error : function(errordata) {
						alert("出错啦!");
					}
				});
			});

		});

		var f = function(i) {
			return function() {
				var rId = document.getElementById(i).value;
				$
						.ajax({
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
								$('#rDataOfBirth').val(TimeConversion(msg.rDataOfBirth)); 
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
								$("#draftsModal").modal({
									backdrop : 'static',
									keyboard : false
								});
							},
							error : function(errordata) {
								alert("出错啦！");
							}
						});
			};
		};

		var upload = function(id) {
			return function() {
				var con = confirm("确认信息无误?简历提交后将无法修改!");
				if (con != true) {
					return false;
				}
				inspect();
				var rId = document.getElementById(id).value;
				$.ajax({
					url : "${webPath}/resumeInfo/uploadResumene",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : {
						rId : rId
					},
					success : function(msg) {
						if (msg > 0) {
							alert("简历提交成功!");
							parent.location.reload();
						} else {
							alert("简历提交失败!");
						}
					},
					error : function(errordata) {
						alert("出错啦！");
					}
				});
			};
		};

		var del = function(id) {
			return function() {
				var con = confirm("确认删除该条草稿简历?");
				if (con != true) {
					return false;
				}
				var rId = document.getElementById(id).value;
				$.ajax({
					url : "${webPath}/resumeInfo/delResumeByRid",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : {
						rId : rId
					},
					success : function(msg) {
						if (msg > 0) {
							alert("删除成功!");
							parent.location.reload();
						} else {
							alert("删除失败!");
						}
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

			var month = ("0" + (date.getMonth() + 1)).slice(-2);

			var day = ("0" + date.getDate()).slice(-2);

			return year + "-" + month + "-" + day;
		};
		function inspect(){
			var rName=document.getElementById("rName").value.trim();
			var rSex=document.getElementById("rSex").value.trim();
			var rNation=document.getElementById("rNation").value.trim();
			var rEducationBg=document.getElementById("rEducationBg").value.trim();
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
			var con = confirm("请确认信息无误,是否保存修改?");
			if (con != true) {
				return false;
			}
		}
	</script>
</body>
</html>