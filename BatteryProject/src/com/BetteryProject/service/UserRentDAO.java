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
	

	//대여
	public int borrow(UserRent urs) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into usrrent(b_num, u_id, r_date, r_point)"
					+ " values (?, ?,(to_date(?, ?)), ?";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, urs.getbNum());
			pstmt.setString(2, urs.getuId());
			pstmt.setDate(3, urs.getrDate());
			pstmt.setString(4, urs.getrPoiont());
			
			result = pstmt.executeUpdate();
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
}
	
	
	
	
	
	
	
	
	
	

