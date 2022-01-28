<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String[] hobby = request.getParameterValues("hobby");
	String hobbys = "";
	
	for (int i = 0; i<hobby.length; i++){
		hobbys += hobby[i] + " ";
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1"><!-- 3x5 구조 -->
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>이메일</td>
			<td>취미</td>
		</tr>
		<tr>
			<td><%=id %></td>
			<td><%=pw %></td>
			<td><%=name %></td>
			<td><%=email %></td>
			<td><%=hobbys %></td>
		</tr>
		<tr> <!-- EL문법으로 HTML에서 입력한 값을 출력 -->
			<!-- param객체 : Java 코드의 request.getParameter()
				 paramValues 객체 == request.getParameterValues()
			 -->
			<td>${param.id }</td>
			<td>${param.pw }</td>
			<td>${param.name }</td>
			<td>${param.email }</td>
			<td>${paramValues.hobby[0]} ${paramValues.hobby[1] }</td>
		</tr>
	</table>
</body>
</html>