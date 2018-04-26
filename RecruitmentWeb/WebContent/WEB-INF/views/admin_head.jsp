<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
			<h3 class="text-muted">后台管理系统</h3>
		</div>
		<div class="col-lg-8 text-right">
			<strong>欢迎您:<span class="text-primary">${admin.name}</span></strong>&nbsp;&nbsp;
			<a href="${webPath}/admin/logOffUser" class="btn btn-sm btn-danger" onclick="return confirm('确认注销当前用户?');">注销</a>
		</div>
	</div>
	<script type="text/javascript">
		function logout(){
			var con=confirm('确认注销当前用户?');
			if(con!=true){
				return;
			}
		}
		
	</script>
</body>
</html>