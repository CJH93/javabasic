package javaStudy.day11.lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalExam {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
//		double avg = list.stream()
//		.mapToDouble(Integer::intValue)
//		.average()
//		.getAsDouble();
		
//		OptionalDouble optionalDouble = list.stream()
//		.mapToDouble(Integer::intValue)
//		.average();
//		
//		if(optionalDouble.isPresent())
//		{
//			System.out.println("평균 : " + optionalDouble.getAsDouble());		
//		}
//		else
//		{
//			System.out.println("값 없음");
//		}
		
		double avg = list.stream()
		.mapToDouble(Integer::intValue)
		.average()
		.orElse(0.0);
		System.out.println(avg);
		
		list.stream()
		.mapToDouble(Integer::intValue)
		.average()
		.ifPresent(value -> System.out.println(value));


	}

}
