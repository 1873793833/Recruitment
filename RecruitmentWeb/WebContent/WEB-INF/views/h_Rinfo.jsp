<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>招聘信息</title>
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
				<a class="btn btn-primary"  href="${webPath}/individual/loginPage">登录</a>
				<a class="btn btn-default" href="${webPath}/individual/registerPage">注册</a>
				</c:if>
				<c:if test="${individual!=null }">
				<a href="${webPath}/individual/logOffUser" class="btn btn-sm btn-danger" onclick="return confirm('确认注销当前用户?');">注销登录</a>
				</c:if>
			</div>
			<div class="col-sm-7 col-lg-7">
				<div class="row">
					<div class="col-lg-8">
						<h3>
							<strong>${list.position }</strong>&nbsp;&nbsp;<small><span
								class="glyphicon glyphicon-map-marker text-danger">${list.place}</span></small>
								<input id="iId" name="iId" type="hidden" value="${list.iId }">
						</h3>
					</div>
					<div class="col-lg-4">
						<h3>
							<span class="glyphicon glyphicon-yen text-danger text-right"><fmt:parseNumber
									integerOnly="true" value="${list.salary}"></fmt:parseNumber>/月</span>
						</h3>
					</div>
				</div>
				<div class="row">

					<div class="col-lg-9">
						<a
							href="${webPath}/recruitmentInfo/allCompanyInfo?id=${list.enterpriseId}">${list.corporateName }</a>
					</div>
					<div class="col-lg-3">
						<a
							href="${webPath}/recruitmentInfo/allCompanyInfo?id=${list.enterpriseId}">该公司所有职位</a>
					</div>
				</div>
				<span><span class="glyphicon glyphicon-globe text-primary">${list.enterpriseNature}</span>
					&nbsp;&nbsp; <span class="glyphicon glyphicon-pushpin text-primary">${list.corporateSector}</span></span>
				<div class="row">
					<div class="col-lg-2">
						<span class="glyphicon glyphicon-education text-danger">${list.education}</span>
					</div>
					<div class="col-lg-2">
						<span class="glyphicon glyphicon-user text-danger">招${list.numberOfRecruits}人</span>
					</div>
					<div class="col-lg-3">
						<span class="glyphicon glyphicon-time text-danger"><fmt:formatDate
								value="${list.releaseTime}" pattern="yyyy-MM-dd" />发布</span>
					</div>
				</div>
				<hr />
				<h4>
					<strong class="text-primary"><span
						class="glyphicon glyphicon-grain"></span>公司福利</strong>
				</h4>
				<span>${list.corporateWelfare}</span>
				<hr />
				<h4>
					<strong class="text-primary"><span
						class="glyphicon glyphicon-grain"></span>职位信息</strong>
				</h4>
				<span>${list.jobInformation}</span>
				<hr />
				<h4>
					<strong class="text-primary"><span
						class="glyphicon glyphicon-grain"></span>联系方式</strong>
				</h4>
				<span>${list.contactInformation}</span>
				<hr />
				<h4>
					<strong class="text-primary"><span
						class="glyphicon glyphicon-grain"></span>公司信息</strong>
				</h4>
				<span>${list.companyInformation}</span>
				<hr />
				<div class="row">
					<div class="col-lg-4"></div>
					<div class="col-lg-4">
						<c:if test="${individual!=null}">
							<button id="apply" class="class=btn btn-primary form-control text-center">申请职位</button>
						</c:if>
						<c:if test="${individual==null }">
							<button class="btn btn-primary form-control text-center" data-toggle="modal" data-target="#LoginModal">申请职位</button>
						</c:if>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="LoginModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title text-center" id="myModalLabel">个人用户登录</h4>
				</div>
				<div class="modal-body" style="word-break: break-word;">
					<div class="row">
						<div class="col-lg-3">
						
						</div>
						<div class="col-lg-6">
							<form method="post">
						<div class="form-group">
							<label for="account">账号</label> <input id="account" type="text"
								name="account" class="form-control" placeholder="请输入邮箱" />
						</div>
						<div class="form-group">
							<label for="password">密码</label> <input id="password" type="password"
								name="password" class="form-control" placeholder="请输入密码" />
						</div>
						<button id="loginbtn" type="button"
							class="btn btn-lg btn-primary btn-block">登录</button>
					</form>
					<br />
					<p class="text-center">
						还没有账号? <a href="${webPath}/individual/registerPage">免费注册</a>
					</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal -->
	<script type="text/javascript">
	$(document).ready(function() {
			$("#loginbtn").click(function(){
				$.ajax({
					url : "${webPath}/individual/login",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data:{account:$("#account").val(),password:$("#password").val()},
					success : function(msg) {
						if(msg>0){
							alert("登录成功!");
							parent.location.reload();
						}else if(msg==0){
							alert("用户名或密码错误,请重新输入!");
						}else if(msg==-1){
							alert("该账号已被禁用,请联系系统管理员!");
						}
					},
					error : function(errordata) {
						alert("出错啦！");
					}
				});
			});
			
			
			$("#apply").click(function(){
				$.ajax({
					url : "${webPath}/resumeInfo/checkDuplicate",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : {id:$("#iId").val()},
					success : function(msg) {
						if (msg > 0) {
							alert("您以向该条招聘投递过简历,请勿重复投递!");
						}else{
							window.location.href="${webPath}/individual/writeResumePage?eid=${list.enterpriseId }&rid=${list.iId}&position=${list.position}";
							
						}
					},
					error : function(errordata) {
						alert("出错啦！");
					}
				});
			});
			checkDuplicate
			
	});
	
	</script>
</body>
</html>