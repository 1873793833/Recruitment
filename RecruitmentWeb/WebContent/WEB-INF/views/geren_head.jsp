<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>head</title>
<link href="${webPath}/static/css/admin.css" rel="stylesheet">
</head>
<body>
	<div class="header clearfix">
		<div class="col-lg-4">
			<h3 class="text-muted">MyJob</h3>
		</div>
		<div class="col-lg-8 text-right">
			<strong>欢迎您:<span class="text-primary"><c:choose><c:when test="${individual.iName!=null}">${individual.iName}</c:when><c:otherwise>${individual.iAccount}</c:otherwise> </c:choose></span></strong>&nbsp;&nbsp;
			<a href="${webPath}/individual/logOffUser" class="btn btn-sm btn-danger" onclick="return confirm('确认注销当前用户?');">注销</a>
		</div>
	</div>
</body>
</html>