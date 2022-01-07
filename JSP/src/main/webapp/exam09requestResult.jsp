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
	String java = request.getParameter("java");
	String web = request.getParameter("web");
	String iot = request.getParameter("iot");
	String android = request.getParameter("android");
	response.setContentType("text/html; charset=utf-8");
	int java1 = Integer.parseInt(java);
	int web1 = Integer.parseInt(web);
	int iot1 = Integer.parseInt(iot);
	int android1 = Integer.parseInt(android);

	double mean = (java1 + web1 + iot1 + android1) / 4.0;
	String grade = "";
	if (mean > 100) {
		grade = "다시 입력해주세요";
	} else if (mean >= 95) {
		grade = "A+";
	} else if (mean >= 85) {
		grade = "A";
	} else if (mean >= 80) {
		grade = "B+";
	} else if (mean >= 70) {
		grade = "C";
	} else {
		grade = "F";
	}
	out.print("<table><tr><td>이름</td><td>" + name + "</td></tr>");
	out.print("<tr><td>JAVA점수</td><td>" + java1 + "</td></tr>");
	out.print("<tr><td>WEB점수</td><td>" + web1 + "</td></tr>");
	out.print("<tr><td>IOT점수</td><td>" + iot1 + "</td></tr>");
	out.print("<tr><td>ANDROID점수</td><td>" + android1 + "</td></tr>");
	out.print("<tr><td>평균</td><td>" + mean + "</td></tr>");
	out.print("<tr><td>학점</td><td><h2>" + grade + "</h2></td></tr>");
	out.print("</table>");
	%>

	<table>
		<tr>
			<td>이름</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td>JAVA점수</td>
			<td><%=java1%></td>
		</tr>
		<tr>
			<td>WEB점수</td>
			<td><%=web1%></td>
		</tr>
		<tr>
			<td>IOT점수</td>
			<td><%=iot1%></td>
		</tr>
		<tr>
			<td>ANDROID점수</td>
			<td><%=android1%></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%=mean%></td>
		</tr>
		<tr>
			<td>학점</td>
			<td><h3><%=grade%></h3></td>
		</tr>
	</table>
</body>
</html>