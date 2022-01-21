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
		
		// FrontController ����
		// : ������� ��� ��û�� �� ������ ������ �� �ְ� �ϴ� ����
		// : URLMapping�� ��θ� "*.do" ����
		// : ������������ ��� ��û�� .do�� �پ�� �ϳ��� �������� ���� ��
		// ����
		// : �� ���� �߾�����ȭ �Ǹ鼭 ������ ������� �ϳ��� ����� ������ �����
		//	 ��� ����� ����� �� ���� �ȴٴ� �������� �߻�! -> �Ϲ� Ŭ�������Ϸ� ��ɵ��� �и�
		
		// �Ϲ� Ŭ���� vs ����
		// : HttpServlet�� ��ӹ޾Ҵ����� ���� ����
		// : ���������� ������ �޸𸮸� ����ϴ� �Ϳ� ���� ����
		
		// �������̽��� Ȱ���ؼ� �Ϲ�Ŭ���� ����
		// : ���Ŀ� ������� ���񽺿� ���ؼ� ������ �޼ҵ�� ������ ����!
		
		// Command ����
		// : ������� ��û�� ���� ó���� �� �ִ� �Ϲ� Ŭ�������� ����� �޼ҵ�� ������ �� �ֵ��� �ϴ� ����
		// : execute(HttpServletRequest, HttpServletResponse) �߻� �޼ҵ� ����
		// : �Ϲ� Ŭ������ implements Ű���带 �̿��ؼ� �������̽��� ����
		
		
		// reqURI : /DesignPattern/insert.do
		// contextPath : /DesignPattern
		// command : /insert.do
//		String reqURI = request.getRequestURI();
//		String contextPath = request.getContextPath();
//		String command = reqURI.substring(contextPath.length());
		
		// ���ϰ��(���� ���ε� ���)�� ��ȯ
		String command = request.getServletPath();
		
		System.out.println("��û �ĺ��� >> " + command);
		
		if(command.equals("/insert.do")) {
			// ������ �߰�
		} else if (command.equals("/update.do")) {
			// ������ ����
		} else if (command.equals("/delete.do")) {
			// ������ ����
		} else if (command.equals("/select.do")) {
			// ������ ��ȸ
		}
		
	}

}
