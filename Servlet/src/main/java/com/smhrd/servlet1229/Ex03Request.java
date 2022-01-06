package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Request")
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String ip = request.getRemoteAddr();
		
		out.print("<html>");
		out.print("<head><title>Request&Resopnse 실습</title><head>");
		out.print("<body>");
		if(ip.equals("221.63.240.114")) {
			out.println("<h1>러블리 건하 ㅎㅇ</h1>");
		}
		else if(ip.equals("211.48.228.42")) {
			out.println("<h1>황마 팀장 ㅎㅇ</h1>");
		}
		else if(ip.equals("211.48.228.61")) {
			out.println("<h1>현도 ㅎㅇ</h1>");
		}
		else if(ip.equals("121.147.52.21")) {
			out.println("<h1>승훈이 ㅎㅇ</h1>");
		}
		else if(ip.equals("59.0.236.207")) {
			out.println("<h1>선생님 어서오세요</h1>");
		}
		else {
			out.println("<h1>어서오세요</h1>");
		}
		out.print("</body></html>");
		
	}

}
