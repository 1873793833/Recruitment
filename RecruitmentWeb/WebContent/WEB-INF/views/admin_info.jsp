<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>管理员信息</title>
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
						<li class="active"><a href="${webPath }/admin/adminInfo">个人信息</a></li>
						<li><a href="${webPath }/admin/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>

				<div class="col-sm-9 col-md-10 info">
					<div class="row">
						<div class="col-lg-2"></div>
						<div class="col-lg-5">
							<legend>管理员信息</legend>
							<div class="form-horizontal">
								<div class="form-group">
									<label class="col-sm-3 control-label">姓名:</label>
									<div class="col-sm-9">
										<p class="form-control-static">${admin.name}</p>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">性别:</label>
									<div class="col-sm-9">
										<p class="form-control-static">${admin.sex}</p>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">办公电话:</label>
									<div class="col-sm-9">
										<p class="form-control-static">${admin.oph}</p>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">移动电话:</label>
									<div class="col-sm-9">
										<p class="form-control-static">${admin.mp}</p>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">邮箱:</label>
									<div class="col-sm-9">
										<p class="form-control-static">${admin.email}</p>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">地址:</label>
									<div class="col-sm-9">
										<p class="form-control-static">${admin.address}</p>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-3"></div>
									<div class="col-sm-6">
										<a href="${webPath}/admin/modifyAdminInfoPage" class="btn form-control btn-primary">编辑</a>
									</div>
									<div class="col-sm-3"></div>
								</div>
							</div>
						</div>
						<div class="col-lg-5"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->

	<!-- /. WRAPPER  -->
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src="assets/js/jquery-1.10.2.js"></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src="assets/js/bootstrap.min.js"></script>
	<!-- CUSTOM SCRIPTS -->

</body>
</html>