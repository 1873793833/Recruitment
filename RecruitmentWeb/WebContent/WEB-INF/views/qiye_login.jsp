<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>企业用户登录</title>

<!-- style.css -->
<link href="${webPath}/static/css/style.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    	<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<%@ include file="head.jsp" %>
	<div class="container divContent">
		<div class="row">
			<div class="col-lg-4"></div>
			<div class="col-lg-4">
				<h3 class="text-center text-success">企业用户登录</h3>
				<hr />
				<form id="loginForm" name="loginForm" action="${webPath}/enterpriseUser/loginEUser" method="post" onsubmit="return login()">
					<div class="form-group">
						<label for="account">账号</label> <input id="account" name="account" type="text"
							class="form-control" placeholder="请输入账号" />
					</div>
					<div class="form-group">
						<label for="password">密码</label> <input id="password" name="password" type="password"
							class="form-control" placeholder="请输入密码" />
					</div>
					<button id="loginEUserSub" type="button" class="btn btn-lg btn-primary btn-block">登录</button>
				</form>
				<br />
				<p class="text-center">
					还没有账号? <a href="${webPath}/enterprise/registerPage">免费注册</a>
				</p>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<!-- /container -->
	<footer class="text-center">all image and text &copy;版权所有</footer>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#loginEUserSub")
		.click(
				function() {
					var account= document.loginForm.account.value.trim();
					var password= document.loginForm.password.value.trim();
					if(account.length<4 ||account.length>12||account == ""){
						alert("请输入正确格式的账号!(4-12个字符)");
						return false;
					}

					if (password.length<6 ||password.length>16||password == "") {
						alert("请输入正确格式的密码！(6-16个字符)");
						return false;
					}
					
					$
							.ajax({
								url : "${webPath}/enterprise/login",
								cache : false,
								type : "POST",
								dataType : "json",
								async : "true",
								data : {
									account : $(
											"#account")
											.val(),
									password : $(
											"#password")
											.val()
								},
								success : function(msg) {
									if (msg == 1) {
										alert("登录成功!");
										window.location.href = "${webPath}/resumeInfo/getInfoByid";
									}
									if (msg == 0) {
										alert("该账号尚未通过验证,请耐心等待管理员验证账号信息!");
									}
									if (msg == -1) {
										alert("账号已被禁用!请联系系统管理员");
									}
									if (msg ==-2){
										alert("登录失败,账号或密码输入错误!");
									}
								},
								error : function(
										errordata) {
									alert("登录失败,账号或密码输入错误!");
								}
							});
				});
	});
	</script>
</body>

</html>