package javaStudy.day5.nestedClassEx;

public class C {

	/*
	 * 정적멤버 클래스 : 이 클래스는 Outer 에서 사용도 하지만,
	 * outer 와 함께 inner 도 같이 사용하는 경우가 많음.
	 * 접근 제어는 default || public 을 주로 사용
	 * inner 객체는 Outer 의 어디에서든 객체를 발생시킬 수 있음
	 * 외부에서 Inner 객체를 발생시킬때는 Outer 객체가 없어도 발생시킬 수 있음
	 * Outer.Inner inner = new Outer.Inner();
	 */
	
	int a;
	static int b;
	// D fieldD = new D();
	
	public static class D {
		
		int dd;
		static int kk;
		
		void innerDo() {
			System.out.println(b);
		}
		static void staticDo() {
			
		}
	}
	
	void aa() {
		System.out.println(D.kk);
		int kk = new D().dd;
	}
	
	static void bb() {
		D.staticDo();
		int gg = new D().dd;
	}
	
}
