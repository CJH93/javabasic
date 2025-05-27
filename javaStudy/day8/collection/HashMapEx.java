package javaStudy.day8.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * key, value 로 객체를 관리하는 Map interface
 * 대표적인 구현체로는 HashMap 이 있음.
 * Map 은 키 중복을 불허하고, 값 중복은 허용함
 *  
 */

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "일");
		map.put(2, "이");
		map.put(3, "삼");
		
		// get
		// Map 또한 hash 코드를 기반으로 객체 관리를 하기 때문에 index 가 없음
		// 때문에 전체 순회를 할 수 없음. 타입 변환을 해야만 가능
		
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		System.out.println(entry);
		Iterator it = entry.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
