package javaStudy.day11.lambda2;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * T -> R 로 되돌려 주는 기능의 mapTo...();
 * 
 */

@AllArgsConstructor
@Data
class Product{
	private int price;
	private String name;
}
public class MapToFuncEx {

	public static void main(String[] args) {
	
		List<Product> list = Arrays.asList(new Product(1000, "삼성 TV"), new Product(20000, "LG 에어컨"));
		
		list.stream()
		.map(t -> t.getName()) // String
		.forEach(t -> System.out.println(t));
		System.out.println();
		
		list.stream()
		.map(t -> t.getPrice()) // int
		.forEach(t -> System.out.println(t));
		System.out.println();

		list.stream()
		.map(t -> t) // Object
		.forEach(t -> System.out.println(t));
		System.out.println();

		list.stream()
		.mapToDouble(t -> t.getPrice()) // DoubleStream
		.forEach(t -> System.out.println(t));
		System.out.println();
		
	}

}
