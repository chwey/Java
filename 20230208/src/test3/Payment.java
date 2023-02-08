package test3;

public interface Payment {
	//상수
	public int ONLINE_PAYMENT_RATIO = 5;
	public int OFFLINE_PAYMENT_RATIO = 3;
	
	//추상메서드
	public int online();
	public int offline();
	public void showInfo();
}
