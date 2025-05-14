package javaStudy.day1;

/*
 * 자바 연산자 : 자바스크립트와 완전 같음.
 * 몇 가지 차이가 있는 것만 확인
 * 
 */

public class OpExam {
	
	public static void main(String[] args) {
		
		// 정수형의 오버플로우, 언더플로우
		// 오버플로우는 정수에 선, 후행 연산이 가해진 후 지정된 범위의 값을 넘어설 때 발생하는 오류를 뜻함.
		// 하나의 예를 들면, byte 의 max 값은 127. 만약 128을 byte 에 초기화 하면 에러.
		// 하지만, 127을 담고, 이후 선후행 증가 연산을 하게 되면, 오버플로우가 발생되어서,
		// -128로 변환 됨. 이러한 형태를 잘 알고 사용해야함.
		
		byte bb = 125;
		for(int i = 0; i<5; i++) {
			bb++;
			System.out.println("bb->" + bb);
		}
		
		// 정확한 계산은 정수로 하세요. float 은 부동소수점으로 처리하기 때문에 값이 변할 가능성이 있습니다.
		
		int apple = 1;
		// double pieceUnit = 0.1;
		int totalP = apple * 10;
		int number = 7;
		
		// double result = apple - number * pieceUnit;
		double result = totalP - number;
		
		// System.out.println("사과 1개에서 남은 양: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);
		
		/*
		 * == 연산자. p type 끼리의 연산시엔 값이 같은지를 물어보고, true / false 를 리턴.
		 * r type 끼리 물어보면 같은 객체 즉, Reference 가 같으면 true 아니면 false 를 리턴함.
		 */
		int total = 0;
		for(int i = 0; i<=100; i++) {
			if (i % 3 == 0) {
				total += i;
			}
		}
		System.out.println(total);
		
		while(true) {
			int dise1 = (int)(Math.random() * 6) + 1;
			int dise2 = (int)(Math.random() * 6) + 1;
			
			int diseSum = dise1 + dise2;
			
			if(diseSum == 5) {
				System.out.printf("%1$d, %2$d", dise1, dise2);
				break;
			}
		}
		
		
		// 중첩 for, 4x + 5y = 60 
		// x, y 10 이하의 자연수
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(4 * x + 5 * y == 60) {
					System.out.println(x + " : " +  y);
					
				}
			}
		}
		
		
		// for 문을 이용
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();	
		}
		
		
		
//		for(int i = 65; i <= 90; i++) {
//			char num1 = (char)i;
//			for(int j = 90; j >= 65; j--) {		
//			char num2 = (char)j;
//			char = (char)(num1 + num2);
//			}
//			
//		}
		
		char end = 'Z';
		for(char cc = 'A'; cc <= 'Z'; cc++) {
			for(char ddd = cc; ddd <= end; ddd++ ) {
				System.out.print(ddd);
			}
			end--;
			System.out.println();
		}
		
		
		
		
		
		
	}	
}
