package javaStudy.day2;

import java.util.Scanner;

/*
 * 아래의 로직에 맞게 코드를 작성하세요.
 * 수 세 개를 입력 받습니다. 이 수를 작은 수 --> 큰 수로 나열
 * ex> 2, 5, 1 입력, 1 <= 2 <= 5
 * ex> 1, 3, 5 ==> 1 <= 3 <= 5
 * ex> 5, 4, 1 ==> 1 <= 4 <= 5
 * 
 * TIP : 변수 4개 필요
 * 
 */

public class SortingExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int temp;
		
		System.out.print("첫 번째 수 입력하세요.");
		String first = scanner.nextLine();
		System.out.print("두 번째 수 입력하세요.");
		String second = scanner.nextLine();
		System.out.print("세 번째 수 입력하세요.");
		String third = scanner.nextLine();
		
		int intFir = Integer.parseInt(first);
		int intSec = Integer.parseInt(second);
		int intThi = Integer.parseInt(third);
		
		// 가장 큰 수를 찾아서 third 변수에 담기
		// 변수에 다른 값이 들어가면 기존 값을 덮어버림
		// 기존 값을 보관, temp 변수 사용
		
		if (intFir >= intSec && intFir >= intThi) {
			temp = intThi;
			intThi = intFir;
			intFir = temp;
		}
		
		else if (intSec >= intFir && intSec >= intThi) {
			temp = intThi;
			intThi = intSec;
			intSec = temp;
		}
		
		if (intFir >= intSec) {
			temp = intSec;
			intSec = intFir;
			intFir = temp;
		}
		
		System.out.printf("%d <= %d <= %d", intFir, intSec, intThi);
				
		scanner.close();
	}
}
