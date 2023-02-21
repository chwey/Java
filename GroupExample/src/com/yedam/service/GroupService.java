package com.yedam.service;


import java.util.Scanner;

public class GroupService {
	
	public static Group groupInfo = null;
	Scanner sc = new Scanner(System.in);
	
	//등록
	public void insertGrp() {
		Group grp = new Group();
		System.out.println("======회원 등록======");
		System.out.println("회원 ID>");
		String grpNo = sc.nextLine();
		System.out.println("회원 이름>");
		String grpName = sc.nextLine();
		System.out.println("등록날짜>");
		String grpdate = sc.nextLine();
		System.out.println("이메일>");
		String grpemail = sc.nextLine();
		System.out.println("나이>");
		int grpAge = Integer.parseInt(sc.nextLine());
		
		int result = GroupDAO.getInstance().insertGrp(grp);
		
		
	}
}
