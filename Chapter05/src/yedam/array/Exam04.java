package yedam.array;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				//학생 수 = 학생 수 만큼 데이터를 입력
				//학생의 성적을 입력하는 배열의 크기
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 2) {
				
				scores = new int [studentNum];
				
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt (sc.nextLine());
				}
			
			}else if(selectNo == 3) {
				for(int i = 0; i<scores.length; i++){
					System.out.println("scores [" + i + "]="+ scores[i]);
				}
			
			}else if(selectNo == 4) {
				int max = 0;
				int sum=0;
				for(int i = 0; i<scores.length; i++) {
					if(scores[i] > max);
					max = scores[i];
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균점수는 : "+ (double)sum/scores.length);
				
				
			}else if (selectNo == 5) {
				run = false;
			}
				
		}
	}

}
