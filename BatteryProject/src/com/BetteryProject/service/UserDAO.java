package com.BetteryProject.service;

import com.BetteryProject.common.DAO;

public class UserDAO extends DAO{
	
	private static UserDAO uDao = new UserDAO();
	
	private UserDAO() {
		
	}
	
	public static UserDAO getInstance() {
		return uDao;
	}
	
	//로그인
	public User login(String id) {
		User use = null;
		
		try {
			conn();
			String sql = "select *\r\n"
					+ " from users\r\n"
					+ " where u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				use = new User();
				use.setuId(rs.getString("u_id"));
				use.setuPw(rs.getString("u_pw"));
				use.setuName(rs.getString("u_name"));
				use.setuPhoneNumber(rs.getString("u_phonenumber"));
				use.setuPoint(rs.getString("u_point"));
				use.setuMail(rs.getString("u_mail"));
				use.setuGrade(rs.getString("u_grade"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return use;
	}
	
	//가입
	public int insertUser(User use) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into users (u_id, u_pw, u_name, u_phonenumber, u_mail)"
					+ " values(?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, use.getuId());
			pstmt.setString(2, use.getuPw());
			pstmt.setString(3, use.getuName());
			pstmt.setString(4, use.getuPhoneNumber());
			pstmt.setString(5, use.getuMail());		
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
		}
		return result;
			
	}
	//pw수정
	public int modifypw(User use) {
		int result = 0;
		
		try {
			conn();
			String sql = "update users\r\n"
					+ " set u_pw = ?\r\n"
					+ " where u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, use.getuPw());
			pstmt.setString(2, use.getuId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	//전화번호 수정
	public int modifypn(User use) {
		int result = 0;
		
		try {
			conn();
			String sql = "update users\r\n"
					+ " set u_phonenumber = ?\r\n"
					+ " where u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, use.getuPhoneNumber());
			pstmt.setString(2, use.getuId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	//메일수정
	public int modifymail(User use) {
		int result = 0;
		
		try {
			conn();
			String sql = "update users\r\n"
					+ " set u_mail = ?\r\n"
					+ " where u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, use.getuMail());
			pstmt.setString(2, use.getuId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//삭제
	public int deleteUser(User u) {
		int result = 0;
		
		try {
			conn();
			String sql = "delete from users where u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getuId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
	
	
	
}
