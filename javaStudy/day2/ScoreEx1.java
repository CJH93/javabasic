package javaStudy.day2;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
		
		
		System.out.println(args[1]);
		/*
		 * 배열 copy
		 * 특정 배열의 값을 유지한채, 배열을 더 늘리는 경우
		 * 자바에서는 한 번 생성된 배열은 절대 크기를 변경할 수 없다.
		 * 새 배열을 생성, 기존 배열을 순회해서 값을 복사하여 넣어야 하는 번거로움 발생.
		 * 이를 해결하기 위한 API
		 */
		
		int[] oldArr = {1, 2, 3};
		
		int[] newArr = new int[100];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		// 동적가변배열 : Outer 의 길이만 생성하고, inner 배열은 필요시에 동적으로 생성하는 문법  
		
		char[][] stars = new char[10][];
		for(int i = 0; i < stars.length; i++) {
			// Outer 의 inner 로 로직을 태울때 inner 배열을 생성한다.
			// 참고로 자바 배열은 값이 들어가 공간이 생성되지 않을시 값 access 하면 예외가 발생함.
			stars[i] = new char[i + 1];
			for(int j = 0; j < stars[i].length; j++) {
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
		
		
		/*
		 * 프로그램 시작하면 이름 입력 받고, 국어, 영어, 수학 입력 받도록 하고,
		 * 만약 0 ~ 100 사이가 아니면, 다시 입력 받도록 하세요.
		 * 출력 결과는 총점, 평균, 학점(A: 80 이상, B: 70 이상, F) 출력
		 * 학점은 switch case 로 정의
		 * 결과는 00님 ...
		 * do while 사용 
		 */
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("이름 입력 : ");
//		String userName = scanner.nextLine();
//		double avg;
//		
//		String[] subject = {"국어 입력 : ", "수학 입력 : ", "영어 입력 : "};
//		int[] score = new int[subject.length + 1];
//		
//		for(int i = 0; i < subject.length; i++) {
//			do {
//				System.out.println(subject[i]);
//			score[i] = scanner.nextInt();
//			}
//			while(score[i] < 0 || score[i] > 100);
//			
//			score[subject.length] += score[i];
//		}
//		
//		System.out.println(Arrays.toString(score));
//		avg = score[subject.length]/3.0;
//		System.out.println(avg);
		
//		int kor, eng, math, total;
//		double avg;
//		char grade;
//		
//		do {
//			System.out.print("국어 점수 입력");
//			kor = Integer.parseInt(scanner.nextLine());
//		}
//		while (kor < 0 || kor > 100);
//		
//		do {
//			System.out.print("영어 점수 입력");
//			eng = Integer.parseInt(scanner.nextLine());
//		}
//		while (eng < 0 || eng > 100);
//		
//		do {
//			System.out.print("수학 점수 입력");
//			math = Integer.parseInt(scanner.nextLine());
//		}
//		while (math < 0 || math > 100);
//		
//		// 점수 입력 완료
//		
//		total = kor + eng + math;
//		avg = total / 3.0;
//		
//		switch((int)(avg / 10)) {
//		case 10:
//		case 9:
//		case 8 :
//			grade = 'A';	
//			break;
//		case 7 :
//			grade = 'B';	
//			break;
//		default :
//			grade = 'F';
//			
//		}
//
//		System.out.printf("%s님 총점: %d, 평균: %5.2f, 학점: %s", userName, total, avg, grade);
//	
//		scanner.close();
		
		}
	}
