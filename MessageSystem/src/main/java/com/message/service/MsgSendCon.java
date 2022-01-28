package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.model.MessageDAO;
import com.message.model.MessageDTO;

@WebServlet("/MsgSendCon")
public class MsgSendCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 보낸사람, 반는 이메일, 내용을 가져오시오.
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		MessageDAO dao = new MessageDAO();
		
		int cnt = dao.sendMessage(new MessageDTO(0, name, email, message, null));
		
		if(cnt > 0) {
			response.sendRedirect("main_jstl.jsp");
		}else {
			response.setContentType("text/html; charset=utf-8");
	        PrintWriter out = response.getWriter();
	        out.print("<script>");
	        out.print("alert('메세지 전송 실패..!');");
	        out.print("location.href='main_jstl.jsp';");
	        out.print("</script>");
		}
		
	}

}
