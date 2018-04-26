<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>简历信息</title>

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

	<div class="container divContent">
		<div class="row ">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">
				<h3 class="success">简历信息</h3>
				<hr />
				<div class="row">
					<div class="col-lg-4"></div>
					<div class="col-lg-8">
						<form action="${webPath}/enterpriseUser/enterpriseUsers"
							method="post">
							<div class="input-group">
								<input name="companyName" value="${companyName}" type="text"
									class="form-control" placeholder="根据公司名称搜索公司信息"> <input
									type="hidden" name="pageNum" value="1">
								<div class="input-group-btn">
									<button type="button" class="btn btn-primary">搜索</button>
								</div>
							</div>
						</form>
					</div>

				</div>

				<table class="table table-hover table-striped">
					<tr class="info">
						<th class="text-center">职位</th>
						<th class="text-center">工作地点</th>
						<th class="text-center">发布时间</th>
						<th class="text-center">简历</th>
						<th class="text-center">操作</th>
					</tr>
					<c:forEach items="${rInfos}" var="rinfo">
						<tr>
							<td>${rinfo.position}</td>
							<td>${rinfo.workingPlace}</td>
							<td>${rinfo.updateTime}</td>
							<td>${rinfo.resumes.size()}</td>
							<td><a href="${webPath}/recruitmentInfo/rinfoAndResumes?eId=${rinfo.iId }"><span class="glyphicon glyphicon-search"></span></a></td>
						</tr>
					</c:forEach>

				</table>
				<div class="text-right">
					<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span> <a
						href="${webPath}/recruitmentInfo/rinfoAndResumes?pageNum=1">首页</a>

					<c:if test="${info.hasPreviousPage}">
						<a
							href="${webPath}/recruitmentInfo/rinfoAndResumes?pageNum=${info.pageNum-1}">上一页</a>
					</c:if>
					<c:forEach items="${info.navigatepageNums }" var="pagenumber">
						<a
							href="${webPath}/recruitmentInfo/rinfoAndResumes?pageNum=${pagenumber}">${pagenumber}</a>
					</c:forEach>
					<c:if test="${info.hasNextPage}">
						<a
							href="${webPath}/recruitmentInfo/rinfoAndResumes?pageNum=${info.pageNum+1}">下一页</a>
					</c:if>
					<a
						href="${webPath}/recruitmentInfo/rinfoAndResumes?pageNum=${info.pages}">末页</a>
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>
	<!-- /container -->
	<footer class="text-center">all image and text &copy;版权所有</footer>
</body>
</html>