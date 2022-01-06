package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NumberPlus")
public class Ex04NumberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// �� ���ڸ� ������ ����
		String data = request.getParameter("data");
		String data2 = request.getParameter("data2");
		if(data ==""|| data2=="" ) {
			
		}
		else
		try {
		// ���ڿ� -> ���� ��ȯ : Integer.parseInt()
		int num1 = Integer.parseInt(data);
		int num2 = Integer.parseInt(data2);
//		int num1 = Integer.parseInt(request.getParameter("data"));
		int sum = num1 + num2;
		
		System.out.println(num1 + "+" + num2 + "=" + sum);

		out.print("<html><head><title>������</title></head>");
		out.print("<body>");
		out.print("<h1>�� ���� ���ϱ� ������</h1>");
		out.print("<h2>"+num1+"+"+num2+"="+sum);
		out.print("</body></html>");
		}
		catch (NumberFormatException e) {
			out.print("<html><head><title>������</title></head>");
			out.print("<body>�ٽ��Է�</body><html>");
		}
		
	}

}
