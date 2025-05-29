package javaStudy.day11.lambda2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaEx2 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("AA");
		set.add("BB");
		set.add("CC");
		set.add("DD");

		Stream<String> stream = set.stream();
		stream.forEach(ele -> System.out.println(ele));
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Stream<Integer> stream2 = list.parallelStream();
		stream2.forEach(t -> System.out.println(t + " : " + Thread.currentThread().getName()));
		
		
		
		
		
		
	}

}
