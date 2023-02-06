package hw0206_3;

/*2) Tablet 인터페이스를 정의한다.
		- 다음과 같이 상수 필드를 정의한다.
		(1) public static final int TABLET_MODE = 2;
		- 다음과 같이 메소드를 정의한다.
		(1) public abstract void watchVideo() : 영상을 출력하는 기능
		(2) public abstract void useApp() : 앱을 사용하는 기능
		*/
public interface Tablet {
	public static final int TABLET_MODE = 2;
	
	public abstract void watchVideo()
	public abstract void useApp()
}
