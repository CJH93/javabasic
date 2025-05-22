package javaStudy.day6;

import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// 날짜와 시간을 관리하는 클래스 Date, Calendar, LocalDateTime etc..
		
		// 자바에서는 시스템의 날짜와 시간을 추출해서 관리하는 객체가 있음
		
		// 클래스 패키지는 java.util 에 존재
		
		// Date now = new Date();
		long startTime = System.currentTimeMillis();
		for(int i=0; i<=1000000; i++)
		{
//			System.out.println(i);
		}
		long endTime = System.currentTimeMillis();
				
		System.out.println("백 만번 루프 소요시간 : "
		 + (endTime - startTime) + " millis");
		
		Date now = new Date();
		System.out.println(now.getTime());
		System.out.println(now.getYear());
	}

}
