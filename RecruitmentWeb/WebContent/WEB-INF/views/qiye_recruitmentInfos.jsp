<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>招聘信息管理</title>
<!-- admin.css -->
<link href="${webPath}/static/css/admin.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    	<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<%@include file="head.jsp"%>
	<div class="container">
		<%@include file="qiye_head.jsp"%>
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 ">
					<ul class="nav nav-sidebar">
						<li><a href="${webPath}/resumeInfo/getInfoByid">简历箱</a></li>
						<li class="active"><a
							href="${webPath}/recruitmentInfo/getRinfosByEid">招聘管理</a></li>
						<li><a href="${webPath}/recruitmentInfo/addRinfoPage">发布招聘</a></li>
						<li><a href="${webPath}/enterprise/infoPage">企业信息</a></li>
						<li><a href="${webPath}/enterprise/modifyPwdoPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<form class="form-inline"
						action="${webPath}/recruitmentInfo/getRinfosByEid">
						<div class="form-group">
							<label>发布状态:</label> <select class="form-control" name="state">
								<option value="1"
									<c:if test="${state==1 }">selected="selected"</c:if>>已发布</option>
								<option value="0"
									<c:if test="${state==0 }">selected="selected"</c:if>>已关闭</option>
								<option value="-1"
									<c:if test="${state==-1 }">selected="selected"</c:if>>违规信息</option>
							</select>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail2">发布时间:</label> <input name="time"
								type="date" class="form-control" id="time" value="${time}">
						</div>

						<div class="input-group">

							<input type="text" name="position" value="${position}"
								class="form-control" aria-label="..." placeholder="根据职位搜索">
							<div class="input-group-btn">
								<button type="submit" class="btn btn-primary">搜索</button>
							</div>
						</div>
					</form>
					<br />
					<table class="table table-hover table-condensed">
						<tr class="info">
							<th>编号</th>
							<th>职位</th>
							<th>要求</th>
							<th>地点</th>
							<th>薪资</th>
							<th>发布时间</th>
							<th>状态</th>
							<th>详情</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${list}" var="i" varStatus="status">
							<tr class="text-center">
								<td>${status.count+((info.pageNum-1)*10)}</td>
								<td><strong>${i.position}</strong></td>
								<td>招${i.numberOfRecruits}人</td>
								<td>${i.place}</td>
								<td class="text-danger"><strong><fmt:parseNumber
											integerOnly="true" value="${i.salary}"></fmt:parseNumber> /月</strong></td>
								<td><fmt:formatDate value="${i.updateTime }"
										pattern="yyyy/MM/dd" /></td>
								<c:if test="${i.state==1 }">
									<td>已发布</td>
								</c:if>
								<c:if test="${i.state==-1 }">
									<td>违规信息</td>
								</c:if>
								<c:if test="${i.state==0 }">
									<td>已关闭</td>
								</c:if>
								<td><input id="i${status.count}" type="hidden"
									value="${i.iId }" /> <a id="a${status.count}"> <span
										class="glyphicon glyphicon-search"></span>
								</a></td>
								<td><input id="state${status.count}" type="hidden"
									value="${i.state}"> <c:if test="${i.state==1}">
										<button class="btn btn-sm btn-danger" id="b${status.count}">
											<span class="glyphicon glyphicon-lock"></span>
										</button>
									</c:if> <c:if test="${i.state==0}">
										<button class="btn btn-sm btn-primary" id="b${status.count}">
											<span class="glyphicon glyphicon-cloud-upload"></span>
										</button>
									</c:if> <c:if test="${i.state==-1 }">
										<small class="glyphicon glyphicon-ban-circle"></small>
									</c:if></td>
							</tr>
						</c:forEach>
					</table>
					<div class="text-right">
						<span>当前${info.pageNum}页,总${info.pages}页,总${info.total}条记录</span>
						<a
							href="${webPath}/recruitmentInfo/getRinfosByEid?pageNum=1&position=${position}&state=${state}">首页</a>
						<c:if test="${info.hasPreviousPage}">
							<a
								href="${webPath}/recruitmentInfo/getRinfosByEid?pageNum=${info.pageNum-1}&position=${position}&state=${state}">上一页</a>
						</c:if>
						<c:forEach items="${info.navigatepageNums }" var="pagenumber">
							<a
								href="${webPath}/recruitmentInfo/getRinfosByEid?pageNum=${pagenumber}&position=${position}&state=${state}">${pagenumber}</a>
						</c:forEach>
						<c:if test="${info.hasNextPage}">
							<a
								href="${webPath}/recruitmentInfo/getRinfosByEid?pageNum=${info.pageNum+1}&position=${position}&state=${state}">下一页</a>
						</c:if>
						<a
							href="${webPath}/recruitmentInfo/getRinfosByEid?pageNum=${info.pages}&position=${position}&state=${state}">末页</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="rinfoModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title text-center" id="myModalLabel">招聘信息</h4>

					<small class="text-danger" id="notes">注:该窗口下可编辑招聘信息</small>
				</div>
				<div class="modal-body" style="word-break: break-word;">

					<form class="form-horizontal" id="recruitmentForm">
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="position"><strong
								class="text-danger">*</strong>&nbsp;招聘职位:</label>
							<div class="col-sm-4">
								<input id="iId" name="iId" type="hidden"> <input
									class="form-control" type="text" id="position" name="position"
									readonly="readonly">
							</div>
							<div class="col-sm-3">
								<strong>发布于:<small id="subtime"></small></strong>
							</div>
							<div class="col-sm-3">
								<strong>修改于:<small id="updateTime"></small></strong>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="place"><strong
								class="text-danger">*</strong>&nbsp;地区:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="place" name="place"
									placeholder="请输入地区">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="corporateName"><strong
								class="text-danger">*</strong>&nbsp;企业名称:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="corporateName"
									name="corporateName" readonly="readonly" placeholder="请输入企业名称">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="salary"><strong
								class="text-danger">*</strong>&nbsp;每月薪资:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="salary"
									name="salary" placeholder="请输入工作薪资 $$/月">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="corporateSector"><strong
								class="text-danger">*</strong>&nbsp;企业领域:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="corporateSector"
									name="corporateSector" readonly="readonly"
									placeholder="请输入企业领域">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="enterpriseNature"><strong
								class="text-danger">*</strong>&nbsp;企业性质:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="enterpriseNature"
									name="enterpriseNature" readonly="readonly"
									placeholder="请输入工作性质">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="education"><strong
								class="text-danger">*</strong>&nbsp;学历要求:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="education"
									name="education" placeholder="请输入学历要求">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="numberOfRecruits"><strong
								class="text-danger">*</strong>&nbsp;招聘人数:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="numberOfRecruits"
									name="numberOfRecruits" placeholder="请输入要招聘的岗位人数">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="corporateWelfare"><strong
								class="text-danger">*</strong>&nbsp;公司福利:</label>
							<div class="col-sm-10">
								<input class="form-control" type="text" id="corporateWelfare"
									name="corporateWelfare" placeholder="请输入公司福利">
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="jobInformation"><strong
								class="text-danger">*</strong>&nbsp;职位信息:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="jobInformation"
									name="jobInformation" placeholder="请输入具体的工作要求"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="contactInformation"><strong
								class="text-danger">*</strong>&nbsp;联系方式:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="contactInformation"
									name="contactInformation" placeholder="请完善联系方式"></textarea>
							</div>
						</div>
						<div class="form-group form-group-sm">
							<label class="col-sm-2 control-label" for="companyInformation"><strong
								class="text-danger">*</strong>&nbsp;公司信息:</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3" id="companyInformation"
									name="companyInformation" placeholder="请完善公司信息"></textarea>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-warning" id="updatabtn">修改并发布</button>

				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
	<!-- /container -->
	<script type="text/javascript">
		
		$(document).ready(function() {
			for (var i = 1; i <= 10; i++) {
				$("#a" + i).click(f("i" + i));
				$("#b" + i).click(fun("i" + i, "state" + i));
			}
			$("#updatabtn").click(updata());

		});

		var fun = function(id, state) {
			return function() {
				var i = document.getElementById(id).value;
				var s = document.getElementById(state).value;
				var con;
				if (s == 1) {
					con = confirm("是否关闭该条招聘信息?");
					if (con != true) {
						return false;
					}
				} else if (s == 0) {
					con = confirm("是否重新发布该条招聘信息?");
					if (con != true) {
						return false;
					}
				}

				$.ajax({
					url : "${webPath}/recruitmentInfo/closeOrOpenInfo",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : {
						id : i,
						state : s
					},
					success : function(msg) {
						if (msg > 0) {
							alert("操作成功!");
							parent.location.reload();
						}

					},
					error : function(errordata) {
						alert("出错啦！");
					}
				});
			};
		};

		var updata = function() {
			return function() {
				if(inspect()!=true){
					return false;
				}
				$.ajax({
					url : "${webPath}/recruitmentInfo/modifyInfo",
					cache : false,
					type : "POST",
					dataType : "json",
					async : "true",
					data : $("#recruitmentForm").serialize(),
					success : function(msg) {
						if (msg > 0) {
							alert("修改成功!");
							parent.location.reload();
						}

					},
					error : function(errordata) {
						alert("出错啦！");
					}
				});
			};
		};

		var f = function(i) {
			return function() {
				var iId = document.getElementById(i).value;
				$
						.ajax({

							url : "${webPath}/recruitmentInfo/getRInfoByiId",
							cache : false,
							type : "POST",
							dataType : "json",
							async : "true",
							data : {
								iId : iId
							},
							success : function(msg) {
								document.getElementById("iId").value = msg.iId;
								document.getElementById("position").value = msg.position;
								document.getElementById("place").value = msg.place;
								document.getElementById("corporateName").value = msg.corporateName;
								document.getElementById("salary").value = msg.salary;
								document.getElementById("corporateSector").value = msg.corporateSector;
								document.getElementById("enterpriseNature").value = msg.enterpriseNature;
								document.getElementById("education").value = msg.education;
								document.getElementById("numberOfRecruits").value = msg.numberOfRecruits;
								document.getElementById("corporateWelfare").value = msg.corporateWelfare;
								document.getElementById("jobInformation").value = msg.jobInformation;
								document.getElementById("contactInformation").value = msg.contactInformation;
								document.getElementById("companyInformation").value = msg.companyInformation;
								document.getElementById("subtime").innerHTML = TimeConversion(msg.releaseTime);
								document.getElementById("updateTime").innerHTML = TimeConversion(msg.updateTime);
								if (msg.state == -1) {
									$("#notes").html('');
									$("#updatabtn").html('信息违规');
									$("#updatabtn").attr("disabled", true);
								}
								$("#rinfoModal").modal({
									backdrop : 'static',
									keyboard : false
								});
							},
							error : function(errordata) {
								alert("出错啦！");
							}
						});
			};
		};

		function TimeConversion(time) {
			//首先在前台得到javascript可以识别的date类型
			var date = new Date(parseInt(time, 10));
			var year = date.getFullYear();

			var month = date.getMonth() + 1;

			var day = date.getDate();

			return year + "-" + month + "-" + day;
		};

		function inspect() {
			var position = document.getElementById("position").value.trim();
			var place = document.getElementById("place").value.trim();
			var corporateName = document.getElementById("corporateName").value
					.trim();
			var salary = document.getElementById("salary").value.trim();
			var corporateSector = document.getElementById("corporateSector").value
					.trim();
			var education = document.getElementById("education").value.trim();
			var numberOfRecruits = document.getElementById("numberOfRecruits").value
					.trim();
			var corporateWelfare = document.getElementById("corporateWelfare").value
					.trim();
			var jobInformation = document.getElementById("jobInformation").value
					.trim();
			var contactInformation = document.getElementById("contactInformation").value
					.trim();
			var companyInformation = document.getElementById("companyInformation").value
					.trim();
			if (position == "" || position.length > 50) {
				alert("请输入招聘职位(限50字以内的字符)");
				return false;
			}
			if (place == "" || place.length > 50) {
				alert("请输入工作地点(限50字以内的字符)");
				return false;
			}

			if (corporateName == "" || corporateName.length > 100) {
				alert("请输入企业名称(限100字以内的字符)");
				return false;
			}

			if (salary == "" || salary.length > 10) {
				alert("请输入薪资(限10位数的数字)");
				return false;
			}

			if (corporateSector == "" || corporateSector.length > 50) {
				alert("请输入企业领域(限50字以内的字符)");
				return false;
			}

			if (education == "" || education.length > 50) {
				alert("请输入学历要求(限50字以内的字符)");
				return false;
			}

			if (numberOfRecruits == "" || numberOfRecruits.length > 5) {
				alert("请输入招聘人数(限五位数的数字)");
				return false;
			}

			if (corporateWelfare == "" || corporateWelfare.length > 255) {
				alert("请输入公司福利(限255字以内的字符)");
				return false;
			}
			if (jobInformation == "" || jobInformation.length > 500) {
				alert("请输入职位信息(限500字以内的字符)");
				return false;
			}
			if (contactInformation == "" || contactInformation.length > 500) {
				alert("请输入联系方式(限500字以内的字符)");
				return false;
			}
			if (companyInformation == "" || companyInformation.length > 1500) {
				alert("请输入公司信息(限1500字以内的字符)");
				return false;
			}
			var con = confirm("请确认发布信息无误,是否重新发布?");
			if (con != true) {
				return false;
			}
			return true;
		}
	</script>



</body>
</html>