<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>发布招聘信息</title>

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
						<li><a href="${webPath}/recruitmentInfo/getRinfosByEid">招聘管理</a></li>
						<li class="active"><a
							href="${webPath}/recruitmentInfo/addRinfoPage">发布招聘</a></li>
						<li><a href="${webPath}/enterprise/infoPage">企业信息</a></li>
						<li><a href="${webPath}/enterprise/modifyPwdoPage">修改密码</a></li>
					</ul>
				</div>
				<div class="col-sm-9 col-md-10 info">
					<div class="row">
						<div class="col-sm-9 col-md-10">
							<h3 class="text-center text-primary">发布招聘</h3>
							<hr />
							<form action="${webPath}/recruitmentInfo/postTheAD"
								class="form-horizontal" method="post"
								onsubmit="return inspect();">
								<div class="row">
									<div class="col-sm-6 col-md-6">
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="position"><strong
												class="text-danger">*</strong>&nbsp;工作职位:</label>
											<div class="col-sm-8">
												<input class="form-control" type="text" id="position"
													name="position" placeholder="请输入要发布的工作职位">
											</div>
										</div>
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="place"><strong
												class="text-danger">*</strong>&nbsp;地区:</label>
											<div class="col-sm-8">
												<input class="form-control" type="text" id="place"
													name="place" placeholder="请输入地区">
											</div>
										</div>
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="corporateName"><strong
												class="text-danger">*</strong>&nbsp;企业名称:</label>
											<div class="col-sm-8">
												<input class="form-control" type="text" id="corporateName"
													name="corporateName" value="${enterprise.eCompanyName }"
													placeholder="请输入企业名称">
											</div>
										</div>
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="salary"><strong
												class="text-danger">*</strong>&nbsp;每月薪资:</label>
											<div class="col-sm-8">
												<input class="form-control" type="number" id="salary"
													name="salary" placeholder="请输入工作薪资 $$/月">
											</div>
										</div>
									</div>
									<div class="col-sm-6 col-md-6">
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="corporateSector"><strong
												class="text-danger">*</strong>&nbsp;企业领域:</label>
											<div class="col-sm-8">
												<input class="form-control" type="text" id="corporateSector"
													name="corporateSector"
													value="${enterprise.eCorporateSector }"
													placeholder="请输入企业领域">
											</div>
										</div>
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="enterpriseNature"><strong
												class="text-danger">*</strong>&nbsp;企业性质:</label>
											<div class="col-sm-8">
												<select class="form-control" id="eEnterpriseNature"
													name="eEnterpriseNature">
													<option value="民营企业"
														<c:if test="${enterprise.eCorporateSector=='民营企业'}">selected="selected"</c:if>>民营企业</option>
													<option value="私营企业"
														<c:if test="${enterprise.eCorporateSector=='私营企业'}">selected="selected"</c:if>>私营企业</option>
													<option value="三资企业"
														<c:if test="${enterprise.eCorporateSector=='三资企业'}">selected="selected"</c:if>>三资企业</option>
													<option value="股份制企业"
														<c:if test="${enterprise.eCorporateSector=='股份制企业'}">selected="selected"</c:if>>股份制企业</option>
													<option value="行政机关"
														<c:if test="${enterprise.eCorporateSector=='行政机关'}">selected="selected"</c:if>>行政机关</option>
													<option value="社会团体"
														<c:if test="${enterprise.eCorporateSector=='社会团体'}">selected="selected"</c:if>>社会团体</option>
													<option value="事业单位"
														<c:if test="${enterprise.eCorporateSector=='事业单位'}">selected="selected"</c:if>>事业单位</option>
													<option value="国有企业"
														<c:if test="${enterprise.eCorporateSector=='国有企业'}">selected="selected"</c:if>>国有企业</option>
													<option value="集体企业"
														<c:if test="${enterprise.eCorporateSector=='集体企业'}">selected="selected"</c:if>>集体企业</option>
													<option value="集体事业"
														<c:if test="${enterprise.eCorporateSector=='集体事业'}">selected="selected"</c:if>>集体事业</option>
													<option value="乡镇企业"
														<c:if test="${enterprise.eCorporateSector=='乡镇企业'}">selected="selected"</c:if>>乡镇企业</option>
													<option value="跨国集团"
														<c:if test="${enterprise.eCorporateSector=='跨国集团'}">selected="selected"</c:if>>跨国集团</option>
													<option value="外资企业"
														<c:if test="${enterprise.eCorporateSector=='外资企业'}">selected="selected"</c:if>>外资企业</option>
													<option value="其他"
														<c:if test="${enterprise.eCorporateSector=='其他'}">selected="selected"</c:if>>其他</option>
												</select>
											</div>
										</div>
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="education"><strong
												class="text-danger">*</strong>&nbsp;学历要求:</label>
											<div class="col-sm-8">
												<input class="form-control" type="text" id="education"
													name="education" placeholder="请输入学历要求">
											</div>
										</div>
										<div class="form-group form-group-sm">
											<label class="col-sm-4 control-label" for="numberOfRecruits"><strong
												class="text-danger">*</strong>&nbsp;招聘人数:</label>
											<div class="col-sm-8">
												<input class="form-control" type="number"
													id="numberOfRecruits" name="numberOfRecruits"
													placeholder="请输入要招聘的岗位人数">
											</div>
										</div>
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
										<textarea class="form-control" rows="3"
											id="contactInformation" name="contactInformation"
											placeholder="请完善联系方式">联系人:${enterprise.eContacts},联系电话:${enterprise.eContactNumber}</textarea>
									</div>
								</div>
								<div class="form-group form-group-sm">
									<label class="col-sm-2 control-label" for="companyInformation"><strong
										class="text-danger">*</strong>&nbsp;公司信息:</label>
									<div class="col-sm-10">
										<textarea class="form-control" rows="3"
											id="companyInformation" name="companyInformation"
											placeholder="请完善公司信息">${enterprise.eCompanyInfo}</textarea>
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-3"></div>
									<div class="col-sm-6">
										<button class="btn btn-primary form-control" type="submit">发布招聘</button>
									</div>
									<div class="col-sm-3"></div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		
		function inspect() {
			var position = document.getElementById("position").value.trim();
			var place = document.getElementById("place").value.trim();
			var corporateName = document.getElementById("corporateName").value.trim();
			var salary = document.getElementById("salary").value.trim();
			var corporateSector = document.getElementById("corporateSector").value.trim();
			var education = document.getElementById("education").value.trim();
			var numberOfRecruits = document.getElementById("numberOfRecruits").value.trim();
			var corporateWelfare = document.getElementById("corporateWelfare").value.trim();
			var jobInformation = document.getElementById("jobInformation").value.trim();
			var contactInformation = document.getElementById("contactInformation").value.trim();
			var companyInformation = document.getElementById("companyInformation").value.trim();
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
			var con = confirm("是否该招聘信息发布?");
			if (con != true) {
				return false;
			}
		}
	</script>
</body>
</html>