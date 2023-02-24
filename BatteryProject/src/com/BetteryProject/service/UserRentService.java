package com.BetteryProject.service;

import java.util.List;
import java.util.Scanner;

public class UserRentService {
	
	Scanner sc = new Scanner(System.in);
	
	//리스트
	public void getBetteryInfo() {
		List<Bettery> list = BetteryDAO.getInstance().getBetteryAllList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getbNum() +" " + list.get(i).getbPower()+" " + list.get(i).getbPoint()+" " + list.get(i).getbRent());
		}
	}
	
	//사용자 대여
	public void rent() {
		UserRentService urs = new UserRentService();
		System.out.println("보조배터리 대여");
		
		System.out.println("보조배터리 넘버를 입력해주세요");
		
		
	

		
	}

	
	
}
