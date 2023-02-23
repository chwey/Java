package com.BetteryProject.service;

import com.BetteryProject.common.DAO;

public class RentDAO extends DAO{
	
	private static RentDAO rentDao = null;
	
	private RentDAO() {
		
	}
	
	public static RentDAO getInstance() {
		if(rentDao == null) {
			rentDao = new RentDAO();
		}
		return rentDao;
	}
	
	//대여한 사람 정보
	
	
	
	
	
	
	
	
	
}
