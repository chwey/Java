package test;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		//주사위 크기(5~10)
		//주사위 최대크기 (5~10)
		//5 -> 1~5
		//6 -> 1~6
		//...10 -> 1~10
		//5~10을 벗어난 크기 입력 -> 범위가 벗어났다라는 알람
		boolean run = true;
		int num = 0;
		int[] game = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("===1.주사위 크기  2. 주사위 굴리기  3.결과 보기  4. 가장 많이 나온 수  5. 종료");
			System.out.println("메뉴>");		
			String selectNo =sc.nextLine();
			
			switch(selectNo) {
			case "1" : 
				System.out.println("주사위 크기 입력>");
				num = Integer.parseInt(sc.nextLine());
				//7 -> 배열크기(사이즈) = 7
				//배열입장 -> 0~6 -> 주사위 비유 -> 1~7
				//if문 활용  -> 경고창
				if(num < 5 || num > 10) {
					System.out.println("5~10사이 수를 입력하세요.");
				}
				break;
			case "2" :
				//주사위 크기 설정
				//5가 나올때까지 반복문 진행 -> while문
				//랜덤값을 활용해서 숫자를 뽑아냄
				//5가 등장하면 반복문을 종료
				game = new int[num];
				
				//총 주사위를 몇번 굴렸는지 확인하는 변수
				int count = 0; 
				//5가 나올때까지 반복하는 반복문
				while(true) {
					//랜덤값 추출
					int random = (int)(Math.random()*num)+1;
					System.out.println(random);
					//각 숫자를 배열에 저장
					//랜덤으로 나온 숫자 -> 배열에서 인덱스로 적용
					//3 -> 배열에서 인덱스 2로 저장
					game[random-1] = game[random-1]+1;
					count++; 
					//숫자 5가 등장하면 반복문 종료(숫자를 그만 가지고 나와야 함)
					if(random == 5) {
						break;
					}
				}
				System.out.println("5가 나올때까지 주사위를" + count + "번 굴렸습니다.");
				break;
			case "3" :
				for(int i=0; i<game.length; i++) {
					System.out.println((i+1)+"은" + game[i] + "번 나왔습니다");
				}
				break;
			case "4" :
				int max = game[0];
				int index = 0;
				for(int i=0; i<game.length; i++) {
					if(max<game[i]) {
						max = game[i];
						index = i; //만약 인덱스가 5면 주사위 번호는 6
					}
				}
				System.out.println("가장 많이 나온 수는" + (index +1) + "입니다.");
				break;
			case "5" :
				System.out.println("프로그램 종료");
				run = false;
				

			}

		}
	}
}