<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2px solid black">
		<%
		for (int i = 1; i <= 10; i++) {
		%>

		<td><%=i%></td>

		<%
		}
		%>
		<br>
		<br>
		<%
		String sum = "";
		for (int i = 1; i <= 10; i++) {
			String a = "<td>" + i + "</td>";
			sum += a;
		}
		%>
		<%=sum%>
		<br>
		<br>
		<% for(int i = 1; i <= 10; i++){
			out.print("<td>" + i + "</td>");
		}
		%>
	</table>

</body>
</html>