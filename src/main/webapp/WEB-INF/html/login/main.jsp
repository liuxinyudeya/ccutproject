<%@page import="com.ccunix.icar.base.controller.BaseMultiController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
	Object object = session.getAttribute(BaseMultiController.LOGIN_SESSION_STR);
	if(object == null){
		out.println("<script>");
		out.println("alert('登录时间过长，重新登录');");
		out.println("</script>");
		request.getRequestDispatcher("/html/login.jsp").forward(request, response);
	}
	%>	
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>东学上门洗车</title>
</head>
<frameset rows="10%,*">
	<frame src="../html/admin/main/top.jsp" noresize="noresize"
		frameborder="0">

	<frameset cols="10%,*">
		<frame src="../html/admin/main/left.jsp" noresize="noresize"
			frameborder="0">
		<frame src="../html/admin/main/center.html" noresize="noresize"
			frameborder="0" name="center">
	</frameset>
</frameset>
</html>