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
		urs.setbNum(num);
		urs.setuId(userInfo.getuId());
		urs.setrPoiont(rPoint);

		int result = UserRentDAO.getInstance().insertBorrow(urs);
		if (result > 0) {
			System.out.println("대여성공");
			int re = UserRentDAO.getInstance().modifyBorrow(num);
			if(re == 0) {
				System.out.println("오류발생");
			}
		} else {
			System.out.println("대여실패");
		}
	}
	
	//사용자 반납
	public void Return() {
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
			System.out.println("반납성공");
			int re = UserRentDAO.getInstance().modifyReturn(bett);
			if(re == 0) {
				System.out.println("오류발생");
			}
		} else {
			System.out.println("반납실패");
		}
	}
	
	//배터리상세조회
	public void getUserlist() {
		System.out.println("배터리 넘버를 입력해주세요");
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
