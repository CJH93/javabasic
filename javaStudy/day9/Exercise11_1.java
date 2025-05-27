package javaStudy.day9;

import java.util.*;

public class Exercise11_1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		/*
		 * 다음은 정수 집합과의 교집합 차집합 합집합을 구하는 코드
		 * 1,2,3,4 3,4,5,6 , ,
		 * 다코드를 완성하여 실행 결과와 같은 결과를 출력하시오.
		 *  [Hint] 클래스의 API를 사용하라 
		 *  ArrayList addAll(), removeAll(), retainAll() . 
		 */
		
		// 교
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		// 차
		cha.addAll(list1);
		cha.removeAll(list2);
		
		// 합
		hap.addAll(list1);
		hap.removeAll(kyo);
		hap.addAll(list2);
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
		
		
	}

}
