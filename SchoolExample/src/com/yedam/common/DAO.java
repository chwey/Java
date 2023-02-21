package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	//DAO -> DATA ACCESS OBJECT
	//JAVA <-> DB 연결 할 때 쓰는 객체
	//JDBC를 통해서 JAVA <-> DB가 연결한다.
	//OJDBC 사용
	
	//java -> DB 연결할때 쓰는 객체
	protected Connection conn = null;
	
	//Query문(SQL, 질의)을 가지고 해당 Query문 실행하는 객체
	protected PreparedStatement pstmt = null;
	
	//Query문(SQL, 질의)을 가지고 해당 Query문 실행하는 객체
	protected Statement stmt = null;
	
	//SELECT(조회) 결과 값을 반환 받는 객체
	protected ResultSet rs = null;
	
	//hr 계정 접속
//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	String id = "hr";
//	String pw = "hr";
	
	String driver = null;
	String url = null;
	String id = null;
	String pw = null;
	
	//DB 연결 메소드
	public void conn() {
		//1.드라이버 로딩
		try {
			Class.forName(driver);
			//2.DB연결
			conn = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	//DB 연결 해제
	public void disconn() {
		try {
			
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//db 접속 정보 호출 메소드
	//1. 프로그램 안에 db 관련 정보를 넣지 않기 위해
	//2. 프로그램 실행 중 db가 변경이 된다면 원래 프로그램 껐다가 내용 수정 후 켜야하는데
	//메모장 같은 곳에 내용을 불러와서 쓴다면 프로그램 돌아가고 있는 도중에 메모장에 쓴 내용을 불러가기 때문에
	//프로그램 종료하지 않고 수정된 db 관련 내용을 적용시킬 수 있음 
	
	private void getProperties() {
		FileReader resource = new FileReader("src/config/db.properties");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
