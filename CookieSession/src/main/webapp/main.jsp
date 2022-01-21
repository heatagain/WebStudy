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
		String id = (String)session.getAttribute("id");
		Integer pw = (Integer)session.getAttribute("pw");
		String nick = (String)session.getAttribute("nick");
		
		if(id != null){
			out.print("<h1>로그인페이지</h1>");
			out.print("<div align = 'center'>");
			out.print("<h1>"+nick +"님</h1><br>");
			out.print("로그인중입니다.");
			out.print("<br>");
			out.print("<a href = 'board.jsp'>게시판</a><br>");
			out.print("<a href = 'logout.jsp'>로그아웃하기</a>");
			out.print("</div>");
		}
		else{%>
		<div align="center">
		<h1>로그인</h1>
		<form action="LoginService" method="post">
		<input type="text" name="id" placeholder="ID를 입력해주세요."><br>
		<input type="password" name="pw" placeholder="PW를 입력해주세요."><br>
		<input type="submit" value="로그인">
		</form>
		</div>
		
		<%}
	
	
	%>		
		
<!-- 		<form>
			<table align = "center">
				<tr>
					<td>
					<input type="text" name="id" placeholder="ID를 입력해주세요.">
					</td>
				</tr>
				<tr>
					<td>
					<input type="password" name="pw" placeholder="PW를 입력해주세요.">
					</td>
				</tr>
				<tr>
					<td>
					<input type="submit" value="로그인">
					</td>
				</tr>
			</table>
		</form> -->

</body>
</html>