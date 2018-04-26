<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>用户注册</title>

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
	<div class="container">
		<div class="row">
			<div class="col-lg-4"></div>
			<div class="col-lg-4">
				<h3 class="text-center text-primary">立即注册,查看更多高薪职位</h3>
				<hr />
				<form name="regIuserForm" id="regIuserForm" class="form-horizonta" action="${webPath}/individual/register" method="post" onsubmit="return inspect();">
					<div class="form-group">
						<label for="#iAccount" >账号</label>
						<input  class="form-control" type="text" id="iAccount" name="iAccount"
							placeholder="请输入账号" />
					</div>
					<div class="form-group">
						<label for="iPassword" >密码</label>
						<input  class="form-control" type="password"  id="iPassword" name="iPassword"
							placeholder="请输入密码" />
					</div>

					<div class="form-group">
						<label for="iPassword2" >确认密码</label>
						<input  class="form-control" type="password"  id="iPassword2" name="iPassword2" 
							placeholder="请再次输入密码" />
					</div>
					<button type="submit" class="btn btn-lg btn-primary btn-block" >免费注册</button>
				</form>
				<br />
				<p class="text-center">
					<a href="${webPath}/individual/loginPage">已有帐号，去登录</a>
				</p>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<script type="text/javascript">
	var acc=0;
	
	function inspect(){
		var iAccount=document.getElementById("iAccount").value.trim();
		var iPassword=document.getElementById("iPassword").value.trim();
		if(iAccount==''||iAccount.length<4||iAccount.length>12){
			alert("请输入正确格式的账号!(4-12个字符)");
			return false;
		}
		if(iPassword==''||iPassword.length<6||iPassword.length>16){
			alert("请输入正确格式的密码！(6-16个字符)");
			return false;
		}
		if(document.getElementById("iPassword2").value.trim()==''){
			alert("请输入确认密码!");
			return false;
		}
		if(document.getElementById("iPassword").value.trim()!=document.getElementById("iPassword2").value.trim()){
			alert("两次密码输入不一致!");
			return false;
		}
		if(acc==1){
			alert("该用户已被注册请重新输入!");
			return false;
		}
		
	}
	$(document)
			.ready(
					function() {
						$("#iAccount").blur(function() {
							$.ajax({
								url : "${webPath}/individual/getNameJson",
								cache : false,
								type : "GET",
								dataType : "json",
								async : "true",
								data : {
									account : $("#iAccount").val()
								},
								success : function(msg) {
								if (msg>0){
									acc=1;
									$("#iAccount").val("");
									alert("该账号已被注册请重新输入!");
							    }else{
							    	acc=0;
							    }
								},
								error : function(errordata) {
									alert("出错啦！");
								}
							});
						});
					});
	
</script>
</body>
</html>