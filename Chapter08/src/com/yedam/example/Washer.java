package com.yedam.example;

public interface Washer extends Drying {
	public void start();
	public void stop();
	public void finish();
	public int changeSpeed(int speed);
}
