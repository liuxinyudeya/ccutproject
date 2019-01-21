<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
<title>Insert title here</title>
<script src="<%=baseurl%>/js/base.js"></script>
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/html/anwserview/anwserview.js"></script>
<link href="<%=baseurl%>/css/html/anwserview/style.css" rel="stylesheet">
<style>
body {
	background: url(images/bg_1.jpg);
	background-position: 0 0;
	overflow: auto;
	height: 100%;
}

.contents {
	width: 98% !important;
	height: auto;
	overflow: hidden;
	background: none;
	margin: 0 auto 0;
	padding: 0;
	box-shadow: 0px 5px 20px #dadada;
}

.right.huiyuan-right {
	width: 100%;
}

.right.huiyuan-right .xq_top {
	width: 100%;
}

.hy-pm {
	width: 100%;
	float: left;
	border: none;
	height: auto;
	overflow: hidden;
}

.wenti {
	width: 90%;
	height: auto;
	overflow: hidden;
	margin: 10px auto 15px;
	border-bottom: 1px solid #DDDDDD;
	padding: 2%;
	background: #f9f9f9;
	box-shadow: 0px 1px 4px #999;
}

.wenti p {
	font-size: 14px;
	line-height: 2;
	padding: 2% 10px;
}

.wenti ul li {
	width: 92%;
	float: left;
	margin: 0 5px;
	line-height: 2;
	border-top: 1px solid #c8c7cc;
	line-height: 45px;
	background: #f9f9f9;
}
</style>

</head>

<body huaban_collector_injected="true">
	<div class="wrap">
		<div class="contents">
			<div class="right huiyuan-right">
				<div class="xq_top">
					<span class="ml10">您现在的位置：<a href="#">调查问卷</a></span>
				</div>
				<form action="#" id="_form" method="get">
					<div class="hy-pm" id="hy-pm">
						<h1 class="neirong-h1">调查问卷</h1>


					</div>
				</form>
			</div>
		</div>
	</div>

</body>

</html>