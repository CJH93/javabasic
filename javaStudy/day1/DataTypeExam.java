package javaStudy.day1;

/*
 * 자바의 Data Type : 일반적으로 컴퓨터 언어는 메모리에 담는 값이 타입에 따라서 데이터 타입을 엄격하게 구분 짓습니다.
 * 자바도 마찬가지 입니다.
 * 
 * 아래의 내용은 꼭 기억하세요.
 * 
 * Java 의 데이터 타입을 크게 2개로 구분하면, 반드시 Primitive Type(P type - 원시 자료형)과
 * Reference Type(객체 타입) 이 존재함. 꼭 기억!
 * 
 * 자바는 100% 객체지향 언어이기 때문에 모든 프로그래밍은 R type 으로 이뤄진다라고 생각.
 * 
 * P type 은 객체 내에서 데이터들이 연산 등을 수행할 때 사용되어진다라고 생각.
 * 
 * P type 은 다시 값의 타입에 따라서 아래로 구분됨.
 * 
 * 수치형
 *  1. 정수형 : byte(1byte), shor(2), int(4 default), long(8)
 *  2. 실수형 : float(4byte), double(8 default)
 *  수치형의 리터럴 값은 모두 기본형 타입의 메모리에 할당되어집니다.
 *  연산시의 타입 변환 : 기본적으로 자바에서는 두 변수가 연산이 되어질때, 먼저 타입 검사를 합니다.
 *  만약 타입이 기본타입 이하인 경우엔 무조건 기본타입으로 메모리를 할당, 복사 후 연산 합니다.
 *  만약 기본타입 이상의 경우엔 무조건 큰 타입으로 복사 후 연산합니다.
 *  
 * 문자형(문자 하나만 담는 타입) : char(2byte - 음수 없음, 내부적으론 정수형태를 취함 unicode 참조)
 * 
 *  boolean : true / false !! 스크립트처럼 0, 1, empty 등을 true / false 로 못담음. 그냥 true / false 만 존재.
 */

public class DataTypeExam {
	public static void main(String[] args) {
		// 리터럴을 이용한 예시
		System.out.println(10); // 내부적으로 int 메모리 할당 후 값을 대입하고 출력시킴
		System.out.println(10 + 2); // int int 를 생성 후 + 연산 결과를 출력시킴
		System.out.println("파이의 값은 " + 3.14); // 문자열객체(String) 을 생성하교, double 메모리를 생성, 값을 할당 후 문자열 + double 연산을 처리, 최종 결과가 문자열인 값을 출력시킴
		// 문자열객체(String) + 모든 data type (p and r type) 의 결과는 String 임.
		
		// 변수의 타입 : 자바에서는 값이 사용되기 전엔 그 값의 타입이 반드시 먼저 선언이 되고, 값을 대입해야 합니다.
		// 만약 타입이 틀리거나, 범위가 벗어나면 에러 입니다.
		// 변수 선언시 주의! 같은 블락 내에서 재선언 절대 불가.
		
		// 변수 선언 예시
		byte b1, b2, b3;
		int k = 10;
		
		b1 = 10; // 대입				
		byte b = 1; // 변수 초기화
		
		k = b1 + b;
		// short sh = 1 + b;
		
		//long 과 float 는 초기화시에 값 뒤에 l or L , f or F 를 넣어줘서 처음부터 메모리를 생성한다.
		long lo = 1L;
		
		System.out.println(Float.MAX_VALUE);
		
		float f = 3.14F;
		
		lo = 0xAAA; // 16진수
		System.out.println(lo);
		
		lo = 06123; // 수 앞에 0을 사용해서 8진수 표기
		System.out.println(lo);
		// 케스팅 연산자 : 작은 타입을 큰 타입으로 변환하도록 하는 연산자임.
		// 케스팅 연산자는 단항 연산자입니다. 때문에 우측항 하나에만 연산이 적용됨.
		// 사용 예 : byte bt = 1; 
		//         byte bt2 = (byte)bt + 2 (X);
		byte bt = 1; byte bt2 = (byte)(bt + 2);
		float f2 = (float)1.0;
		
		
	}
}


