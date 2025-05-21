package javaStudy.day5;

import javaStudy.day4.InterfaceEx.RemotControl;

public class SmartTV implements TheLastInterface {

	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색함");

	}

	@Override
	public void turnOn() {
		System.out.println("스마트 티비를 켬");

	}

	@Override
	public void turnOff() {
		System.out.println("스마트 티비를 끔");

	}

	@Override
	public void volumeUp(int volume) {
		System.out.println("스마트 티비의 볼륨을 올림");

	}

	@Override
	public void volumeDown(int volume) {
		System.out.println("스마트 티비의 볼륨을 내림");

	}

	

}
