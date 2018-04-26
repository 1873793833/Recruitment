<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公司信息</title>
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
				<a class="btn btn-default"  href="${webPath}/individual/registerPage">注册</a>
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
							<input style="width: 500px" type="text" name="example"
								value="${example}" class="form-control" aria-label="..."
								placeholder="请输入关键字">
							<div class="input-group-btn">
								<button type="submit" class="btn btn-primary">搜索</button>
							</div>
						</div>
					</form>
				</div>
				<div class="row">
					<h3>${list[0].enterpriseUser.eCompanyName}
						&nbsp;&nbsp;<small><span class="glyphicon glyphicon-map-marker text-danger">${list[0].enterpriseUser.eAddress}</span></small>
					</h3>
					<div class="row">
						<div class="col-lg-10"><span class="glyphicon glyphicon-globe text-primary">${list[0].enterpriseUser.eEnterpriseNature}</span>&nbsp;&nbsp;
						<span class="glyphicon glyphicon-pushpin text-primary">${list[0].enterpriseUser.eCorporateSector}</span> </div>
						<div class="col-lg-2">
							<a href="#data">该公司所有职位</a>
						</div>
					</div>

					<hr />
					<span>${list[0].enterpriseUser.eCompanyInfo}</span> <br />
				</div>
				
				<div id="a" class="row" style="padding-top: 80px">
					<hr>
					<h4 id="data">
						<strong class="text-primary"><span
							class="glyphicon glyphicon-grain"></span>该公司所有职位</strong>
					</h4>
					<form class="form-inline"
						action="${webPath}/recruitmentInfo/allCompanyInfo?id=${id}"
						method="post">
						<div class="form-group">
							<label for="position">职位:</label> <input type="text"
								name="position" value="${position}" id="position"
								class="form-control" aria-label="..." placeholder="请输入职位">
						</div>
						<div class="form-group">
							<label for="place">地点:</label> <input type="text" name="place"
								value="${place}" id="place" class="form-control"
								aria-label="..." placeholder="请输入地点">
						</div>
						<label for="select">根据工资</label>
						<div class="input-group">
							<div class="input-group-btn">
								<select class="form-control" name="select" id="select">
									<option value="1"
										<c:if test="${select==1}">selected="selected"</c:if>>升序</option>
									<option value="2"
										<c:if test="${select==2}">selected="selected"</c:if>>降序</option>
								</select>
							</div>
						</div>
						<div class="input-group">
							<button type="submit" class="btn btn-primary">筛选</button>
						</div>
					</form>


					<div>
						<table class="table table-striped table-hover table-responsive">
							<tr class="info">
								<th class="text-center">职位</th>
								<th class="text-center">要求</th>
								<th class="text-center">地点</th>
								<th class="text-center">薪资</th>
								<th class="text-center">时间</th>
							</tr>
							<c:forEach items="${list}" var="i" varStatus="status">
								<tr>
									<td><a
										href="${webPath}/recruitmentInfo/selectInfoByid?id=${i.iId}">${i.position}</a></td>
									<td>${i.education}</td>
									<td>${i.place}</td>
									<td><fmt:parseNumber integerOnly="true"
											value="${i.salary}"></fmt:parseNumber> /月</td>
									<td><fmt:formatDate value="${i.releaseTime}"
											pattern="yyyy-MM-dd" /></td>
								</tr>
							</c:forEach>
						</table>
					</div>
					<div class="text-right">
						<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span>
						<a
							href="${webPath}/recruitmentInfo/allCompanyInfo?pageNum=1&select=${select}&position=${position}&place=${place}&id=${id}">首页</a>

						<c:if test="${info.hasPreviousPage}">
							<a
								href="${webPath}/recruitmentInfo/allCompanyInfo?pageNum=${info.pageNum-1}&position=${position}&place=${place}&id=${id}">上一页</a>
						</c:if>
						<c:forEach items="${info.navigatepageNums }" var="pagenumber">
							<a
								href="${webPath}/recruitmentInfo/allCompanyInfo?pageNum=${pagenumber}&position=${position}&place=${place}&id=${id}">${pagenumber}</a>
						</c:forEach>
						<c:if test="${info.hasNextPage}">
							<a
								href="${webPath}/recruitmentInfo/allCompanyInfo?pageNum=${info.pageNum+1}&position=${position}&place=${place}&id=${id}">下一页</a>
						</c:if>
						<a
							href="${webPath}/recruitmentInfo/allCompanyInfo?pageNum=${info.pages}&position=${position}&place=${place}&id=${id}">末页</a>
					</div>
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>

	</div>

</body>
</html>