package com.BetteryProject.exe;

import java.util.Scanner;

import com.BetteryProject.service.UserService;

public class ExeApp {
	
	UserService us = new UserService();
	Scanner sc = new Scanner(System.in);
	
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
			}else if(UserService.userInfo != null && UserService.userInfo.getuGrade().equals("M")){
				ManagerMenu();
			}else {
				loginMenu();
			}
			
		}

	}
	
	private void loginMenu() {
		//대여, 반납
		System.out.println("☆.。.:*・°☆ ｡+.｡☆ﾟ:;｡+ﾟ☆.。.:*・°☆ ｡+.｡☆ﾟ:;｡+ﾟ");
		System.out.println("☆.。.:*1. 대여 ☆.。.:* 2. 반납 ☆.。.:*3. 회원 수정");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")) {
			
		}else if(menu.equals("2")) {
			
		}else if(menu.equals("3")) {
			modify();
		}
		
	}
	
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
	
	private void ManagerMenu() {
		System.out.println("☆.。.:*1. 기계등록 ☆.。.:* 2. 기계수정 ☆.。.:* 3. 기계조회 ☆.。.:* 4. HISTORY ☆.。.:* 5. 폐기 ☆.。.:*");
		System.out.println("입력>");

		
	}
	
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
