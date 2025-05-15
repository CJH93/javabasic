package javaStudy.day2;

import java.util.Arrays;

/*
 * 자바 배열 : 자바에서 배열은 객체
 * 배열은 반드시 객체 변수가 있어야 하고, 인스턴스를 생성하는 코드를 new 연산자를 이용해서 생성해야 한다는 듯.
 * 배열은 P R 모든 타입을 index 의 값으로 저장할 수 있습니다.
 * 이 때 이 값을 기준으로 배열을 생성시에 타입을 반드시 명기해야 하는데, 같은 타입이거나 큰 타입으로 타입을 선언 해야함.
 * 만약 큰 타입으로 선언하게 되면, 내부에 들어가는 값은 해당 타입으로 promotion 되어져서 들어가게 됩니다.
 * 배열은 객체이기 때문에 배열 index 의 값이 R type 인 경우엔, 해당 instance 의 reference 가 값으로 들어가게 됩니다.
 * 자바의 배열은 매우 엄격하게 관리 되어짐. 예를 들어 스크립트의 경우, 배열의 값을 동적으로 넣고 빼고 할 수 있지만(undefined 로 처리되는 경우 포함),
 * 자바의 배열은 위의 경우를 모두 예외로 인식하여 에러를 발생시킴.
 * 
 * 필수! 기본 객체 : 모든 객체를 default 로 생성하게 되면, 그 내부 속성의 값은 모두 각 타입의 default 값으로 초기화 되어져서 생성됨.
 * 
 * 배열을 예로 들면, 만약 int 타입으로 빈 배열(배열의 크기만 지정)을 생성하면, 각 index 의 값은 정수의 기본값인 0으로 초기화되어져 들어갑니다. 
 */

public class ArrayEx {

	public static void main(String[] args) {
		// 배열의 문법 알아보기
		// 문법 1. 크기만 지정하고 값은 기본 값으로 배열 생성
		int intArr[] = new int[3]; // size 가 3 인 기본배열 생성
		
		// 배열 객체의 상태(hash code)를 출력해봅시다
		// 모든 클래스에는 toString() 이 존재. 이 메서드는 내가 호출하건 안하건,
		// 객체를 출력문에 찍으면 무조건 시스템이 자동 호출함.
		System.out.println(intArr);
		
		for(int i = 0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		// 없는 index 접근
		// System.out.println(intArr[3]);
		
		// 문법 2. 배열의 값을 초기화 하는 배열 생성
		double dArr[] = {1, 2, 3};
		
		System.out.println(dArr[0]);
		for(int i = 0; i<dArr.length; i++) {
			int v = (int)dArr[i];
			System.out.println(v);
		}
		
		// 향상된 for
		// 컬렉션 등에도 사용됨.
		// 향상된 for 구문은 위 자료형들의 길이에 맞게 자동으로 loop 를 돌면서 값을 리턴해주는 for 구문.
		for(double dVal: dArr) {
			System.out.println(dVal);
		}
		
		// Array(배열) 의 모든 정보(속성) 및 기능을 정의한 클래스를 통해서 배열의 정볻를 얻어낼 수 있음.
		// 그 클래스 이름은 java.util.Arrays
		System.out.println(Arrays.toString(dArr));
		
		// 중요! java.lang 패키지에 있는 애들은 import 를 하지 않아도 되지만,
		// 다른 이름은 무조건 사용전에 import 라는 키워드를 통해 패키지를 가져와야 합니다.
		String str = "";
		
		// 문법 3. 1번과 2번을 합친 형태
		// 이 배열식은 동적으로 배열을 생성할때 사용됨. 특정 문법에서는 이 방법만 쓸 수 있을 때가 있음.
		// 지금은 문법만 기억
		String strArr[] = new String[] {"hi", "there", "here"};
		
		/*
		 * 2중 배열. 배열 내부에 배열을 갖는(참조) 배열을 뜻함
		 */
		// 문법 1: 2 * 3 의 다중 배열 생성
		
		int[] multi[] = new int[2][3];
		
		// 문법 2: 배열 초기화
		int[][] m2 = {{1, 2, 3, 100}, {4, 5, 6, 200}, {7, 8, 9, 300}}; // new m2[3]
		System.out.println(Arrays.toString(m2));
		
		System.out.println(m2[1][1]);
		
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2[i].length; j++) {
				System.out.println(m2[i][j]);
			}
		}
		
		
		
		
		
		
		
	}

}
