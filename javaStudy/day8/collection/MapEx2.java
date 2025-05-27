package javaStudy.day8.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("재형", 93);
		map.put("민우", 94);
		map.put("동신", 96);
		map.put("은별", 03);
		map.put("성남", 96);

		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) 
		{
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 출생년도 : " + e.getValue());
		}
		
		Set<String> keys = map.keySet();
		Collection<Integer> value = map.values();
		
		System.out.println("학생 명단 : " + keys);
		Iterator<Integer> valueIt = value.iterator();
		while(valueIt.hasNext())
		{
			System.out.println(valueIt.next());
		}
		
		// Collections 의 메서드를 이용한 최고 최저 값 산출
		System.out.println(Collections.max(value));
		System.out.println(Collections.min(value));
		
	}

}
