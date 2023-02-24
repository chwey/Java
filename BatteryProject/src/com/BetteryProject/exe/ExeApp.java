package com.BetteryProject.exe;

import java.util.Scanner;

import com.BetteryProject.service.BetteryService;
import com.BetteryProject.service.UserRentService;
import com.BetteryProject.service.UserService;

public class ExeApp {
	
	UserService us = new UserService();
	Scanner sc = new Scanner(System.in);
	BetteryService bs = new BetteryService();
	UserRentService urs = new UserRentService();
	boolean run = true;
	String menu = "";
	
	public ExeApp() {
		run();
	}
	
	private void run() {
		
		String menu ="";
		while(run) {
			if(UserService.userInfo == null) {
				logoutMenu();
			}else if(UserService.userInfo != null && UserService.userInfo.getuPoint().equals("중앙로")){
				JungangMenu();
			}else if(UserService.userInfo != null && UserService.userInfo.getuPoint().equals("칠곡")){
				ChilgokMenu();
			}else if(UserService.userInfo != null && UserService.userInfo.getuPoint().equals("상인")){
				SanginMenu();
			}else if(UserService.userInfo != null && UserService.userInfo.getuPoint().equals("동대구역")){
				DongdaeguMenu();		
			}else if(UserService.userInfo != null){
				loginMenu();
			}
			
		}

	}
	
	private void loginMenu() {
		//대여, 반납
		System.out.println("☆.。.:*・°☆ ｡+.｡☆ﾟ:;｡+ﾟ☆.。.:*・°☆ ｡+.｡☆ﾟ:;｡+ﾟ");
		System.out.println("☆.。.:*1. 대여 ☆.。.:* 2. 반납 ☆.。.:* 3. 회원 수정 ☆.。.:* 4. 탈퇴");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			urs.getBetteryInfo();
		}else if(menu.equals("2")) {
			
		}else if(menu.equals("3")) {
			modify();
		}else if(menu.equals("4")) {
			us.deleteUser();
		}
		
	}
	
	//메인메뉴
	private void logoutMenu() {
		System.out.println("☆.。.:*1. 로그인 ☆.。.:* 2. 회원가입 ☆.。.:* 3. 종료 ☆.。.:*");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			us.login();
		}else if(menu.equals("2")) {
			us.insertUser();
		}
	}
	//관리자 메뉴
	//중앙로
	private void JungangMenu() {
		System.out.println("☆.。.:*1. 기계등록 ☆.。.:* 2. 기계수정 ☆.。.:* 3. 기계조회 ☆.。.:* 4. 폐기 ☆.。.:*");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			bs.insertBett();
		}else if(menu.equals("2")) {
			bs.modifyBett();
		}else if(menu.equals("3")) {
			BattList();
		}else if(menu.equals("4")) {
			bs.deleteBett();
		}
	
	}
	
	//칠곡
	private void ChilgokMenu() {
		System.out.println("☆.。.:*1. 기계등록 ☆.。.:* 2. 기계수정 ☆.。.:* 3. 기계조회 ☆.。.:* 4. 폐기 ☆.。.:*");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			bs.insertBett();
		}else if(menu.equals("2")) {
			bs.modifyBett();
		}else if(menu.equals("3")) {
			BattList();
		}else if(menu.equals("4")) {
			bs.deleteBett();
		}
	
	}
	
	//상인
	private void SanginMenu() {
		System.out.println("☆.。.:*1. 기계등록 ☆.。.:* 2. 기계수정 ☆.。.:* 3. 기계조회 ☆.。.:* 4. 폐기 ☆.。.:*");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			bs.insertBett();
		}else if(menu.equals("2")) {
			bs.modifyBett();
		}else if(menu.equals("3")) {
			BattList();
		}else if(menu.equals("4")) {
			bs.deleteBett();
		}
	
	}
	
	//동대구역
	private void DongdaeguMenu() {
		System.out.println("☆.。.:*1. 기계등록 ☆.。.:* 2. 기계수정 ☆.。.:* 3. 기계조회 ☆.。.:* 4. 폐기 ☆.。.:*");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			bs.insertBett();
		}else if(menu.equals("2")) {
			bs.modifyBett();
		}else if(menu.equals("3")) {
			BattList();
		}else if(menu.equals("4")) {
			bs.deleteBett();
		}
	}
	
	
	private void BattList() {
		System.out.println("1. 보조배터리정보조회  2. 개인정보조회  3. 반납기간초과조회  4. HISTORY");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			bs.getBetteryList();
		}else if(menu.equals("2")) {
			
		}else if(menu.equals("3")) {
			
		}else if(menu.equals("4")) {
			
		}
		
		
	}
	
	
	//수정
	private void modify() {
		System.out.println("1. 비밀번호 수정  2. 전화번호 수정  3. 이메일 수정");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			us.modifypw();
		}else if(menu.equals("2")) {
			us.modifypn();
		}else if(menu.equals("3")) {
			us.modifymail();
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
