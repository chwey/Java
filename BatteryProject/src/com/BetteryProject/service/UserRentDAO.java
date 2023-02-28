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
				rent.setrDate(rs.getString("r_date"));
				rent.setrPoiont(rs.getString("r_point"));
				rent.setbDate(rs.getString("b_date"));
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
					+ " values ( ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, urs.getbNum());
			pstmt.setString(2, urs.getuId());
			pstmt.setString(3, urs.getrDate());	
			pstmt.setString(4, urs.getrPoiont());
			
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
			String sql = "update usrrent set b_date = ?, b_point = ?"
					+ " where b_num = ? and u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, urs.getbDate());
			pstmt.setString(2, urs.getbPoint());
			pstmt.setInt(3, urs.getbNum());
			pstmt.setString(4, urs.getuId());
			
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
			String sql = "update bettery set b_power = ?, b_point = ?, b_rent = 'Y' "
					+ "where b_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bett.getbPower());
			pstmt.setString(2, bett.getbPoint());
			pstmt.setInt(3, bett.getbNum());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//배터리상세조회
	public UserRent getUserlist(int userlist) {
		UserRent usrt = null;
		
		try {
			conn();
			String sql = "select *\r\n"
					+ "from usrrent\r\n"
					+ "where b_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userlist);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				usrt = new UserRent();
				usrt.setbNum(rs.getInt("b_num"));
				usrt.setuId(rs.getString("u_id"));
				usrt.setrDate(rs.getString("r_date"));
				usrt.setrPoiont(rs.getString("r_point"));
				usrt.setbDate(rs.getString("b_date"));
				usrt.setbPoint(rs.getString("b_point"));

			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return usrt;
	}
	
	//HISTORY
	public UserRent getUserlastlist(String lastlist) {
		UserRent usrt = null;
		
		try {
			conn();
			String sql = "select *\n"
					+ "from usrrent\n"
					+ "where u_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lastlist);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				usrt = new UserRent();
				usrt.setbNum(rs.getInt("b_num"));
				usrt.setuId(rs.getString("u_id"));
				usrt.setrDate(rs.getString("r_date"));
				usrt.setrPoiont(rs.getString("r_point"));
				usrt.setbDate(rs.getString("b_date"));
				usrt.setbPoint(rs.getString("b_point"));

			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return usrt;
	}

	
}
	
	
	
	
	
	
	
	
	
	

