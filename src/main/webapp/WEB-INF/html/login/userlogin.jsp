<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/html/base/baseurl.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no">
<title>登录页</title>
<link href="<%=baseurl%>/css/mui.min.css" rel="stylesheet">
<script src="<%=baseurl%>/js/jquery.js"></script>
<script src="<%=baseurl%>/js/html/login/userlogin.js"></script>
<script src="<%=baseurl%>/js/base.js" type="text/javascript"></script>
</head>
<style>
html{
	/* font-size: 31.25px; */
}
* {
	margin: 0;
	padding: 0;
	list-style: none;
}

body {
	background-color: rgba(89, 176, 243, 0.75);
	background-size: 100%;
}

.container {
	width: 1200px;
	height: 870px;
	margin: 0 auto;
	/* 	background: #ccc; */
}
/* 导航 */
.nav {
	margin-top: 10px;
	height: 50px;
	line-height: 50px;
}

.nav ul li {
	float: right;
	font-size: 15px;
}

.nav ul li a {
	text-decoration: none;
	color: #152b3c;
	padding: 15px 30px;
}

.nav ul li a:hover {
	border: 1px solid white;
	border-radius: 5%;
	color: white;
}
/* 主题内容 */
.main {
	width: 1200px;
	height: 450px;
}

.sideleft {
	width: 460px;
	height: 250px;
	float: left;
	padding: 85px 130px
}

.sideleft p {
	padding: 8px 0;
	font-size: 16px;
}

.sideright {
	width: 480px;
	height: 450px;
	float: right;
	margin-right: 25%;
	margin-top: 10%;
}

.sideright .index {
	width: 330px;
	height: 350px;
	background-color: rgba(255, 255, 255, 0.75);
	margin: 50px 220px;
}

.headline {
	font-size: 22px;
	text-align: center;
	padding: 20px;
}

input[type="text"], input[type="button"] {
	-web-kit-appearance: none;
	-moz-appearance: none;
	display: block;
	margin: 0 auto;
	font-size: 15px;
	width: 240px;
}

input[type="text"] {
	height: 35px;
	border-radius: 3px;
	border: 1px solid #c8cccf;
	color: #6a6f77;
	outline: 0;
}

input[type="button"] {
	margin-top: 25px;
	height: 35px;
	background: #357eb8;
	color: #bcedff;
	font-weight: bold;
	font-size: 16px;
}

input[type="button"]:hover {
	background: #0e62a3;
	cursor: pointer;
}

.astyle {
	margin: 5px 0 5px 42px;
	font-size: 17px;
	color: #6a6f77;
}

.bstyle {
	display: block;
	float: left;
	margin-left: 46px;
	font-size: 15px;
}

.cstyle {
	display: block;
	float: right;
	margin-right: 46px;
	font-size: 15px;
}

.cstyle a {
	text-decoration: none;
}

.footer {
	width: 1000px;
	margin: 60px auto;
}

.footer ul {
	margin-left: 100px;
}

.footer ul li {
	float: left;
}

.footer ul li a {
	text-decoration: none;
	color: black;
	border-left: 2px solid black;
	padding: 0 10px;
}
</style>
<body>
	<div class="sideright">
		<div class="index">
			<form action="#" method="get">
				<p class="headline">欢迎登陆</p>
				<p class="astyle">
					用户名：<span id="validate_username"></span>
				</p>
				<input type="text" placeholder="请输入您的姓名" id="name">
				<p class="astyle">
					手机号：<span id="validate_phone">
				</p>
				</span> <input type="text" placeholder="请输入您的手机号" id="phone"> <input
					id='login' type="button" value="登陆" name="login"> </br>
			</form>

		</div>
	</div> 
<!-- 
<div>
   <form class="mui-input-group">
	<div class="mui-input-row">
		<label> 姓  名 :</label>
		<input type="text" placeholder="请输入您的姓名" id="name">
	</div>
	<div class="mui-input-row">
		<label>手机号 :</label>
		<input type="text" class="mui-input-clear" placeholder="请输入您的手机号" id="phone" data-input-clear="10"><span class="mui-icon mui-icon-clear mui-hidden"></span>
	</div>

	<div class="mui-button-row">
		<button class="mui-btn mui-btn-primary" type="button" onclick="return false;">确认</button>
	</div>
</form>

</div>
-->
</body>

</html>