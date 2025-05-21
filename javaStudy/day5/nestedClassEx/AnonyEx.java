package javaStudy.day5.nestedClassEx;

import javaStudy.day4.InterfaceEx.RemotControl;

/*
 * 익명 객체(클래스) : 이름이 없는 객체를 말함
 * 익명객체는 명시적으로 클래스를 선언하지 않고 사용하기 때문에 쉽게 객체를 발생할 수 있음
 * 익명 객체는 필드 값, 지역 변수 값, 파라미터 값으로 주로 사용됨.
 * 
 * 클래스를 상속하거나 인터페이스를 구현해야만 생성 가능함.
 * 클래스를 상속해서 만들 경우 익명 자식 객체라고 구분 지음
 * 인터페이스를 상속한 경우에는 익명 구현 객체라고 함
 * 
 * 문법 : new 부모 생성자(파라미터s, ..) {
 * // 필드 and 메서드
 * }
 */

public class AnonyEx {
	
	public static void main(String[] args) {
		
		// 익명 자식 객체 구현
		Car car = new Car();
		
		car.run();
		
//		Tire t = new Tire();
		car.run3(new Tire() {
			
		});
		
		// 익명 구현 객체 예시
		RemotControl rc = new RemotControl() {
			
			@Override
			public void volumeUp(int volume) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void volumeDown(int volume) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("수업 끝낼까요?");
				
			}
		};
		
		rc.turnOff();
		
		
		
		
		
		
	}
}
