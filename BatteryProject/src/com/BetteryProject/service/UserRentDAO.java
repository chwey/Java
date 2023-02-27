package com.BetteryProject.service;

import java.util.ArrayList;
import java.util.List;

import com.BetteryProject.common.DAO;

public class UserRentDAO extends DAO{
	
	private static UserRentDAO userrentDao = null;
	
	private UserRentDAO() {
		
	}
	
	public static UserRentDAO getInstance() {
		if(userrentDao == null) {
			userrentDao = new UserRentDAO();
		}
		return userrentDao;
	}
	
	//사용자 대여
	//배터리 리스트
	public List<UserRent>getUserRentList(){
		List<UserRent>list = new ArrayList<>();
		UserRent rent = null;
		
		try {
			conn();
			String sql = "select  b_power, b_point\r\n"
					+ "from bettery;\r\n";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				rent = new UserRent();
				rent.setbNum(rs.getInt("b_num"));
				rent.setbRent(rs.getBoolean("b_rent"));
				rent.setuId(rs.getString("u_id"));
				rent.setrDate(rs.getDate("r_date"));
				rent.setrPoiont(rs.getString("r_point"));
				rent.setbDate(rs.getDate("b_date"));
				rent.setbPoint(rs.getString("b_point"));
				list.add(rent);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
		
	}
	

	//지점별 대여가능 목록
	public List<Bettery> BorrowList(String point) {
		List<Bettery> list = new ArrayList();
		Bettery rent = new Bettery();
		try {
			conn();
			String sql = "select *\n"
					+ "from bettery\n"
					+ "where b_point = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, point);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rent = new Bettery();
				rent.setbNum(rs.getInt("b_num"));
				rent.setbType(rs.getString("b_type"));
				rent.setbPower(rs.getString("b_power"));
				rent.setbPoint(rs.getString("b_point"));
				rent.setbRent(rs.getString("b_rent"));
				list.add(rent);
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}

	//insert 대여
	public int insertBorrow(UserRent urs) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into usrrent(b_num, u_id, r_date, r_point) "
					+ "values ( ?,?,sysdate,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, urs.getbNum());
			pstmt.setString(2, urs.getuId());
			pstmt.setString(3, urs.getrPoiont());
			
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//modify 대여
	public int modifyBorrow(int bett) {
		int result = 0;
		
		try {
			conn();
			String sql = "update bettery set b_rent = 'N' where b_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bett);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}

	//insert 반납
	public int insertReturn(UserRent urs) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into usrrent (b_num, u_id, r_point, b_date, b_point) "
					+ "values ( ?, ?, ?, sysdate, ?);";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, urs.getbNum());
			pstmt.setString(2, urs.getuId());
			pstmt.setString(3, urs.getrPoiont());
			pstmt.setString(4, urs.getbPoint());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();		
		}finally {
			disconn();
		}
		return result;
	}
	
	//modify 반납
	public int modifyReturn(Bettery bett) {
		int result = 0;
		
		try {
			conn();
			String sql = "update bettery set b_rent = 'Y', b_power = ? "
					+ "where b_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bett.getbPower());
			pstmt.setInt(2, bett.getbNum());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}

	
}
	
	
	
	
	
	
	
	
	
	

