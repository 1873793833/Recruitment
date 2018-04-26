<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>招聘网站</title>

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
	<%@include file="head.jsp"%>
	<header class="page-header">
	<h1 class="text-danger">招聘网站</h1>
	</header>

	<div class="container divContent">
		<div class="row">
			<div class="col-sm-3 col-lg-3 text-center">
				<c:if test="${individual==null }">
				<h5 class="text-danger">Hi! 您好</h5>
				<hr />
				<p>
					<span>登录状态:</span> <span>游客</span>&nbsp&nbsp<a href="${webPath}/individual/loginPage">登录</a>
				</p>
				</c:if>
				<c:if test="${individual!=null }">
				<h5 class="text-danger">欢迎您:<c:choose><c:when test="${individual.iName!=null}">${individual.iName}</c:when><c:otherwise>${individual.iAccount}</c:otherwise> </c:choose></h5>
				<hr />
				<p>
					<span>登录状态:</span> <span>已登录</span> 
				</p>
				</c:if>
				<c:if test="${individual==null }">
				<a class="btn btn-primary" href="${webPath}/individual/loginPage">登录</a>
				<a class="btn btn-default" href="${webPath}/individual/registerPage">注册</a>
				</c:if>
				<c:if test="${individual!=null }">
				<a href="${webPath}/individual/logOffUser" class="btn btn-sm btn-danger" onclick="return confirm('确认注销当前用户?');">注销登录</a>
				</c:if>
			</div>
			<div class="col-sm-8 col-lg-8">
				<div class="row">
					<form class="form-inline"
						action="${webPath}/recruitmentInfo/AllInfos" method="post">
						<div class="input-group">
							<div class="input-group-btn">
								<select class="form-control" name="select">
									<option value="1"
										<c:if test="${select==1}">selected="selected"</c:if>>职位</option>
									<option value="2"
										<c:if test="${select==2}">selected="selected"</c:if>>公司</option>
								</select>
							</div>
							<input style="width: 500px" type="text" name="example" value="${example}"
								class="form-control" aria-label="..." placeholder="请输入关键字">
							<div class="input-group-btn">
								<button type="submit" class="btn btn-primary">搜索</button>
							</div>
						</div>
					</form>
				</div>

				<div id="a" class="row">
					<h2 class="lead">
						<a>近期发布</a>
					</h2>
					<div>
						<table
							class="table table-striped table-hover table-responsive">
							<tr class="info">
								<th class="text-center">职位</th>
								<th class="text-center">公司</th>
								<th class="text-center">地点</th>
								<th class="text-center">薪资</th>
							</tr>
							<c:forEach items="${list}" var="i" varStatus="status">
								<tr>
									<td><a
										href="${webPath}/recruitmentInfo/selectInfoByid?id=${i.iId}">${i.position}</a>
									</td>
									<td><a
										href="${webPath}/recruitmentInfo/allCompanyInfo?id=${i.enterpriseId}">${i.enterpriseUser.eCompanyName }</a></td>
									<td>${i.place }</td>
									<td><fmt:parseNumber integerOnly="true"
											value="${i.salary}"></fmt:parseNumber> /月</td>
								</tr>
							</c:forEach>
						</table>
						<div class="text-right">
							<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span>
							<a
								href="${webPath}/recruitmentInfo/AllInfos?pageNum=1&select=${select}&example=${example}&keyword=${keyword}">首页</a>

							<c:if test="${info.hasPreviousPage}">
								<a
									href="${webPath}/recruitmentInfo/AllInfos?pageNum=${info.pageNum-1}&select=${select}&example=${example}">上一页</a>
							</c:if>
							<c:forEach items="${info.navigatepageNums }" var="pagenumber">
								<a
									href="${webPath}/recruitmentInfo/AllInfos?pageNum=${pagenumber}&select=${select}&example=${example}">${pagenumber}</a>
							</c:forEach>
							<c:if test="${info.hasNextPage}">
								<a
									href="${webPath}/recruitmentInfo/AllInfos?pageNum=${info.pageNum+1}&select=${select}&example=${example}">下一页</a>
							</c:if>
							<a
								href="${webPath}/recruitmentInfo/AllInfos?pageNum=${info.pages}&select=${select}&example=${example}">末页</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>

	</div>

</body>
</html>