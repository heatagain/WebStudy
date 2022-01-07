<%@page import="java.util.ArrayList"%>
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
	request.getParameter("room");

	String floor = request.getParameter("floor");
	String room = request.getParameter("room");

	int a = Integer.parseInt(floor);
	int b = Integer.parseInt(room);

	int[][] tt = new int[a][b];
	out.print("<table border=\"1px solid black\">");
	for (int i = 0; i < tt.length; i++) {
		int value = 0;
		out.print("<tr>");
		for (int j = 0; j < tt[i].length; j++) {
			tt[i][j] = value;
			out.print("<td width=\"30px\" height=\"30px\" align=\"center\">"
			+ tt[i][j] + "</td>");
			value++;
		}
		out.print("</tr>");
	}
	out.print("</table>");
	out.print("<br>");
	out.print("<br>");
	
	out.print("<table border=\"1px solid black\">");
	for (int i = 1; i <= a; i++) {
		int value = 0;
		out.print("<tr>");
		for (int j = 1; j <= b; j++) {
			out.print("<td width=\"30px\" height=\"30px\" align=\"center\">"
			+ value + "</td>");
			value++;
		}
		out.print("</tr>");
	}
	out.print("</table>");
	
	%>
	
	

</body>
</html>