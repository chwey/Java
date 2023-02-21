package com.yedam.service;

import java.util.Scanner;

public class MemberService {
	//member 정보를 자바 전역에 공유하기 위해 static 사용
	//1. memberInfo -> null이 아니다. null 이다
	//null이 맞으면 로그인이 안된 상태
	//null이 아니면 로그인이 되어있는 상태
	
	public static Member memberInfo = null;
	Scanner sc = new Scanner(System.in);
	
	//1.로그인
	public void login() {
		Member member = null;
		System.out.println("ID>");
		String memberID = sc.nextLine();
		System.out.println("PW>");
		String memberPw = sc.nextLine();
		
		member = MemberDAO.getInstance().login(memberID);
		//id를 통해서 회원 정보를 조회하고 조회 된 결과에 따라 login 여부를 결정
		//1. id를 통해 조회가 되었다 -> 회원의 정보가 존재
		//따라서 입력한 비밀번호와 회원의 정보에서의 비밀번호가 동일 => login 진행
		//memeberInfo에 조회된 회원의 정보 대입
		
		//id를 통해 조회가 되지않았음 -> 회원 정보가 없음
		//따라서 login 실패
		//memberInfo에는 null이 유지
		
		if(member != null) { //데이터가 조회되었음
			if(member.getMemberPw().equals(memberPw)) {
				System.out.println("정상 로그인 되었습니다");
				System.out.println(member.getMemberId() + "님 환영합니다");
				memberInfo = member;
			}else {
				System.out.println("비밀번호가 틀립니다");
			}
		}else {
			System.out.println("해당 아이디는 존재하지 않습니다");
		}
		
		
	}
	//2. 회원 정보 조회
		public void getMember() {
			Member member = MemberDAO.getInstance().getMember();
			System.out.println(member.toString());
		}
		
	//3. 회원 정보 수정
		public void modifyMember() {
			Member member = new Member();
			System.out.println("연락처>");
			member.setMemberPhone(sc.nextLine());
			System.out.println("회원>");
			member.setMemberId(sc.nextLine());
			
			int result = MemberDAO.getInstance().modifyMember(member);
			
			if(result>0) {
				System.out.println("연락처 수정 완료");
			}else {
				System.out.println("연락처 수정 실패");
			}
		}
		
	//4.회원 정보 탈퇴
		public void deleteMember() {
			
			System.out.println("회원 ID>");
			int result = MemberDAO.getInstance().deleteMember(sc.nextLine());
			
			//자신의 ID를 넣었다
			//로그인 되어 있는 상태에서 회원 탈퇴 -> 로그아웃
			if(result > 0) {
				MemberService.memberInfo = null; //로그아웃
				System.out.println("회원 ID 삭제 완료");
			}else {
				System.out.println("회원 ID 삭제 실패");
			}
			
			
			
		}	
		
		
		
		
}
