package javaStudy.day10.annotation;



public class UseAnnotation {

	@PrintAnnotation
	void doSome1() {
		System.out.println("doSome1 내용");
	}
	
	@PrintAnnotation("*")
	void doSome2() {
		System.out.println("doSome2 내용");
	}
	
	@PrintAnnotation(value = "*", number = 30)
	void doSome3() {
		System.out.println("doSome3 내용");
	}
	
}
