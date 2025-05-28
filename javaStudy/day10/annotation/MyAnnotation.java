package javaStudy.day10.annotation;

public @interface MyAnnotation {

	// 아래는 어노테이션의 기능을 선언
	String prop1();
	int prop2() default 1; // 이 메서드의 기본 값을 1로 주겠다는 의미
	
	
}
