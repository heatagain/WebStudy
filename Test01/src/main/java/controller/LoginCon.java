package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BookDAO;
import model.BookDTO;


@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		BookDAO dao = new BookDAO();
		BookDTO member = dao.login_member(id, pw);
		
		if(member != null) {
			HttpSession session = request.getSession();
			session.setAttribute("nick", member.getNick());
			response.sendRedirect("Question4_Main.jsp");
		}
		
//		else {
//			response.setContentType("text/html; charset=utf-8");
//	         PrintWriter out = response.getWriter();
//	         out.print("<script>");
//	         out.print("alert('�α��� ����..!');");
//	         out.print("location.href='Question4_Login.jsp';");
//	         out.print("</script>");
//			
//		}
		
	}

}
