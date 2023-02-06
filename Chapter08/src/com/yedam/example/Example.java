package com.yedam.example;

public class Example {

	public static void main(String[] args) {
		LG LGws = new LG();
		LGws.start();
		LGws.stop();
		System.out.println("세탁기 속도: " + LGws.changeSpeed(3));
		LGws.finish();
		LGws.dry();
	}

}
