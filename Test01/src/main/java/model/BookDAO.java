package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String sql;
	private int cnt;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void close() {
		try {
			if(rs != null) {rs.close();}
			if(psmt != null) {psmt.close();}
			if(conn != null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insert_member(BookDTO member) {
		connect();
		
		String sql = "insert into book_member values(?,?,?,?,?)";
		int cnt = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getNick());
			psmt.setString(4, member.getEmail());
			psmt.setString(5, member.getTel());
			
			cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;
	}
	
	public BookDTO login_member(String id, String pw) {

		connect();
		
		BookDTO member = null;
		sql = "select id, pw from book_member where id=? and pw=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String nick = rs.getString(1);
				member = new BookDTO(null, null, nick, null, null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return member;
	}
	
}
