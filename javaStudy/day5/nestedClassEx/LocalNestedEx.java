package javaStudy.day5.nestedClassEx;

/*
 * 지역 클래스 : 지역(local) 이라는 말은 중첩되는 클래스를 
 * Outer 클래스의 메서드 내부에 정의 하는 것을 말함.
 * 즉 local 은 메서드를 뜻함
 * 지역 클래스가 하는 일이 특정 메서드에 국한되어서 메서드가 호출될때만 수행하고 사라지게 하기 위함.
 * 이런 지역 중첩 클래스도 생성자, 필드, 메서드를 정의할 수 있음.
 * 단, 이 클래스가 수행하는 일은 지역내에서 객체를 생성하고 수행하여야 함.
 * 
 * 참고로 jdk 17 이전에는 local 내부에는 정적필드, 메서드가 올 수 없었으나 이후 가능해짐
 * 
 */

public class LocalNestedEx {

	void localMethod(final int a) {
		// 지역클래스에서 사용하는 메서드의 변수는 묵시적으로 final 임
		// 때문에 값을 변경하게 되면 무조건 에러
		class LocalCls {
			
			int f1 = 1;
						
			static int sf2 = 2; // jdk 17 부터 가능해짐
			
			void method1() {
//				a = f1;
				
				System.out.println(a);
				
				System.out.println("지역클래스의 method1 내용");
			}
		}
		new LocalCls().method1();
	}
}
