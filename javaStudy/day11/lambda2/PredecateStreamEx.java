package javaStudy.day11.lambda2;

import java.util.ArrayList;
import java.util.List;

/*
 * 스트림 내의 요소를 검사(test) 해서 조건에 해당하는 결과를 얻어내는데 사용되는 함수
 * 이를 주로 이용하는 Stream 은 filter 나, distinct 등의 메서드를 사용하게 된다.
 *  
 */

public class PredecateStreamEx {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(100);
		
		list.stream()
		.distinct() // 중복 제거
		.forEach(t -> System.out.println(t));
		System.out.println();
		
		// 특정요소 걸러내기
		list.stream()
		.distinct()
		.filter(t -> {
			return (t > 2 && t < 100);
		})
//		.filter(t -> t > 3)
		.forEach(t -> System.out.println(t));
		
		
		
		

	}

}
