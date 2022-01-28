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
	${param.num1 } ${param.num2 } ${param.num1 + param.num2 }
	<%-- <c:if test="조건식"></c:if> : Java의 if문과 같은 기능 --%>
<%-- 	<c:choose>, <c:when>, <c:otherwise>: Java의 if, else if, else문과 같은 기능 --%>
	
	<c:set var="sum" value="${param.num1+param.num2}"/>
	<c:if test="${sum%2 == 0 }">
		<h2>${sum }는 짝수입니다.</h2>
	</c:if>
	
	<c:if test="${sum%2 == 1 }">
		<h2>${sum }는 홀수입니다.</h2>
	</c:if>

	<!-- 
	when태그 : if, else if
	otherwise태그 : else
	 -->
	<c:choose>
		<c:when test="${sum%2 == 0 }">
			<h2>${sum }는 짝수입니다.</h2>
		</c:when>
		<c:otherwise>
			<h2>${sum }는 홀수입니다.</h2>
		</c:otherwise>
	</c:choose>


</body>
</html>