<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <h1><%=request.getParameter("nick") %>님! 환영합니다!</h1> --%>
	
	<!-- 세션에 저장된 닉네임을 출력해보기 -->
	<h1><%=session.getAttribute("nick") %>님! 환영합니다!</h1>
	
	
	<!-- 닉네임이 저장된 쿠키정보를 가져온 후 웹 페이지에서 출력하시오. -->
	<%--<h1>
	<%
	Cookie[] cookies = request.getCookies();
	
	if(cookies != null){
		for(int i = 0; i < cookies.length; i++){
			if(cookies[i].getName().contains("nick")){
				String value = URLDecoder.decode(cookies[i].getValue(),"UTF-8");
				out.print("<h1>"+ value +"님! 환영합니다!</h1>");
				break;
			}
		}
	}
	
	%>
	</h1> --%>
</body>
</html>