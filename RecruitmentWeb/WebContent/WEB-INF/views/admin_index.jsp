<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>招聘信息管理</title>
<link href="${webPath}/static/css/admin.css" rel="stylesheet">
</head>

<body>
<%@include file="head.jsp" %>
	<div class="container">
		<%@include file="admin_head.jsp" %>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li class="active"><a href="${webPath }/admin/index">招聘管理</a></li>
						<li><a href="${webPath }/admin/accountManagement">账户管理</a></li>
						<li><a href="${webPath }/admin/adminInfo">个人信息</a></li>
						<li><a href="${webPath }/admin/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<form class="form-inline" action="${webPath}/admin/index"
						method="post">
						<div class="form-group">
							<label for="exampleInputEmail2">发布时间:</label> <input
								type="date" class="form-control" name="time"
								id="exampleInputEmail2" placeholder="输入">
						</div>

						<div class="input-group">
							<input type="text" class="form-control" aria-label="..."
								name="account" placeholder="根据输入的用户账号搜索" value="${account}">
							<div class="input-group-btn">
								<button type="submit" class="btn btn-primary">搜索</button>
							</div>
						</div>
					</form>
					<br />
					<table class="table table-hover table-condensed table-responsive">
						<tr class="info">
							<th>序号</th>
							<th>用户账号</th>
							<th>信息标题</th>
							<th>发布时间</th>
							<th>信息状态</th>
							<th>详情</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${list}" var="i" varStatus="status">
							<tr class="text-center">
								<td>${status.count+((info.pageNum-1)*10) }</td>
								<td><strong>${i.enterpriseUser.eAccount }</strong></td>
								<td><strong>${i.position }</strong></td>
								<td><fmt:formatDate value="${i.updateTime}"
										pattern="yyyy/MM/dd" /></td>
								<c:if test="${i.state==-1 }">
									<td class="text-danger"><strong>非法已删除</strong></td>
								</c:if>
								<c:if test="${i.state==0 }">
									<td class="text-danger"><strong>待查看</strong></td>
								</c:if>
								<c:if test="${i.state==1 }">
									<td class="text-primary"><strong>正常发布</strong></td>
								</c:if>
								<td>
								
								<input id="i${status.count}" type="hidden" value="${i.iId }"/>
								<a id="a${status.count}"> <span
										class="glyphicon glyphicon-search"></span>
								</a></td>
								<td>
									<form action="${webPath}/admin/recruitmentInfoState"
										method="post" onsubmit="return inspect();">
										<input type="hidden" name="time" value="${time}"> <input
											type="hidden" name="account" value="${account}"> <input
											type="hidden" name="iId" value="${i.iId}"> <input
											type="hidden" name="state" value="${i.state}"> <input
											type="hidden" name="pageNum" value="${pageNum}">
										<c:if test="${i.state==-1||i.state==0 }">
										<button type="submit" class="btn btn-sm btn-primary">恢复信息</button>
										</c:if>
										<c:if test="${i.state==1 }">
											<button type="submit" class="btn btn-sm btn-danger">删除信息</button>
										</c:if>
									</form>
								</td>
							</tr>
						</c:forEach>
					</table>
					<div class="text-right">
						<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span>
						<a
							href="${webPath}/admin/index?pageNum=1&time=${time}&account=${account}">首页</a>

						<c:if test="${info.hasPreviousPage}">
							<a
								href="${webPath}/admin/index?pageNum=${info.pageNum-1}&time=${time}&account=${account}">上一页</a>
						</c:if>
						<c:forEach items="${info.navigatepageNums }" var="pagenumber">
							<a
								href="${webPath}/admin/index?pageNum=${pagenumber}&time=${time}&account=${account}">${pagenumber}</a>
						</c:forEach>
						<c:if test="${info.hasNextPage}">
							<a
								href="${webPath}/admin/index?pageNum=${info.pageNum+1}&time=${time}&account=${account}">下一页</a>
						</c:if>
						<a
							href="${webPath}/admin/index?pageNum=${info.pages}&time=${time}&account=${account}">末页</a>
					</div>
				</div>
			</div>
		</div>
	</div>






	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title text-center" id="myModalLabel">
						招聘信息</h4>
				</div>
				<div class="modal-body" style="word-break: break-word;">

					<form action="${webPath}/recruitmentInfo/postTheAD"
						class="form-horizontal" method="post">
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="position"><strong
								class="text-danger">*</strong>&nbsp;工作职位:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="position"
									name="position" readonly="readonly">
									<input type="hidden" id="iId">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="place"><strong
								class="text-danger">*</strong>&nbsp;地区:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="place" name="place"
									readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="corporateName"><strong
								class="text-danger">*</strong>&nbsp;企业名称:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="corporateName"
									name="corporateName" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="salary"><strong
								class="text-danger">*</strong>&nbsp;每月薪资:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="salary"
									name="salary" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="corporateSector"><strong
								class="text-danger">*</strong>&nbsp;企业领域:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="corporateSector"
									name="corporateSector" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="enterpriseNature"><strong
								class="text-danger">*</strong>&nbsp;企业性质:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="enterpriseNature"
									name="enterpriseNature" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="education"><strong
								class="text-danger">*</strong>&nbsp;学历要求:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="education"
									name="education" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="numberOfRecruits"><strong
								class="text-danger">*</strong>&nbsp;招聘人数:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="numberOfRecruits"
									name="numberOfRecruits" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="corporateWelfare"><strong
								class="text-danger">*</strong>&nbsp;公司福利:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="corporateWelfare"
									name="corporateWelfare" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="jobInformation"><strong
								class="text-danger">*</strong>&nbsp;职位信息:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="jobInformation"
									name="jobInformation" readonly="readonly"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="contactInformation"><strong
								class="text-danger">*</strong>&nbsp;联系方式:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="contactInformation"
									name="contactInformation" readonly="readonly"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="companyInformation"><strong
								class="text-danger">*</strong>&nbsp;公司信息:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="companyInformation"
									name="companyInformation" readonly="readonly"></textarea>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<!-- /container -->
	<script type="text/javascript">
	function inspect(){
 		var con=confirm("请确认信息无误,是否执行该操作?");
 		if (con!=true) {
			return false;
		}
 	}
	$(document).ready(
		function(){
			for (var i = 1; i <= 10; i++) {
				$("#a"+i).click(
						f("i"+i)	
				);
			}
			$("#delInfoBtn").click(
				function(){
					var iId = document.getElementById("iId").value;
					var con=confirm("数据无法恢复,确认删除?");
					if (con==true) {
						$.ajax({
							url:"${webPath}/admin/delInfoById",
							cache:false,
							type:"POST",
							dataType:"json",
							async:"true",
							data:{iId:iId},
							success:function(msg){
								if(msg>0){
									alert("删除成功!");
									parent.location.reload();
								}else{
									alert("删除失败!");
								}
							},
							error:function(errordata){
								alert("出错啦!");
							}
						});
					}
					
				}		
			);
		
		}
		);
	
	var f=function(i) {
		return function(){
		var iId = document.getElementById(i).value;
		$.ajax({
			url: "${webPath}/admin/getInRecruitmentInfoByiId",
			cache:false,
			type:"POST",
			dataType:"json",
			async:"true",
			data:{iId:iId},
			success:function(msg){
				document.getElementById("iId").value=msg.iId;
				document.getElementById("position").value=msg.position;
				document.getElementById("place").value=msg.place;
				document.getElementById("corporateName").value=msg.corporateName;
				document.getElementById("salary").value=msg.salary;
				document.getElementById("corporateSector").value=msg.corporateSector;
				document.getElementById("enterpriseNature").value=msg.enterpriseNature;
				document.getElementById("education").value=msg.education;
				document.getElementById("numberOfRecruits").value=msg.numberOfRecruits;
				document.getElementById("corporateWelfare").value=msg.corporateWelfare;
				document.getElementById("jobInformation").value=msg.jobInformation;
				document.getElementById("contactInformation").value=msg.contactInformation;
				document.getElementById("companyInformation").value=msg.companyInformation;
				$("#myModal").modal("show");
			},
			error:function(errordata){
				alert("出错啦！");
			}
		});
		};
	};
</script>
</body>
</html>