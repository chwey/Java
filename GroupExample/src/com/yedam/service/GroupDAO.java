package com.yedam.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class GroupDAO extends DAO{
	
	//싱글톤
	private static GroupDAO gDao = new GroupDAO();
	
	private GroupDAO() {
		
	}
	
	public static GroupDAO getInstance() {
		return gDao;
	}
	
	//새 회원 등록
	public int insertGrp(Group grp) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into grp (grp_id, grp_name, grp_date, grp_email, grp_age)"
					+ " values(?, ?, sysdate, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, grp.getGrpId());
			pstmt.setString(2, grp.getGrpName());
			pstmt.setString(3, grp.getGrpemail());
			pstmt.setInt(4, grp.getGrpage());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//조회
	public List<Group>getGroupList(){
		List<Group>list = new ArrayList<>();
		
		
		
		
		
	}
	
	
	
	//아이디로 회원 조회
	//이메일 변경
	//탈퇴
}
