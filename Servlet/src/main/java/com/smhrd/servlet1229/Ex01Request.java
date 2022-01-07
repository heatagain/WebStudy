package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping: ���ڿ��� Servlet ������ �����ϴ� ���
// Servlet ������ �̸��� �������� �ʾƵ� ���� ����!
// ���ǻ��� : '/' �� �ݵ�� �տ� �ۼ��Ǿ� �־�� ��! �ۼ����� ���� ��� HTTP404�����߻�!
@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//request(��û��ü) : ����ڰ� ��û�� ���� �� ������� ������ �����ϴ� ��ü
		// ���� : IP, ����������(����, ���, ���ڵ� ��� ���..), ����ڰ� �Է��� ������ ��..
		
		String ip = request.getRemoteAddr();
		
		System.out.println("������ IP : " + ip);
		
		// IP�� Ȯ���Ͽ� �ٸ� ��¹��� �������� �����Ͻÿ�!~
		// ���� �Ǵ� ¦�� ���� �� : OO�� ȯ���մϴ�!
		// ���� ���� �� : ����� ȯ���մϴ�!
		// �̿� ���� �� : �մ� ȯ���մϴ�!
		// *IPȮ���� ���ڿ� �� �޼ҵ� Ȱ���� ��!
		
			if(ip.equals("221.63.240.114")) {
				System.out.println("���� ����");
			}
			else if(ip.equals("211.48.228.42")) {
				System.out.println("Ȳ�� ����");
			}
			else if(ip.equals("211.48.228.61")) {
				System.out.println("����");
			}
			else if(ip.equals("121.147.52.21")) {
				System.out.println("����");
			}
			else if(ip.equals("59.0.236.207")) {
				System.out.println("������ �������");
			}
			else {
				System.out.println("����ÿ�");
			}
			
	}

}
