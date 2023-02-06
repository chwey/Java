package com.yedam.example;

public class LG implements Washer, Drying{

	@Override
	public void dry() {
		System.out.println("건조기능");
		
	}

	@Override
	public void start() {
		System.out.println("빨래시작");
		
	}

	@Override
	public void stop() {
		System.out.println("빨래 중지");
		
	}

	@Override
	public void finish() {
		System.out.println("빨래 종료");
		
	}

	@Override
	public int changeSpeed(int speed) {
		int nowSpeed = 0;
		switch(speed) {
		case 1 :
			nowSpeed = 20;
			break;
		case 2 :
			nowSpeed = 50;
			break;
		case 3 :
			nowSpeed = 100;
			break;
		
		}
		return nowSpeed;
	}
	


	
}
