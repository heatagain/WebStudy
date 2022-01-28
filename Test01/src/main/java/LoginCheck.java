

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String m_id = "smart";
		String m_pw = "1234";
		
		if(m_id.equals(id) && m_pw.equals(pw)) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("main.jsp");
		}
		
		else {

			response.sendRedirect("loginForm.html");
		}

	}

}
