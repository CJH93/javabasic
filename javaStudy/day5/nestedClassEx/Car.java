package javaStudy.day5.nestedClassEx;

public class Car {

	private Tire tire1 = new Tire();
	
	// 익명 자식객체를 이용해서 타이어 객체를 초기화 함
	private Tire tire2 = new Tire() {
		public void roll() {
			System.out.println("익명 자식 객체 tire가 굴러감");
		};
	};
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
	
	void run2() {
		// 지역 변수에 익명 자식 객체를 대입함
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체 타이어 2가 굴러감");
			}
		};
		
		tire.roll();
		
	} 
	
	void run3(Tire tire) {
		tire.roll();
	}
}
