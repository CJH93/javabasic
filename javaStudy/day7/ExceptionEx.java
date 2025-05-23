package javaStudy.day7;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수 입력");
		
		int fir = Integer.parseInt(sc.next());
		
		System.out.println(fir / 0);
		
		System.out.println("GGGGG");

	}

}
