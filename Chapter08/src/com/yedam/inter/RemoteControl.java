package com.yedam.inter;

public interface RemoteControl {
	//상수 => static final이 생략
	public int Max_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상메소드 -> abstract 생략
	public void turnOn();
	public abstract void turnOff();
	public void setVolume(int volume);
	
}
