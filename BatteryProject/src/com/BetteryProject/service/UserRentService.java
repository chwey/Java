package com.BetteryProject.service;


import java.util.List;
import java.util.Scanner;

public class UserRentService extends UserService {

	Scanner sc = new Scanner(System.in);

	// 리스트
	public void getBetteryInfo() {
		List<Bettery> list = BetteryDAO.getInstance().getBetteryAllList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getbNum() + " " + list.get(i).getbType() + " " + list.get(i).getbPower()
					+ " " + list.get(i).getbPoint() + " " + list.get(i).getbRent());
		}
	}

	// 사용자 대여
	public void Borrow() {
		System.out.println("====== 대여 ======");
		System.out.println("대여할 지점을 선택하세요");
		System.out.println("1. 중앙로  2. 칠곡  3. 상인  4. 동대구역");
		int menuNo = Integer.parseInt(sc.nextLine());
		String rPoint = null;
		if (menuNo == 1) {
			rPoint = "중앙로";
		} else if (menuNo == 2) {
			rPoint = "칠곡";
		} else if (menuNo == 3) {
			rPoint = "상인";
		} else if (menuNo == 4) {
			rPoint = "동대구역";
		}
		List<Bettery> list = UserRentDAO.getInstance().BorrowList(rPoint);

		UserRent urs = new UserRent();
		for (int i = 0; i < list.size(); i++) {

			String able = null;
			if (list.get(i).getbRent().equals("Y")) {
				able = "대여가능";
			} else {
				able = "X대여불가";
			}

			System.out.println(list.get(i).getbNum() + " " + list.get(i).getbType() + " " + list.get(i).getbPower()
					+ " " + list.get(i).getbPoint() + " " + able);
		}
		System.out.println("보조배터리 넘버를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());
		String ok = UserRentDAO.getInstance().able(num);
		if(ok.equals("Y") || ok.equals("y")) {
			urs.setbNum(num);	
		}else {
			System.out.println("현재 대여중인 배터리 입니다 다른 배터리를 골라주세요");
			System.out.println("보조배터리 넘버를 입력해주세요");
			num = Integer.parseInt(sc.nextLine());
			urs.setbNum(num);
		}
		urs.setuId(userInfo.getuId());
		urs.setrPoiont(rPoint);

		int result = UserRentDAO.getInstance().insertBorrow(urs);
		if (result > 0) {
			System.out.println("대여성공했습니다. 꼭 반납해주세요");
			int re = UserRentDAO.getInstance().modifyBorrow(num);
			if(re == 0) {
				System.out.println("오류발생");
			}
		} else {
			System.out.println("보조배터리 넘버를 다시 입력해주세요");
		}
	}
	
	//사용자 반납
	public void Return() {
		System.out.println("===== 반납 =====");
		System.out.println("반납할 지점을 선택하세요");
		System.out.println("1. 중앙로  2. 칠곡  3. 상인  4. 동대구역");
		int menuNo = Integer.parseInt(sc.nextLine());
		String rPoint = null;
		if (menuNo == 1) {
			rPoint = "중앙로";
		} else if (menuNo == 2) {
			rPoint = "칠곡";
		} else if (menuNo == 3) {
			rPoint = "상인";
		} else if (menuNo == 4) {
			rPoint = "동대구역";
		}
		
		UserRent urs = new UserRent();

		Bettery bett =  new Bettery();
		System.out.println("반납할 배터리 넘버를 입력하세요");
		int pwr = Integer.parseInt(sc.nextLine());
		urs.setbNum(pwr);
		bett.setbNum(pwr);
		System.out.println("남은 배터리량을 입력해주세요");
		bett.setbPower(sc.nextLine());
		urs.setuId(userInfo.getuId());
		urs.setbPoint(rPoint);
		bett.setbPoint(rPoint);
		
		int result = UserRentDAO.getInstance().insertReturn(urs);
		if (result > 0) {
			System.out.println("반납성공했습니다");
			int re = UserRentDAO.getInstance().modifyReturn(bett);
			if(re == 0) {
				System.out.println("오류발생");
			}
		} else {
			System.out.println("다시 입력해주세요");
		}
	}
	
	//배터리상세조회
	public void getUserlist() {
		System.out.println("==== 보조배터리 상세조회 ====");
		System.out.println("보조배터리 넘버를 입력해주세요");
		int bNo = Integer.parseInt(sc.nextLine());
		UserRent urt = UserRentDAO.getInstance().getUserlist(bNo);
		
		if(urt == null) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println("배터리 넘버 :" + urt.getbNum());
			System.out.println("사용자 아이디 :" + urt.getuId());
			System.out.println("대여시간 : " + urt.getrDate());
			System.out.println("대여장소 :" + urt.getrPoiont());
			System.out.println("반납시간 :" + urt.getbDate());
			System.out.println("반납장소 :" + urt.getbPoint());

		}
		System.out.println("========================");

	}
	
	//반납일 초과
	public void overList() {
		System.out.println("===== 반납일 연체 정보 =====");
		List<UserRent> list = UserRentDAO.getInstance().overList();
		for(int i=0; i<list.size(); i++) {
			System.out.println("사용자 아이디 :" + list.get(i).getuId());
			System.out.println("배터리 넘버 : " + list.get(i).getbNum());
			System.out.println("대여 장소 :"+ list.get(i).getrPoiont());
			System.out.println("대여 시간 :"+list.get(i).getrDate());
			System.out.println("반납 장소 :"+ list.get(i).getbPoint());
			System.out.println("반납 시간 :" + list.get(i).getbDate());
			System.out.println("반납일연체 :" + list.get(i).getOver());
			
		}
		System.out.println("========================");
	}
	
	//HISTORY
	public void getUserlastlist() {
		System.out.println("사용자 아이디를 입력해주세요");
		String bNo = sc.nextLine();
		UserRent urt = UserRentDAO.getInstance().getUserlastlist(bNo);
		
		if(urt == null) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println("배터리 넘버 :" + urt.getbNum());
			System.out.println("사용자 아이디 :" + urt.getuId());
			System.out.println("대여시간 : " + urt.getrDate());
			System.out.println("대여장소 :" + urt.getrPoiont());
			System.out.println("반납시간 :" + urt.getbDate());
			System.out.println("반납장소 :" + urt.getbPoint());

		}
		System.out.println("========================");

	}

}
