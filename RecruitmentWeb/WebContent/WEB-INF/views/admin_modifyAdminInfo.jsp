<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>修改管理员个人信息</title>
<link href="${webPath}/static/css/admin.css" rel="stylesheet">

</head>

<body>
	<%@include file="head.jsp"%>
	<div class="container">
		<%@include file="admin_head.jsp"%>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a href="${webPath }/admin/index">招聘管理</a></li>
						<li><a href="${webPath }/admin/accountManagement">账户管理</a></li>
						<li class="active"><a href="${webPath }/admin/adminInfo">个人信息</a></li>
						<li><a href="${webPath }/admin/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<div class="row">
						<div class="col-lg-2"></div>
						<div class="col-lg-5">
							<form class="form-horizontal" id="adminInfoForm"
								name="adminInfoForm">
								<legend>管理员信息</legend>
								<div class="form-group">
									<label class="col-sm-3 control-label">性别:</label>
									<div class="col-sm-9">
										<label class="radio-inline"> <input type="radio"
											value="男" name="sex"
											<c:if test="${admin.sex=='男'}"> checked="checked"</c:if>>男性
										</label> <label class="radio-inline"
											<c:if test="${admin.sex=='女'}"> checked="checked"</c:if>>
											<input type="radio" value="女" name="sex">女性
										</label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">姓名:</label>
									<div class="col-sm-9">
										<input name="name" type="text" value="${admin.name }"
											placeholder="必填项，实名" class="form-control" required>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">办公电话:</label>
									<div class="col-sm-9">
										<input name="oph" type="text" value="${admin.oph }"
											placeholder="必填项" class="form-control" required>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">移动电话:</label>
									<div class="col-sm-9">
										<input name="mp" type="text" value="${admin.mp }"
											placeholder="必填项" class="form-control" required>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">邮箱:</label>
									<div class="col-sm-9">
										<input name="email" type="text" value="${admin.email }"
											placeholder="必填项" class="form-control" required
											pattern="^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$"
											title="邮箱正确格式：xxx@xxx.xxx">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">地址:</label>
									<div class="col-sm-9">
										<input name="address" type="text" value="${admin.address } "
											placeholder="必填项" class="form-control" required>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-6">
										<button id="modifyAdminInfoBtn" name="modifyAdminInfoBtn"
											type="button" class="btn form-control btn-warning">修改</button>
									</div>
									<div class="col-sm-6">
										<a href="${webPath}/admin/adminInfo"
											class="btn form-control btn-default">返回</a>
									</div>
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
		
		$(document).ready(function() {
			
			$("#modifyAdminInfoBtn").click(function() {
				var name = document.adminInfoForm.name.value.trim();
				var oph = document.adminInfoForm.oph.value.trim();
				var mp = document.adminInfoForm.mp.value.trim();
				var email = document.adminInfoForm.email.value.trim();
				var address = document.adminInfoForm.address.value.trim();
				if (name == ""||name.length>20) {
					alert("请输入正确格式的姓名!(限20个字符以内)");
					return false;
				}
				if (oph == ""||oph.length>20) {
					alert("请输入正确格式的办公电话!");
					return false;
				}
				if (mp == ""||mp.length>20) {
					alert("请输入正确格式的移动电话!");
					return false;
				}
				if (email == ""||email.length>50) {
					alert("请输入正确格式的邮箱!(限50个字符以内)");
					return false;
				}
				if (address == ""||address.length>255) {
					alert("请输入正确格式的地址!(限255个字符以内)");
					return false;
				}
				$.ajax({
					url : "${webPath}/admin/modifyAdminInfo",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : $('#adminInfoForm').serialize(),
					success : function(msg) {
						if (msg > 0)
							alert("信息修改成功!");
						window.location.href = "${webPath}/admin/adminInfo";
					},
					error : function(errordata) {
						alert("信息修改失败!");
					}
				});
			});
		});
	</script>

</body>
</html>