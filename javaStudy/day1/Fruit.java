package javaStudy.day1;

public class Fruit {
	public static void main(String[] args) {
		
		// Fruit.class 를 아래처럼 정의하세요.
		// main 내부에
		// 아래의 로직을 정의 하고, 결과를 출력 시키세요.
		/*
		 * 여러분이 과수원을 한다라고 가정합니다.
		 * 재배 과일로는 사과, 배, 오렌지가 있고, 각각 하루에 3, 5, 3 개씩 생산이 되어집니다.
		 * 과수원의 하루 총 생산량(과일합산) 을 출력하고, 시간당 생산량을 출력시키세요.
		 * 단 아래의 조건을 모두 만족해야 합니다.
		 * 
		 * 1. 최대한의 변수를 활용하세요.
		 * 2. 시간당 결과는 소숫점으로 나올겁니다.
		 * 3. 한 번의 리터럴과, 한 번의 케스팅 연산을 사용하세요.
		 * 
		 */
		
//		int Apple = 3;
//		int Pear = 5;
//		int Orange = 3;
		
		int Apple, Pear, Orange;
		Apple = 3; Pear = 5; Orange = 3;
				
		int Total = Apple + Pear + Orange;
		
		System.out.println(Total);
		
		
		float TotalH = (float)(Total/24.0);
		
		
		System.out.println(TotalH);
		
		// char 데이터 타입 : 2byte 이며 유니코드 테이블의 문자셋을 문자로 표현한다.
		// 음수가 없는 형태이기 때문에 (문자테이블은 0 부터 시작)
		// 일반 수치형 데이터 타입의 같은 메모리 타입과는 호환이 불가능함.
		// 단 int 형과는 호환됨. 즉 promotion 및 casting 됨. (음수 제외)
		
		char ex = '노'; // char 는 문자 하나만 담을 수 있음. ''로 묶음. 
		
		String sung = "최"; 
		System.out.println(sung.codePointAt(0));
		
		char ch1 = '\uAbcd';
		System.out.println(ch1);
		
		char codeCh = 12335;
		System.out.println(codeCh);
		
		//short sh = codeCh; 메모리가 같아도 범위가 달라 호환 불가.
		int theCh = codeCh; // int 는 호환 가능
		System.out.println(theCh);
		System.out.println((char)theCh);
		
		// boolean 타입 : true / false 만 갖는 타입, 다른 타입으로 케스팅 불가.
		boolean theFlag = false; // 조건이나 루프 등에서 사용되는 타입.
		System.out.println("\"\'\\\n\t하하");
		
				
		// promotion : casting 의 반대 개념
		// 작은 타입을 큰 타입에 대입하는 것. 특별한 문제 없이 변환 됨.
		
		int it = 1;
		long ln = it; // 프로모션
		float fl = ln;
		double dl = fl;
		
		// 출력문 형태 알아보기.
		// System.out.print("모든 p r type 및 void 가 아닌 메서드 호출 가능"); 결과 출력 후 커서 맨 마지막 위치
		// System.out.println("위와 같지만 라인 개행 및 맨 처음으로 커서 이동");
		
		System.out.print("누군가..");
		System.out.println("이건 개항");
		System.out.println("gggg");
		
		// printf() : 특정 format 대로 문자열을 출력 시키는 출력문. 형식은 아래와 같음
		// print("format문자열", 값1, 값2, ...)
		// format 문자열의 형식(format) 은 다음과 같음
		/*
		 * [값의 순번 $], [flage(-,0)], [width(전체자릿수)], [.precision(소수 자릿수)], conversion(변환 문자)
		 * 
		 * 위 메서드가 나온 이유는 기존 println() 에서는 특정 형식대로 출력을 만들 수가 없기 때문. (ex> 소수점 2자리까지만 출력 하는 등의, ..)
		 * JDK 1.5 부터 C 의 그것과 똑같은 기능의 메서드 제공.
		 * 
		 * 주의사항!! [] 은 optional 하기 때문에 줘도 그만 안줘도 그만. 만약 줄 경우엔 반드시 패턴에 따른 값을 처리 해야함.
		 * 하지만, conversion 은 반드시 존재 해야함.
		 * conversion 문자는 d(정수), f(실수), s(문자열) 이 올 수 있다.
		 * 
		 */
		
		String name = "JH";
		int age = 33;
		
		System.out.println("이름은 " + name + " 나이는 " + age);
		
		System.out.printf("이름은 %s", name);
		System.out.printf("나이는 %d\n", age);
		
		System.out.printf("이름: %1$s 나이: %2$d", name, age);
		
		// 컨버전 형태
		/*
		 * 정수(d) : %d : 일반정수표기
		 * %자리수d : 자릿수 정수. 왼쪽 빈자리 공백
		 * %-자리수d : 자릿수 정수. 오른쪽 빈자리 공백
		 * %0자리수d : 자릿수 정수. 왼쪽 0으로 채움.
		 * 
		 * 실수(f) : %f
		 * %10.2f : 소수점 2자리까지(반올림 아님),
		 * 
		 * 문자열(s) : %s
		 * %자리수s : 자릿수 길이의 문자열, 공백으로 채움.
		 * %% : %채움.
		 * 
		 */
		System.out.println();
		int value = 123;
		System.out.printf("상품 가격 %6d원\n", value);
		System.out.printf("상품 가격 %-6d원\n", value);
		System.out.printf("상품 가격 %06d원\n", value);
		
		double pi = Math.PI;
		System.out.println(pi);
				
		System.out.printf("파이값(10자리소수이하2자리 : %10.2f\n", pi);
		System.out.printf("파이값(10자리소수이하2자리 : %010.2f", pi);
		System.out.println();
		
		String no = "김";
		String man = "승민";
		
		System.out.printf("Mr. 질문맨..%-10s | %10s", no, man);
		
		
		
	}
}
