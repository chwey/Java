package com.BetteryProject.service;

import java.util.Scanner;

public class UserService {
	
	public static User userInfo = null;
	Scanner sc = new Scanner(System.in);
	
	//로그인
	public void login() {
		User user = null;
		System.out.println("아이디를 입력해주세요");
		String userID = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String userPW = sc.nextLine();
		
		user = UserDAO.getInstance().login(userID);
		
		if(user != null) {
			if(user.getuPw().equals(userPW)) {
				System.out.println("로그인 완료 ✌(-‿-)✌");
				System.out.println(user.getuName() + "님 안녕하세요 ˙ᵕ˙");
				userInfo = user;
			}else {
				System.out.println("비밀번호가 틀립니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다 ( ఠ్ఠ ˓̭ ఠ్ఠ )");
		}
		
	}
	
	//가입
	public void insertUser() {
		User use = new User();
		System.out.println("회원가입");
		System.out.println("ID>");
		use.setuId(sc.nextLine());
		System.out.println("PW");
		use.setuPw(sc.nextLine());
		System.out.println("이름>");
		use.setuName(sc.nextLine());
		System.out.println("전화번호>");
		use.setuPhoneNumber((sc.nextLine()));
		System.out.println("메일>");
		use.setuMail(sc.nextLine());		
		
		int result = UserDAO.getInstance().insertUser(use);
		
		if(result > 0) {
			System.out.println("회원등록완료");
		}else {
			System.out.println("회원등록실패");
		}
	}
	
	//pw수정
	public void modifypw() {
		System.out.println("회원수정");
		System.out.println("ID를 입력하세요");
		String useNo = sc.nextLine();
		System.out.println("비밀번호 수정");
		String usepw = sc.nextLine();
		
		User use = new User();
		use.setuId(useNo);
		use.setuPw(usepw);
		
		int result = UserDAO.getInstance().modifypw(use);
		
		if(result>0) {
			System.out.println("수정 완료되었습니다");
		}else {
			System.out.println("다시 입력해주세요");
		}		
	}
	//전화번호 수정
	public void modifypn() {
		System.out.println("회원수정");
		System.out.println("ID를 입력하세요");
		String useNo = sc.nextLine();
		System.out.println("전화번호 수정");
		String usepn = sc.nextLine();

		
		User use = new User();
		use.setuId(useNo);
		use.setuPhoneNumber(usepn);
		
		int result = UserDAO.getInstance().modifypn(use);
		
		if(result>0) {
			System.out.println("수정 완료되었습니다");
		}else {
			System.out.println("다시 입력해주세요");
		}		
	}
	//메일 수정
	public void modifymail() {
		System.out.println("회원수정");
		System.out.println("ID를 입력하세요");
		String useNo = sc.nextLine();
		System.out.println("이메일 수정");
		String usemail = sc.nextLine();
		
		User use = new User();
		use.setuId(useNo);
		use.setuMail(usemail);
		
		int result = UserDAO.getInstance().modifymail(use);
		
		if(result>0) {
			System.out.println("수정 완료되었습니다");
		}else {
			System.out.println("다시 입력해주세요");
		}		
	}
	
	//삭제
	public void deleteUser() {
		System.out.println("계정 삭제");
		System.out.println("아이디를 입력해주세요");
		String useNo = sc.nextLine();
		
		User use = new User();
		use.setuId(useNo);
		
		int result = UserDAO.getInstance().deleteUser(use);
		
		if(result > 0) {
			UserService.userInfo = null; //로그아웃
			System.out.println("계정 삭제 완료");
		}else {
			System.out.println("계정 삭제 실패");
		}
	}
	
	

	
	
}
