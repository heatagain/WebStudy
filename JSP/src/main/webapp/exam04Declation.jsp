<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- ���� : �ʵ�{�������,��������)�� �޼ҵ带 ���鶧 ����� -->
	<%!
		public int myNumber1 = 100;
	
		public String hello(){
			return "�ȳ��ϼ���!!!~!";
		}
			
	%>
	
	<%
		int myNumber2 = 100;
		Random r = new Random();
	%>
	<%= hello() %>
	
</body>
</html>






