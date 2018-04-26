<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员登录</title>
</head>
<body>
	<%@ include file="head.jsp"%>
	<div class="container divContent">
		<div class="row">
			<div class="col-lg-4"></div>
			<div class="col-lg-4">
				<h3 class="text-center text-success">管理员登录</h3>
				<hr />
				<form name="loginForm" method="post" onsubmit="return login()">
					<div class="form-group">
						<label for="account">账号</label> <input id="account" type="text"
							name="account" class="form-control" placeholder="请输入管理员账号" />
					</div>
					<div class="form-group">
						<label for="password">密码</label> <input id="password" type="password"
							name="password" class="form-control" placeholder="请输入密码" />
					</div>
					<button id="loginAdminSub" type="button"
						class="btn btn-lg btn-primary btn-block">登录</button>
				</form>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<!-- /container -->
	<footer class="text-center">all image and text &copy;版权所有</footer>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$("#loginAdminSub").click(function() {
				var account= document.loginForm.account.value.trim();
				var password= document.loginForm.password.value.trim();
				if(account.length<4 ||account.length>12||account == ""){
					alert("请输入正确格式的账号!(4-12个字符)");
					return false;
				}				
				if (password.length<6 ||password.length>16||password == "") {
					alert("请输入正确格式的密码!(6-16个字符)");
					return false;
				}
				$.ajax({
					url : "${webPath}/admin/login",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : {
						account : $("#account").val(),
						password : $("#password").val()
					},
					success : function(msg) {
						if (msg.account == $("#account").val()) {
							alert("登录成功!");
							window.location.href = "${webPath}/admin/index";
						} else {
							alert("登录失败,账号或密码输入错误!");
						}
					},
					error : function(errordata) {
						alert("登录失败,账号或密码输入错误!");
					}
				});
			});
		});
	</script>

</body>
</html>