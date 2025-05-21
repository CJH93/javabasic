package javaStudy.day5.nestedClassEx;

/*
 * 멤버 중첩 : Outer 의 특정 필드가 중첩 클래스로 정의된 형태를 말함.
 */

public class A {
	
	/*
	 * 멤필로 중첩을 선언하고 정의함.
	 * 접근제어자는 public | default | private 이 올 수 있음.
	 *  
	 */
	
	private int outerA;
	private static int outerB;
	
	void outerDoSome() {
		System.out.println("Outer 의 doSome 메서드");
	}
	
	class B { // default 로 선언함. 같은 패키지 내에서만 참조 가능
		int mf1 = 1;
		
		static int mf2 = 2;
		
		B(){
			System.out.println("Inner B 생성자 호출됨");
			outerDoSome();
		}
		
		void doSome1() {
			// Inner 에서는 Outer 의 모든 멤버를 접근할 수 있음
			System.out.println("Outer 의 멤버 접근함 : " + outerA);
			System.out.println("Outer 의 멤버 접근함 : " + outerB);
			System.out.println("Inner B 의 doSome1 실행됨");
		}
		static void doSome2() {
			System.out.println("Inner B 의 doSome2 실행됨");
		}
	}
	
	// Inner 를 사용하는 메서드 정의
	void outerDoSome2() {
		B b = new B();
		System.out.println(b.mf1);
		
		System.out.println(B.mf2);
	}
}
