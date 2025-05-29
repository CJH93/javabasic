package javaStudy.day11.lambda2;

import java.util.Arrays;

public class MatchsExam {

	public static void main(String[] args) {
		
		int[] inArr = {2, 4, 6, 10};
		
		boolean res = Arrays.stream(inArr)
				.allMatch(value -> value % 2 == 0);
		System.out.println(res);
		
		res = Arrays.stream(inArr)
				.anyMatch(value -> value % 3 == 0);
		System.out.println(res);
		
		res = Arrays.stream(inArr)
				.noneMatch(value -> value % 3 == 0);
		System.out.println(res);

	}

}
