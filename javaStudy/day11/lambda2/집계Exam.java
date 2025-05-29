package javaStudy.day11.lambda2;

import java.util.Arrays;
import java.util.List;

public class 집계Exam {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		long cnt = Arrays.stream(arr)
		.filter(value -> value % 2 == 0)
		.count();
		System.out.println(cnt);
		
		int sum = Arrays.stream(arr)
		.filter(value -> value % 2 == 0)
		.sum();
		System.out.println(sum);
		
		int maxVal = Arrays.stream(arr)
		.filter(value -> value % 2 == 0)
		.max().getAsInt();
		System.out.println(maxVal);
		
		Arrays.stream(arr)
		.filter(value -> value % 2 == 0)
		.max()
		.ifPresent(v -> System.out.println("최대값 " + v + "가 발견됨"));
		
		
		
		

	}

}
