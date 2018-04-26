<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String webPath = request.getContextPath();
	session.setAttribute("webPath", webPath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Bootstrap -->
<link href="${webPath}/static/css/bootstrap.min.css" rel="stylesheet">
<!-- style.css -->
<link href="${webPath}/static/css/style.css" rel="stylesheet">
<!-- JQUERY SCRIPTS -->
<script type="text/javascript"
	src="${webPath}/static/js/jquery-3.2.1.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="${webPath}/static/js/bootstrap.min.js"></script>
</head>
<body>
	<ul class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a href="${webPath}/recruitmentInfo/AllInfos" class="navbar-brand">
					<span class="glyphicon glyphicon-home"></span>
				</a>
				<button class="navbar-toggle" data-toggle="collapse"
					data-target="#divNav">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div id="divNav" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="${webPath}/recruitmentInfo/AllInfos">招聘首页</a>
					<li><a href="${webPath}/resumeInfo/getInfoByIid">个人服务</a></li>
					<li><a href="${webPath}/resumeInfo/getInfoByid">企业服务</a></li>
					<li><a href="${webPath}/admin/index">系统管理</a></li>
					
				</ul>
			</div>
		</div>
	</ul>
</body>
</html>