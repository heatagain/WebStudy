package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping: 문자열로 Servlet 파일을 연결하는 기술
// Servlet 파일의 이름과 동일하지 않아도 연결 가능!
// 주의사항 : '/' 가 반드시 앞에 작성되어 있어야 함! 작성하지 않을 경우 HTTP404오류발생!
@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//request(요청객체) : 사용자가 요청을 했을 때 사용자의 정보를 저장하는 객체
		// 정보 : IP, 브라우저정보(버전, 언어, 인코딩 방식 등등..), 사용자가 입력한 정보들 등..
		
		String ip = request.getRemoteAddr();
		
		System.out.println("접속한 IP : " + ip);
		
		// IP를 확인하여 다른 출력문이 나오도록 구현하시오!~
		// 팀원 또는 짝꿍 접속 시 : OO님 환영합니다!
		// 강사 접속 시 : 강사님 환영합니다!
		// 이외 접속 시 : 손님 환영합니다!
		// *IP확인은 문자열 비교 메소드 활용할 것!
		
			if(ip.equals("221.63.240.114")) {
				System.out.println("러블리 건하");
			}
			else if(ip.equals("211.48.228.42")) {
				System.out.println("황마 팀장");
			}
			else if(ip.equals("211.48.228.61")) {
				System.out.println("현도");
			}
			else if(ip.equals("121.147.52.21")) {
				System.out.println("승훈");
			}
			else if(ip.equals("59.0.236.207")) {
				System.out.println("선생님 어서오세요");
			}
			else {
				System.out.println("어서오시오");
			}
			
	}

}
