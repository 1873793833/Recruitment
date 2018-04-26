 <%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>账户管理</title>
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
						<li><a href="${webPath }/admin/index">招聘管理</a></li>
						<li class="active"><a
							href="${webPath }/admin/accountManagement">账户管理</a></li>
						<li><a href="${webPath }/admin/adminInfo">个人信息</a></li>
						<li><a href="${webPath }/admin/modifyPwdPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<form class="form-inline"
						action="${webPath}/admin/accountManagement" method="post">
						<div class="form-group">
							<label>账号类型:</label> <select class="form-control" name="type">
								<option value="个人账号"
									<c:if test="${type=='个人账号'}">
									selected="selected"
								</c:if>>个人账号</option>

								<option value="企业账号"
									<c:if test="${type=='企业账号'}">
									selected="selected"
								</c:if>>企业账号</option>
							</select>
						</div>
						<div class="form-group">
							<label for="time">注册时间:</label> <input
								name="time" type="date" class="form-control"
								id="time">
						</div>

						<div class="input-group">
							<input type="text" class="form-control" name="account"
								value="${account}" placeholder="根据输入的用户账号搜索">
							<div class="input-group-btn">
								<button type="submit" class="btn btn-primary">搜索</button>
							</div>
						</div>
					</form>
					<br />
					<table class="table table-hover table-condensed">
						<tr class="info">
							<th>序号</th>
							<th>用户账号</th>
							<th>账号类型</th>
							<th>注册时间</th>
							<th>账户状态</th>
							<th>详情</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${list}" var="i" varStatus="sta">
							<c:if test="${i.type=='个人账号'}">
								<tr class="text-center">
									<td>${sta.count+((info.pageNum-1)*10)}</td>
									<td>${i.iAccount}</td>
									<td>${i.type}</td>
									<td><fmt:formatDate value="${i.iRegtime}"
											pattern="yyyy/MM/dd" /></td>
									<c:if test="${i.accStatus==1 }">
										<td class="text-primary">已激活</td>
									</c:if>
									<c:if test="${i.accStatus==-1 }">
										<td class="text-danger">已禁用</td>
									</c:if>
									<td>
									<input id="type${sta.count}" type="hidden" value="${i.type}"/>
									<input id="i${sta.count}" type="hidden" value="${i.iId }" /> 
									<input id="accStatus${sta.count}" type="hidden" value="${i.accStatus }" /> 
									<a id="g${sta.count}"><span class="glyphicon glyphicon-search"></span></a>
									</td>
									<td>
											<c:if test="${i.accStatus==1 }">
												<button type="button" id="ibtn${sta.count}" class="btn btn-sm btn-danger">禁用</button>
											</c:if>
											<c:if test="${i.accStatus==-1 }">
												<button type="button" id="ibtn${sta.count}" class="btn btn-sm btn-primary">激活</button>
											</c:if>
										
									</td>
								</tr>
							</c:if>
							<c:if test="${i.type=='企业账号'}">
								<tr class="text-center">
									<td>${sta.count+((info.pageNum-1)*10)}<input
										type="hidden" id="accoutnId" name="accoutnId" value="${i.eId}">
										<input type="hidden" id="status" name="status"
										value="${i.accStatus}">
									</td>
									<td>${i.eAccount}</td>
									<td>${i.type}</td>
									<td><fmt:formatDate value="${i.eRegtime}"
											pattern="yyyy/MM/dd hh:mm:ss" /></td>
									<c:if test="${i.accStatus==1 }">
										<td class="text-primary">已激活</td>
									</c:if>
									<c:if test="${i.accStatus==-1 }">
										<td class="text-danger">未激活</td>
									</c:if>
									<td>
									<input id="type${sta.count}" type="hidden" value="${i.type}"/>
									<input id="e${sta.count}" type="hidden" value="${i.eId }" /> 
									<input id="accStatus${sta.count}" type="hidden" value="${i.accStatus }" />
										<a id="q${sta.count}"> <span class="glyphicon glyphicon-search"></span>
									</a></td>
									<td>
											<c:if test="${i.accStatus==1 }">
												<button type="button" id="ebtn${sta.count}" class="btn btn-sm btn-danger">禁用</button>
											</c:if>
											<c:if test="${i.accStatus==-1 }">
												<button type="button" id="ebtn${sta.count}" class="btn btn-sm btn-primary">激活</button>
											</c:if>
										
									</td>
								</tr>
							</c:if>
						</c:forEach>
					</table>
					<div class="text-right">
						<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span>
						<a
							href="${webPath}/admin/accountManagement?pageNum=1&time=${time}&account=${account}&type=${type}">首页</a>

						<c:if test="${info.hasPreviousPage}">
							<a
								href="${webPath}/admin/accountManagement?pageNum=${info.pageNum-1}&time=${time}&account=${account}&type=${type}">上一页</a>
						</c:if>
						<c:forEach items="${info.navigatepageNums }" var="pagenumber">
							<a
								href="${webPath}/admin/accountManagement?pageNum=${pagenumber}&time=${time}&account=${account}&type=${type}">${pagenumber}</a>
						</c:forEach>
						<c:if test="${info.hasNextPage}">
							<a
								href="${webPath}/admin/accountManagement?pageNum=${info.pageNum+1}&time=${time}&account=${account}&type=${type}">下一页</a>
						</c:if>
						<a
							href="${webPath}/admin/accountManagement?pageNum=${info.pages}&time=${time}&account=${account}&type=${type}">末页</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="iInfoModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title text-center" id="myModalLabel">
						账号信息</h4>
				</div>
				<div class="modal-body" style="word-break: break-word;">

					<form class="form-horizontal" >
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iRegtime"><strong
								class="text-danger">*</strong>&nbsp;注册时间:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iRegtime"
									name="iRegtime" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iAccount"><strong
								class="text-danger">*</strong>&nbsp;账号:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iAccount"
									name="iAccount" readonly="readonly">
									<input type="hidden" id="iId">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="itype"><strong
								class="text-danger">*</strong>&nbsp;账号类型:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="itype"
									name="itype" readonly="readonly">
									<input type="hidden" id="iId">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iaccStatus"><strong
								class="text-danger">*</strong>&nbsp;账号状态:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iaccStatus" name="iaccStatus"
									readonly="readonly">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iName"><strong
								class="text-danger">*</strong>&nbsp;姓名:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iName" name="iName"
									readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iSex"><strong
								class="text-danger">*</strong>&nbsp;性别:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iSex"
									name="iSex" readonly="readonly">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iNation"><strong
								class="text-danger">*</strong>&nbsp;名族:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iNation"
									name="iNation" readonly="readonly">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iDataOfBirth"><strong
								class="text-danger">*</strong>&nbsp;出生日期:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iDataOfBirth"
									name="iDataOfBirth" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iTel"><strong
								class="text-danger">*</strong>&nbsp;电话 :</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iTel"
									name="iTel" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="iEmial"><strong
								class="text-danger">*</strong>&nbsp;邮箱:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="iEmial"
									name="iEmial" readonly="readonly">
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
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="rInfoModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title text-center" id="myModalLabel">
						账号信息</h4>
				</div>
				<div class="modal-body" style="word-break: break-word;">

					<form class="form-horizontal" >
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eRegtime"><strong
								class="text-danger">*</strong>&nbsp;注册时间:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eRegtime"
									name="eRegtime" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eAccount"><strong
								class="text-danger">*</strong>&nbsp;账号:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eAccount"
									name="eAccount" readonly="readonly">
									<input type="hidden" id="iId">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="etype"><strong
								class="text-danger">*</strong>&nbsp;账号类型:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="etype"
									name="etype" readonly="readonly">
									<input type="hidden" id="iId">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eaccStatus"><strong
								class="text-danger">*</strong>&nbsp;账号状态:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eaccStatus" name="eaccStatus"
									readonly="readonly">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eCompanyName"><strong
								class="text-danger">*</strong>&nbsp;企业名称:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eCompanyName" name="eCompanyName"
									readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eEnterpriseNature"><strong
								class="text-danger">*</strong>&nbsp;企业性质:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eEnterpriseNature"
									name="eEnterpriseNature" readonly="readonly">
							</div>
						</div>
						
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eAddress"><strong
								class="text-danger">*</strong>&nbsp;地点:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eAddress"
									name="eAddress" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eContacts"><strong
								class="text-danger">*</strong>&nbsp;联系人:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eContacts"
									name="eContacts" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eEmail"><strong
								class="text-danger">*</strong>&nbsp;邮箱 :</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eEmail"
									name="eEmail" readonly="readonly">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="eCompanyInfo"><strong
								class="text-danger">*</strong>&nbsp;公司简介:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="eCompanyInfo"
									name="eCompanyInfo" readonly="readonly">
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
		$(document).ready(
			function() {
				for (var num = 1; num <= 10; num++) {
					$("#g"+num).click(
						getAccountInfo("i"+num,num)
							);
					$("#q"+num).click(
							getAccountInfo("e"+num,num)
								);
					$("#ebtn"+num).click( eAccount("e"+num,"type"+num,"accStatus"+num));
					$("#ibtn"+num).click( iAccount( "i"+num,"type"+num,"accStatus"+num));
					
				}
		});
		var eAccount=function(id,type,Status){
			return function(){
				var con=confirm("请确认信息无误,是否执行该操作?");
		 		if (con!=true) {
					return false;
				}
				var eId=document.getElementById(id).value;
				var etype=document.getElementById(type).value;
				var eStatus = document.getElementById(Status).value;
				$.ajax({
					url: "${webPath}/admin/accountStatus",
					cache:false,
					type:"POST",
					dataType:"json",
					async:"true",
					data:{id:eId,type:etype,status:eStatus},
					success:function(msg){
						if (msg>0) {
							alert("操作成功!");
						}else{
							alert("操作失败!");
						}
						parent.location.reload();
					},
					error:function(errordata){
						alert("出错啦！");
					}
				});
			};
		};
		var iAccount=function(id,type,Status){
			return function(){
				var con=confirm("请确认信息无误,是否执行该操作?");
		 		if (con!=true) {
					return false;
				}
				var iId=document.getElementById(id).value;
				var itype=document.getElementById(type).value;
				var iStatus = document.getElementById(Status).value;
				$.ajax({
					url: "${webPath}/admin/accountStatus",
					cache:false,
					type:"POST",
					dataType:"json",
					async:"true",
					data:{id:iId,type:itype,status:iStatus},
					success:function(msg){
						if (msg>0) {
							alert("操作成功!");
						}else{
							alert("操作失败!");
						}
						parent.location.reload();
					},
					error:function(errordata){
						alert("出错啦！");
					}
				});
			};
		};
		
		var getAccountInfo= function(message,num) {
			return function() {
				var type=document.getElementById("type"+num).value;
				var id = document.getElementById(message).value;
				$.ajax({
					url: "${webPath}/admin/selectAccountInfoByid",
					cache:false,
					type:"POST",
					dataType:"json",
					async:"true",
					data:{id:id,type:type},
					success:function(msg){
						if(msg.type=="企业账号"){
							document.getElementById("eRegtime").value= TimeConversion(msg.eRegtime);
							document.getElementById("eAccount").value=msg.eAccount;
							document.getElementById("etype").value=msg.type;
							if(msg.accStatus==1){
								document.getElementById("eaccStatus").value="已激活";
							}else if(msg.accStatus==-1){
								document.getElementById("eaccStatus").value="已禁用";
							}
							document.getElementById("eCompanyName").value=msg.eCompanyName;
							document.getElementById("eEnterpriseNature").value=msg.eEnterpriseNature;
							document.getElementById("eAddress").value=msg.eAddress;
							document.getElementById("eContacts").value=msg.eContacts;
							document.getElementById("eEmail").value=msg.eEmail;
							document.getElementById("eCompanyInfo").value=msg.eCompanyInfo;
							$("#rInfoModal").modal("show");
							}else if(msg.type=="个人账号"){
							document.getElementById("iAccount").value=msg.iAccount;
							document.getElementById("iName").value=msg.iName;
							document.getElementById("iSex").value=msg.iSex;
							document.getElementById("iNation").value=msg.iNation;
							if(msg.iDataOfBirth!=null){
								document.getElementById("iDataOfBirth").value=TimeConversion(msg.iDataOfBirth);
							}
							document.getElementById("iTel").value=msg.iTel;
							document.getElementById("iEmial").value=msg.iEmial;
							document.getElementById("iRegtime").value=TimeConversion(msg.iRegtime);
							document.getElementById("itype").value=msg.type;
							if(msg.accStatus==1){
								document.getElementById("iaccStatus").value="已激活";
							}else if(msg.accStatus==-1){
								document.getElementById("iaccStatus").value="已禁用";
							}
							
							$("#iInfoModal").modal("show");
						}
						
					},
					error:function(errordata){
						alert("出错啦！");
					}
				});
			};
		};
		function TimeConversion(time){
			//首先在前台得到javascript可以识别的date类型
			var date = new Date(parseInt(time,10));
			var year = date.getFullYear();

		    var month = date.getMonth() + 1;

		    var day = date.getDate();		
		   
		    return year + "-" + month + "-" + day;
		};
	</script>
</body>
</html>