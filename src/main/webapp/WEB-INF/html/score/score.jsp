<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>

<html xmlns="http://www.w3.org/1999/xhtml" class="hb-loaded">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
<!-- 	<link href="css/style.css" type="text/css" rel="stylesheet"> -->
<link href="<%=baseurl%>/css/style.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script type="text/javascript" src="<%=baseurl %>/js/html/score/score.js"></script>

<title>吉林省证券业协会</title>
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
}

.wenti p {
	font-size: 14px;
	line-height: 2;
	padding: 2% 10px;
}

.wenti ul li {
	width: 100%;
	float: left;
	margin: 0 5px;
	line-height: 2;
	border-top: 1px solid #c8c7cc;
	line-height: 45px;
	background: rgba(255, 255, 255, .7);
}
</style>
</head>

<body class="login1">
	<div class="wrap">
		<div class="contents">
			<div class="right huiyuan-right">
				<div class="xq_top">
					<span class="ml10">您现在的位置：<a href="#">调查问卷</a></span>
				</div>
				<div class="cj_a">
					<div class="time" >时间：<text id="time"></text></div>
					<div class="score" >分数：<text id="score">分</text></div>
					<div class="name">答题人：<text  id="name"></text></div>
				</div>
				<div class="cj_b">
					<div class="cj_b_a"></div>
					<a href="#" class="zuoweixz_a tui">确定</a>
				</div>
			</div>
		</div>
</body>
</html>