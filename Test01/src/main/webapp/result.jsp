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
	
	String name = request.getParameter("name");
	String[] food = request.getParameterValues("food");
	%>
	<h1>선호도 조사 결과</h1>
	<hr>
	<table border = "1">
		<tr>
			<td align="center">이름</td>
			<td align="center"><%=name %></td>
		</tr>
		<tr>
			<td>좋아하는 과일</td>
			<td>
			<%
			for(int i = 0; i<food.length; i++){
				out.print(food[i] + " ");
			}
			%>
			</td>
		</tr>
	</table>
	
</body>
</html>