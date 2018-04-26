<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>发布公告</title>
<link href="${webPath}/static/css/admin.css" rel="stylesheet">
</head>

<body>
	<div class="container">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a href="${webPath }/admin/index">招聘管理</a></li>
						<li><a
							href="${webPath }/admin/accountManagement">账户管理</a></li>
						<li><a href="${webPath }/admin/adminInfo">个人信息</a></li>
						<li><a href="${webPath }/admin/modifyPwdPage">修改密码</a></li>
						<li class="active"><a href="${webPath }/admin/announcement">发布公告</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					敬请期待
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
	<script src="assets/js/custom.js"></script>

</body>
</html>