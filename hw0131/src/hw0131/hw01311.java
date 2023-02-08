package hw0131;

public class hw01311 {
	public static void main(String[] args) {
		// 추가 문제]
		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라
	
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
				int[] counter = new int[4];
		
				for (int i = 0; i < answer.length; i++) {
					/* 해당 부분 코딩 */
					//answer의 숫자의 갯수 -> counter 인덱스 매칭
					//answer에서 데이터(값)이 나왔을 때 -> counter의 인덱스로 바꿈
					//answer -> 1
					//counter[0] = counter[0]+1;
					//answer -> 4
					//counter[3] -> counter[3]+1;
					counter[answer[i]-1]++;
							
				}
				for (int i = 0; i < counter.length; i++) {
					//counter[0] = answer에서 숫자 1의 갯수 = 3
					for(int j = 0; j< counter[i]; j++) {
						System.out.print("*");
					}

					System.out.println();

				}
	}
}
