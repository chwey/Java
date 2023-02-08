package test3;

public interface Payment {
	//상수
	public double ONLINE_PAYMENT_RATIO = 0.05;
	public double OFFLINE_PAYMENT_RATIO = 0.03;
	
	//추상메서드
	public int online(int price);
	public int offline(int price);
	public void showInfo();
}
