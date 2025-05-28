package javaStudy.day10.annotation;

import java.lang.reflect.Method;

/*
 * Annotation : @ 으로 시작되는 명령문을 통틀어 말함
 * 이 명령문은 클래스, 인터페이스를 컴파일, 실행할 때 어떻게 처리할지를 알려주는 설정 정보
 * 
 * 목적
 * 1. 컴파일시 사용하는 정보 전달
 * 2. 빌드들이 코드를 자동으로 생성하도록 정보 전달
 * 3. 실행 시 특정 기능을 처리해야 할 때 정보 전달
 * 
 * 어노테이션은 자바에서는 필수 정보. 잘 알고 사용하는데 문제가 없어야함.
 * 우리가 직접 정의할 일은 거의없음. (많은 어노테이션이 이미 제공이 되어 있기 때문)
 *  
 */

@MyAnnotation(prop1 = "2")
public class AnnotationEx1 {

	@MyAnnotation(prop1 = "3")
	String str;
	
	@YourAnnotation
	public static void main(String[] args) {
		
		Class cls = UseAnnotation.class;
		System.out.println(cls);
		
		Method[] method = cls.getDeclaredMethods();
		
		for(Method m : method)
		{
			PrintAnnotation printAnnotation = m.getAnnotation(PrintAnnotation.class);
			System.out.println(printAnnotation);
		}

	}

}
