package hw0206_1;
/*4) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
	- 출력결과
		영화제목 : 추격자
		감독 : 7
		배우 : 5
		영화총점 : 12
		영화평점 : ☆☆☆☆ 3명
		=====================
		공연제목:지킬앤하이드
		감독:9
		배우:10
		공연총점 : 46
		공연평점 : ☆☆☆☆☆
	- 조건
		관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다.
		*/

public class Main {

	public static void main(String[] args) {
		Culture movie = new Movie("추격자", 7, 5, "영화");
		
		movie.setTotalScore(4);
		movie.setTotalScore(1);
		movie.setTotalScore(3);
		movie.setTotalScore(2);
		
		
		movie.getInformation();
		System.out.println("==============================");
		
		
		

	}

	

}
