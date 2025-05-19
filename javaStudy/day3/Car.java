package javaStudy.day3;

/*
 * 자동차 정의
 */

public class Car {

	private String color;
	private String mfg;
	private int mfgYear;
	private int speed;
	
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, String mfg) {
		this(color);
		this.mfg = mfg;
	}
	public Car(String color, String mfg, int mfgYear) {
		this(color,mfg);
		this.mfgYear = mfgYear;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMfg() {
		return mfg;
	}
	public void setMfg(String mfg) {
		this.mfg = mfg;
	}
	public int getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public int getSpeed() {
		return speed;
	}
	private void setSpeed(int speed) {
		this.speed = speed;
	}
	public void accelate(int speed) {
		if(speed < 0) {
			return;
		}
		setSpeed(speed);
	}
}
