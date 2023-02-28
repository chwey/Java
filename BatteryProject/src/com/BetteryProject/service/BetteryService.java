package com.BetteryProject.service;

import java.util.List;
import java.util.Scanner;

public class BetteryService extends UserService{

	Scanner sc = new Scanner(System.in);
	
	//기계정보등록
	public void insertBett() {
		Bettery bett = new Bettery();
		System.out.println("======보조배터리 등록 =======");
		System.out.println("보조배터리 넘버");
		bett.setbNum(Integer.parseInt(sc.nextLine()));	
		System.out.println("보조배터리 타입");
		bett.setbType(sc.nextLine());
		System.out.println("보조배터리 관리지점");
		bett.setbPoint(sc.nextLine());
		
		int result = BetteryDAO.getInstance().insertBett(bett);
		
		if(result>0) {
			System.out.println("기계등록 성공했습니다");
		}else {
			System.out.println("기계등록 실패했습니다");
		}	
	}
	
	//기계정보수정
	public void modifyBett() {
		System.out.println("위치수정");
		System.out.println("보조배터리 넘버를 입력하세요");
		int betNo = Integer.parseInt(sc.nextLine());
		System.out.println("보조배터리 위치를 수정하세요");
		String betpoint = sc.nextLine();
		
		Bettery bettery = new Bettery();
		bettery.setbNum(betNo);
		bettery.setbPoint(betpoint);
		
		int result = BetteryDAO.getInstance().modifyBett(bettery);
		
		if(result > 0) {
			System.out.println("수정이 완료되었습니다");
		}else {
			System.out.println("다시 입력해주세요");
		}
		
	}
	
	//전체조회
	public void getBetteryList() {
		List<Bettery>list = BetteryDAO.getInstance().getBetteryList(userInfo.getuPoint());
		System.out.println("===============================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("보조배터리 넘버 :"+ list.get(i).getbNum());
			System.out.println("보조배터리 타입 :"+ list.get(i).getbType());
			System.out.println("배터리 용량 :"+ list.get(i).getbPower() +"%");
			System.out.println("보조배터리 위치 :"+list.get(i).getbPoint());
			System.out.println("보조배터리 대여 여부 :"+list.get(i).getbRent());
			System.out.println("===============================");

		}
	}

	
	//폐기
	public void deleteBett() {
		System.out.println("보조배터리 폐기");
		System.out.println("보조배터리 넘버 입력해주세요");
		int bettNo = Integer.parseInt(sc.nextLine());
		
		Bettery bett = new Bettery();
		bett.setbNum(bettNo);
		
		int result = BetteryDAO.getInstance().deleteBett(bett);
		
		if(result > 0) {
			System.out.println("폐기완료");
		}else {
			System.out.println("다시 입력해주세요");
		}
	}
	
	
}
