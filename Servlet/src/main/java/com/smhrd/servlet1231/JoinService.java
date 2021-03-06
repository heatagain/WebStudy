package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String birthday = request.getParameter("date");
		String color = request.getParameter("color");
		String country = request.getParameter("country");
		String talk = request.getParameter("talk");
		
		out.println("사용자의 ID는 "+id);
		out.print("<p>");
		out.println("사용자의 PW는 "+pw);
		out.println("NAME: "+name);
		out.println("EAMIL: "+email);
		out.println("TEL: "+tel);
		out.println("GENDER: "+gender);
		out.println("HOBBY: "+Arrays.toString(hobby));
		out.println("BRITHDAY: "+birthday);
		out.println("COLOR: "+color);
		out.println("COUNTRY: "+country);
		out.println("TALK: "+talk);
		
		
		
	}

}
