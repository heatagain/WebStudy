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
	
	int num2 = Integer.parseInt(request.getParameter("num"));
	
	
	out.print("<div style=\"text-align:center\">");
	out.print("랜덤당첨 작성");
	out.print("<form action=\"exam11randomWinner.jsp\" method=\"post\">");
	out.print("<tr><td>주제: </td></tr>");
	out.print("<input type=\"text\" name=\"subject\"><br>");
	for(int i = 1; i <= num2; i++){
		out.print("<tr><td>아이템"+i+" : </td></tr>");
		out.print("<input type=\"text\" name=\"food\"><br>");
	}
	out.print("<input type=\"submit\" value=\"시작\">");
	out.print("</form></div>");
	%>
	<%-- <div style="text-align:center">	
		랜덤당첨 작성
		<form action="exam11randomWinner.jsp" method="post">
			<tr>
				<td>아이템<%=i %> : </td>
			</tr>
			<input type="text" name="food" value="item1"><br>
			<input type="submit" value="시작">
		</form>
	</div> --%>
</body>
</html>