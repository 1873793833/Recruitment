<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>修改招聘信息</title>
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
	<div class="container">
		<div class="row">
			<div class="col-lg-2 col-sm-1"></div>
			<div class="col-lg-8 col-sm-10">
				<h3 class="text-center text-primary">修改招聘信息</h3>
				<hr />
				<form action="${webPath}/recruitmentInfo/postTheAD" method="post">
					<table
						class="table table-bordered table-striped table-hover table-responsive">
						<tr class="info">
							<th colspan="4">职位信息<input type="hidden" name="iId" value="${rinfo.iId}"></th>
						</tr>
						<tr>
							<td colspan="2">
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon7">工作职位</span>
									<input type="text" name="position" class="form-control" placeholder="Username"
										aria-describedby="sizing-addon7" value="${rinfo.position}">
								</div>
							</td>
							<td colspan="2">
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon8">公司名称</span>
									<input type="text" name="companyName" class="form-control" placeholder="Username"
										aria-describedby="sizing-addon8" value="${rinfo.companyName}">
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon9">公司性质</span>
									<input type="text" name="companyType" class="form-control" placeholder="Username"
										aria-describedby="sizing-addon9" value="${rinfo.companyType}">
								</div>
							</td>
							<td colspan="2">
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon10">运营方向</span>
									<input type="text" name="operationDirection" class="form-control" placeholder="Username"
										aria-describedby="sizing-addon10" value="${rinfo.operationDirection}">
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon9">工作薪资</span>
									<input type="text" name="salary" class="form-control" placeholder="Username"
										aria-describedby="sizing-addon9" value="${rinfo.salary}">
								</div>
							</td>
							<td colspan="2">
								<div class="input-group">
									<span class="input-group-addon" id="sizing-addon10">工作地点</span>
									<input type="text" name="workingPlace" class="form-control" placeholder="Username"
										aria-describedby="sizing-addon10" value="${rinfo.workingPlace}">
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="4" class="text-left"><label for="guanjianzi">职能类别</label>
								<input type="text" id="positionType" name="positionType" class="form-control"
								placeholder="Username" aria-describedby="sizing-addon9" value="${rinfo.positionType}">
							</td>
						</tr>
						<tr>
							<td colspan="4" class="text-left"><label for="guanjianzi">关键字</label>
								<input type="text" id="keyword" name="keyword" class="form-control"
								placeholder="Username" aria-describedby="sizing-addon9" value="${rinfo.keyword}">
							</td>
						</tr>
						<tr class="info">
							<th colspan="4">职位要求</th>
						</tr>
						<tr>
							<td class="text-left" colspan="4"><textarea
									name="jobRequirements" class="form-control" style="height: 100px;" >${rinfo.jobRequirements}</textarea></td>
						</tr>
						<tr class="info">
							<th colspan="4">联系方式</th>
						</tr>
						<tr>
							<td class="text-left" colspan="4"><textarea
									name="contactInfo" class="form-control" style="height: 100px;">${rinfo.contactInfo}</textarea></td>
						</tr>
						<tr class="info">
							<th colspan="4">公司信息</th>
						</tr>
						<tr>
							<td class="text-left" colspan="4"><textarea
									name="companyInfo" class="form-control" style="height: 200px;">${rinfo.companyInfo}</textarea></td>
						</tr>
					</table>
					<button class="btn btn-lg btn-primary btn-block" type="submit">修改招聘信息</button>
				</form>
			</div>
			<div class="col-lg-2 col-sm-1"></div>
		</div>
	</div>
</body>
</html>