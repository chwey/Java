package com.BetteryProject.service;

import java.util.ArrayList;
import java.util.List;

import com.BetteryProject.common.DAO;

public class BetteryDAO extends DAO{
	
	private static BetteryDAO bettDao = null;
	
	private BetteryDAO() {
		
	}
	
	public static BetteryDAO getInstance() {
		if(bettDao == null) {
			bettDao = new BetteryDAO();
		}
		return bettDao;
	}
	
	//기계정보등록
	public int insertBett(Bettery bett) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into bettery (b_num, b_type, b_point)"
					+ " values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bett.getbNum());
			pstmt.setString(2, bett.getbType());
			pstmt.setString(3, bett.getbPoint());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//기계정보수정
	public int modifyBett(Bettery b) {
		int result = 0;
		
		try {
			conn();
			String sql = "update bettery set b_point = ?\r\n"
					+ " where b_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getbPoint());
			pstmt.setInt(2, b.getbNum());
			
			result = pstmt.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//조회
	//전체조회
	public List<Bettery>getBetteryList(String u){
		List<Bettery>list = new ArrayList<>();
		Bettery bett = null;
		
		try {
			System.out.println(u);
			conn();
			String sql ="select *\r\n"
					+ "from bettery\r\n"
					+ "where b_point = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				bett = new Bettery();
				bett.setbNum(rs.getInt("b_num"));
				bett.setbType(rs.getString("b_type"));
				bett.setbPower(rs.getString("b_power"));
				bett.setbPoint(rs.getString("b_point"));
				bett.setbRent(rs.getString("b_rent"));
				list.add(bett);		
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//완전전체조회
	public List<Bettery>getBetteryAllList(){
		List<Bettery>list = new ArrayList<>();
		Bettery bett = null;
		
		try {
			conn();
			String sql ="select *\r\n"
					+ "from bettery\r\n";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				bett = new Bettery();
				bett.setbNum(rs.getInt("b_num"));
				bett.setbType(rs.getString("b_type"));
				bett.setbPower(rs.getString("b_power"));
				bett.setbPoint(rs.getString("b_point"));
				bett.setbRent(rs.getString("b_rent"));
				list.add(bett);		
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//개인정보조회

	
	
	
	//반납초과기계
	
	//HISTORY
	
	
	//폐기
	public int deleteBett(Bettery b) {
		int result = 0;
		
		try {
			conn();
			String sql = "delete from bettery where b_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getbNum());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
}
