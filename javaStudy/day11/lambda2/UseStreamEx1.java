package javaStudy.day11.lambda2;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
 * 컬렉션을 스트림으로 변경하면, 스트림에서 제공하는 다양한 연산 메서드를 활용할 수 있다.
 * 중간집계 및 최종 처리 함수 등이 대표적
 * 주의! 중간집계 함수를 사용하는 경우엔 반드시 최종 처리 함수를 사용해야함
 * 그렇지 않으면 중간집계 함수가 제대로 처리되지 않음
 *  
 */

@Data
//@Builder
@AllArgsConstructor
class Student{
	private int score;
	private String name;
	private int jo;
}

public class UseStreamEx1 {

	public static void main(String[] args) throws Exception {
		
//		Arrays.asList(Student.builder().name("CJH").score(100).build());
		List<Student> list = Arrays.asList(new Student(85, "AA", 3), new Student(60, "BB", 2), new Student(100, "CC", 1));
		
		
		
		double avg = list.stream()
		.mapToInt(student -> student.getScore())
		.average()
		.getAsDouble();
		System.out.println(avg);
		
		list.stream()
		.forEach(s -> System.out.println(s));

		
//		Stream<Student> stream = list.stream();
//		
//		IntStream intStream = stream.mapToInt(student -> student.getScore());
//		
//		OptionalDouble optionalDouble = intStream.average();
//		double avg = optionalDouble.getAsDouble();
//		
//		System.out.println("평균 " + avg);
		
		Arrays.stream(new int[] {1, 2, 3, 4, 5})
		.forEach(v -> System.out.println(v));
		
		IntStream.rangeClosed(1, 100)
		.forEach(v -> System.out.println(v));
		
		// 파일로부터 스트림을 얻어내서 출력
		Path path = Paths.get(UseStreamEx1.class.getResource("mydata.dat").toURI());
		
		Stream<String> stream = Files.lines(path);
		stream.forEach(t -> System.out.println(t));
		stream.close();
		
	}

}
