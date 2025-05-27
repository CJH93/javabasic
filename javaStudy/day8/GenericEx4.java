package javaStudy.day8;

/*
 * 특정 타입의 하위 타입으로 제한을 시키는 방법 
 * T extends SuperType 이렇게 선언하면, 반드시 Super 의 하위 타입으로만
 * 객체를 발생시킬 수 있음
 * 
 */

class Person {
	
}

// 우리반 학생들
class MyStudent extends Person {
	
}

// 학원 전체 학생들
class AcademyStudernt extends Person {
	
}

// 상담하러 온 학생들
class NormPerson extends Person {
	
}

// 위 학생들을 타입으로 갖는 클래스 정의
class PersonGen<T> {
	public T kind;
	
	public PersonGen (T kind) {
		this.kind = kind;
	}
	
}

public class GenericEx4 {
	
	// 오직 숫자 타입의 값만 파라미터로 제한 시킬 수 있도록 타입을 제한
	public static <T extends Number> boolean compare(T t1, T t2){
		System.out.println("비교 : (" + (t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName()) + ")");
	
	
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return(v1 == v2);
	}
	
	public static void doSome(PersonGen <? extends Person> pGen) {
		System.out.println(pGen.getClass());
	}
	
	public static void doSome2(PersonGen <? super AcademyStudernt> pGen) {
		System.out.println(pGen.getClass());
	}
		
	
	public static void main(String[] args) {

		boolean res = compare(1, 2);
		System.out.println(res);
		
		res = compare(3.14, 3);
		System.out.println(res);
		
		MyStudent st1 = new MyStudent();
		doSome(new PersonGen<Person>(st1));
		doSome2(new PersonGen<Person>(st1));
		

	}

}
