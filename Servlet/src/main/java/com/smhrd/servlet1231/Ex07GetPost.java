package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPost")
public class Ex07GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// "POST"����� �� �ѱ۱��� ����
		// �����͸� request��ü�κ��� �������� ���� ����!!!
		req.setCharacterEncoding("UTF-8");
		
		System.out.println("��û�� ����...");
		
		// ����ڰ� �Է��� ID�� PW�� ������ ������ �� �ܼ�â�� ����غ���!
		//resp.setContentType("text/html; charset=utf-8");
		//PrintWriter out = resp.getWriter();
		
		String ID = req.getParameter("user-id");
		String PW = req.getParameter("user-pw");
		
		System.out.println("������� ID�� "+ID);
		System.out.println("������� PW�� "+PW);

	}
	
//	//Get����� �� ȣ��
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Get������� ����...!");
//		
//	}
//	//Post����� �� ȣ��
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Post������� ����...!");
//		
//	}

}