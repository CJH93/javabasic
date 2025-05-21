package javaStudy.day5;

public interface DoService {

	default void def1Method() {
		System.out.println("def1 메서드의 구현부");
		defCommon();
	}
	
	default void def2Method() {
		System.out.println("def2 메서드의 구현부");
		defCommon();
	}
	
	private void defCommon() {
		System.out.println("Default method 의 코드 A");
		System.out.println("Default method 의 코드 B");
	}
	
	static void staticMethod() {
		System.out.println("static 메서드의 구현부 내용");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("static2 메서드의 구현부 내용");
		staticCommon();
	}
	
	private static void staticCommon () {
		System.out.println("Static method 의 코드 A");
		System.out.println("Static method 의 코드 B");
	} 
}
