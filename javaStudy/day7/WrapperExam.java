package javaStudy.day7;

/*
 * 래퍼 클래스 : 자바의 P type 을 클래스로 정의한 것
 * p 타입을 객체로 만들거나, 객체 내의 값을 parse 할때 사용
 *  
 */

public class WrapperExam {

	public static void main(String[] args) {
		System.out.println(Character.isAlphabetic('z'));
		System.out.println(Character.isDigit('5'));
		
		// int 의 모든 정보 Interger
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// 오토 박싱 & 언박싱. int 타입의 값이 자동으로 객체화 되거나 일반변수화 되는 과정
		Integer ig = 1; // 오토 박싱
		Integer ig2 = Integer.valueOf("1.0");
		
		int res = ig + 1; // 오토 언박싱
		
		
		
		

	}

}
