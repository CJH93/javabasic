package javaStudy.day10.annotation;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Retention : 어노테이션이 유지되는 범위를 지정
 * - SOURCE : 컴파일시 적용 -> 컴파일 후 어노테이션 제거
 * - CLASS : 메모리에 로딩될 때 적용 -> 로딩 후 어노테이션 제거
 * - RUNTIME : 실행시에 적용 -> 계속 유지
 *  
 */

@Data
@NoArgsConstructor
public class Member {
	
	private String id;
	private String name;
	private int age;
	
	
	
	
}
