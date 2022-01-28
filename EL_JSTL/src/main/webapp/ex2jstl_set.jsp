<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL 다루기</h1>
	<c:set var="req" value="getReq" scope="request"/>
	<c:set var="sess" value="getSession" scope="session"/>
	<c:set var="app" value="getApplication" scope="application"/>

	${req} ${sess } ${app } <br>
	${requestScope.req } ${sessionScope.sess } ${applicationScope.app }
	
	<!-- scope를 설정하면 특정 서버영역에 데이터를 삭제 -->
	<c:remove var="req" scope="request"/> <br>
	request영역에 저장된 데이터 : ${req } ${requestScope.req }
</body>
</html>