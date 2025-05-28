package javaStudy.day10.lambda;

import java.util.stream.IntStream;

/*
 * 자바의 람다 : 익명객체 구현식을 람다로 표현
 * 
 * 자바에서 람다는 인터페이스의 일종으로 선언 및 취급
 * 단, 람다인터페이스에는 반드시 하나의 메서드만 선언할 수 있음.
 * 하나 이상이 되면 일반 인터페이스로 간주됨
 * 또한 이 인터페이스는 람다용이라는 의미를 컴파일러에게 알려줘야 하며,
 * 문법 검사를 하게 요청. @FunctionalInterface 라는 어노테이션을 선언하기도 함 (옵셔널이기 때문에 안해도 상관은 없지만 대부분 선언)
 *  
 */

@FunctionalInterface
interface MyInterface
{
	void doSome();
}
public class LambdaEx1 {
	
	static void doSome1(MyInterface my)
	{
		my.doSome();
	}
	
	static MyInterface getMyInterface()
	{
//	{
//		MyInterface myInter = new MyInterface() {
//			
//			@Override
//			public void doSome() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
	MyInterface myInter = () -> System.out.println("hi there");
		return myInter;
	}

	public static void main(String[] args) {
	
		MyInterface yours = () -> System.out.println("hi here"); 
		
		// MyInterface 의 익명 객체를 생성
		MyInterface my = new MyInterface() {
			
			@Override
			public void doSome() {
				System.out.println("hi here there over there");						
			}
		};
		
		MyInterface his = getMyInterface();
		
		my.doSome();
		yours.doSome();
		his.doSome();
		
		doSome1(yours);
		doSome1(new MyInterface() {
			
			@Override
			public void doSome() {
				System.out.println("Hello World");
			}
		});
		
		doSome1(() -> System.out.println("Hello Servlet World"));
		
		
	}

}
