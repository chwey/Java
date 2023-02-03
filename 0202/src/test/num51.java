package test;

import java.util.Scanner;

public class num51 {
	public static void main(String[] args) {
		boolean run = true;
		int num = 0;
		int[] game = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("===1.주사위 크기  2. 주사위 굴리기  3.결과 보기  4. 가장 많이 나온 수  5. 종료");
			System.out.println("메뉴>");		
			String selectNo =sc.nextLine();

			if(selectNo.equals("1")) {
				System.out.println("주사위 크기 입력>");
				num = Integer.parseInt(sc.nextLine());
				if(num <5 || num>10) {
					System.out.println("5~10 사이 수를 입력하세요");
				}
				
			}else if(selectNo.equals("2")){
				game = new int[num];
				int count = 0;
				
				while(true) {
					//5가 나올때까지 반복문
					int random = (int)(Math.random()*num)+1;
					System.out.println(random);
					game[random-1] = game[random-1]+1;
					count++;
					
					if(random == 5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를" + count + "번 굴렸습니다");	
			}else if(selectNo.equals("3")) {
				
			}
		
		}
	}
}
