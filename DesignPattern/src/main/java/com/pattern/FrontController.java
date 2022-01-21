package com.pattern;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// FrontController 패턴
		// : 사용자의 모든 요청을 한 곳으로 전송할 수 있게 하는 구조
		// : URLMapping에 경로를 "*.do" 설정
		// : 페이지에서는 모든 요청에 .do를 붙어야 하나의 서블릿으로 오게 됨
		// 단점
		// : 한 곳에 중앙집중화 되면서 로직이 길어지고 하나의 기능이 문제가 생기면
		//	 모든 기능을 사용할 수 없게 된다는 문제점이 발생! -> 일반 클래스파일로 기능들을 분리
		
		// 일반 클래스 vs 서블릿
		// : HttpServlet을 상속받았는지에 대한 차이
		// : 지속적으로 서버의 메모리를 사용하는 것에 대한 차이
		
		// 인터페이스를 활용해서 일반클래스 구현
		// : 이후에 만들어질 서비스에 대해서 동일한 메소드로 구현을 강제!
		
		// Command 패턴
		// : 사용자의 요청에 따라 처리할 수 있는 일반 클래스들의 공통된 메소드로 구현될 수 있도록 하는 구조
		// : execute(HttpServletRequest, HttpServletResponse) 추상 메소드 구현
		// : 일반 클래스에 implements 키워드를 이용해서 인터페이스를 구현
		
		
		// reqURI : /DesignPattern/insert.do
		// contextPath : /DesignPattern
		// command : /insert.do
//		String reqURI = request.getRequestURI();
//		String contextPath = request.getContextPath();
//		String command = reqURI.substring(contextPath.length());
		
		// 파일경로(서블릿 맵핑된 경로)값 반환
		String command = request.getServletPath();
		
		System.out.println("요청 식별값 >> " + command);
		
		if(command.equals("/insert.do")) {
			// 데이터 추가
		} else if (command.equals("/update.do")) {
			// 데이터 수정
		} else if (command.equals("/delete.do")) {
			// 데이터 삭제
		} else if (command.equals("/select.do")) {
			// 데이터 조회
		}
		
	}

}
