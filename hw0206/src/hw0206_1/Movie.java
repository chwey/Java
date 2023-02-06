package hw0206_1;

public class Movie extends Culture {

	String genre;

	public Movie(String title, int dir, int act, int aud, int score, String genre) {
		super(title, dir, act, aud, score);
		this.genre = genre;
	}

	public void getInformation() {
		//제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점
		System.out.println("제목 :"+ title);
		System.out.println("참여감독 수 :"+ dir);
		System.out.println("참여배우 수 :" + act);
		System.out.println("관객수 :" + aud);
		System.out.println("총점 :" + score);
		System.out.println("평점 :" + );
	}
	
	
	
}
