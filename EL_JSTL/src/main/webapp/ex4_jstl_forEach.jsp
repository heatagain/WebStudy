<%@page import="java.util.ArrayList"%>
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
	<!-- 
		forEach 태그 : Java의 for문과 같은 기능 
		var : 변수명(생략)
		begin : 시작값
		end : 마지막값
		step : 증가값(생략 시 1씩 증가)
	-->
	<c:forEach var="i" begin="1" end="10">
		${i}
	</c:forEach>
	
	<!-- 
		forEach 태그 두번째 구조
		var: 변수명
		items: 배열 또는 리스트 값
	 -->
	<%
		int[] nums = {1,2,3};
		for(int num : nums){
			
		}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("라면");
		list.add("돈까스");
		list.add("쌀국수");
		list.add("크림뚝불");
		
		request.setAttribute("list", list);
	%>
	<br>
	<c:forEach var="food" items="${list}">
		${food}
	</c:forEach>
	
</body>
</html>