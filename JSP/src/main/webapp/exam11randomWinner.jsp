<%@page import="java.util.Arrays"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String subject=request.getParameter("subject");
	String[] tt = request.getParameterValues("food");
	
	Random ran = new Random();
	int num = ran.nextInt(tt.length);
	String mo = tt[num];
	
	%>
	
	<div style="text-align:center">
	<h3>랜덤당첨 결과</h3>
	<p><%=subject %></p>
	<p><%=mo %></p>
	</div>
	
	<!-- out.print("<div style=\"text-align:center\">");
	out.print("랜덤당첨 결과");
	out.print("<h1>"+subject+"</h1>");
	out.print("<h2>" + mo + "</h2>");
	out.print("</div>");  -->
</body>
</html>