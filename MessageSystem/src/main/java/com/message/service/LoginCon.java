package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.MemberDAO;
import com.message.model.MemberDTO;

public class LoginCon implements iCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// �̸���, �н����带 �������ÿ�.
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO member = dao.memberLogin(email, pw);
		
		if(member != null) {
			System.out.println("�α��� ����!");
			
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			session.getAttribute(pw);
			response.sendRedirect("main.jsp");
		}
		
		else {
			// �α��� ����
			//*joinCon else�� ����
			response.setContentType("text/html; charset=utf-8");
	         PrintWriter out = response.getWriter();
	         out.print("<script>");
	         out.print("alert('�α��� ����..!');");
	         out.print("location.href='main.jsp';");
	         out.print("</script>");
			
		}
		
	}

}
