package javaStudy.day8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		
//		System.out.println(hashSet);
		
		// 1 ~ 45, 6자리 랜덤 로또
				
		Set<Integer> lottoSet = new HashSet<Integer>();
		for(int i = 0; lottoSet.size() < 6; i++)
		{
			int random = (int)(Math.random() * 45) +1 ;
			lottoSet.add(random);
		}
		
		System.out.println(lottoSet);
		
		// 위 set 을 ArrayList 로 담은 후 오름차순으로 정렬
		ArrayList<Integer> list = new ArrayList<Integer>(lottoSet);
		Collections.sort(list);
		System.out.println(list);
		

	}

}
