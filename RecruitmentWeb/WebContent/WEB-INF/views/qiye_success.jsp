<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>注册成功</title>
		<!-- style.css -->
		<link href="style.css" rel="stylesheet">

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
				<div class="col-lg-3"></div>
				<div class="col-lg-6">
					<h3>注册成功!</h3><hr />
					<table>
						<tr>
						
							<td>
								<img src="${webPath}/static/images/success.png" style="width:56px; height:56px;" />
							</td>
							<td class="text-left" style="padding-left: 10px;">
								<h3>恭喜您,您的企业用户账号:<br />
						<span style="color: #CC802A;">${enterprise.eAccount}</span>&nbsp;&nbsp;注册成功!!</h3>
							</td>
						</tr>
						<tr>
							<td></td>
							<td class="text-left">
								<small>请等待管理员审核账号信息,账号审核通过方可登录使用</small><br /><br/>
							</td>
						</tr>
						<tr>
							<td></td>
							<td class="text-left">
								<a href="${webPath}/enterprise/loginPage" class="btn btn-primary" style="width: 48%;">账号登录</a>
								<a href="${webPath}/recruitmentInfo/AllInfos" class="btn btn-default"style="width: 48%;">进入首页</a>
							</td>
						</tr>
					</table>
				</div>
				<div class="col-lg-3"></div>
			</div>
		</div>
	</body>

</html>