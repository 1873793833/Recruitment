<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>修改密码</title>
<link href="${webPath}/static/css/admin.css" rel="stylesheet">

</head>

<body>
<%@include file="head.jsp" %>
	<div class="container">
		<%@include file="admin_head.jsp" %>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a href="${webPath }/admin/index">招聘管理</a></li>
						<li><a
							href="${webPath }/admin/accountManagement">账户管理</a></li>
						<li><a href="${webPath }/admin/adminInfo">个人信息</a></li>
						<li class="active"><a href="${webPath }/admin/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<div class="row">
						<div class="col-lg-2"></div>
						<div class="col-lg-5">
							<form name="adminPwdForm" class="form-horizontal">
								<div class="form-group">
									<label class="col-sm-5 control-label">管理员账号:</label>
									<div class="col-sm-7">
										<p class="form-control-static"><strong class="text-primary">${admin.account}</strong></p>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">旧密码:</label>
									<div class="col-sm-7">
										<input class="form-control" class="form-control" type="password" id="oldpwd" name="oldpwd"
										placeholder="请输入旧密码"></input>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label" for="formGroupInputSmall">新密码:</label>
									<div class="col-sm-7">
										<input class="form-control" type="password" name="newpwd"
											id="newpwd" placeholder="请输入新密码">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label" for="formGroupInputSmall">确认新密码:</label>
									<div class="col-sm-7">
										<input class="form-control" type="password" name="secondPwd"
											id="secondPwd" placeholder="请输入相同的新密码">
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-2"></div>
									<div class="col-sm-8">
										<button id="modifyPwdBtn" name="modifyPwdBtn" type="button" class="btn btn-sm btn-primary btn-block">修改</button>
									</div>
									<div class="col-sm-2"></div>
								</div>
								
							</form>
						</div>
						<div class="col-lg-5"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->

<script type="text/javascript">
$(document).ready(
		function(){
			$("#modifyPwdBtn").click(
					function(){
						var newpwd=document.getElementById("newpwd").value.trim();
						var oldpwd=document.getElementById("oldpwd").value.trim();
						if(document.adminPwdForm.oldpwd.value.trim()==""){
							alert("请输入旧密码!");
							return false;
						}
						if(newpwd == ""||newpwd.length<6||newpwd.length>16){
							alert("请输入正确格式的新密码!(6-16个字符)");
							return false;
						}
						if(oldpwd==newpwd){
							alert("新密码不能与旧密码重复!");
							return false;
						}
						if(document.adminPwdForm.secondPwd.value.trim() == ""){
							alert("请输入重复新密码!");
							return false;
						}
						if(document.adminPwdForm.newpwd.value!=document.adminPwdForm.secondPwd.value){
							alert("俩次密码输入不一致!");
							return false;
						}
						$.ajax({
							url: "${webPath}/admin/modifyPwd",
							cache:false,
							type:"POST",
							dataType:"json",
							async:"true",
							data:{newpwd:$("#newpwd").val(),oldpwd:$("#oldpwd").val()},
							success:function(msg){
								if(msg>0){
								alert("密码修改成功,请重新登录!");
								window.location.href="${webPath}/admin/loginPage";
								}else if(msg==0){
									alert("旧密码输入错误，请重新输入!");
								}
							},
							error:function(errordata){
								alert("密码修改失败!");
							}
						});
					}		
			);
		});
</script>
</body>
</html>