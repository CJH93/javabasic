package javaStudy.day8;

import java.util.List;

import lombok.Data;

class TheBox{ 
	// 박스 내부의 필드는 객체를 나타냄
	// 이 박스에는 여러가지 다른 타입들이 들어감
	// 따라서 최상위 타입인 Object 로 변수를 선언
	public Object obj;
	public Object count;
}

// 제네릭 표식은 클래스명 끝에 함
// 타입을 VM 이 동적으로 매핑 해주기 때문에 실제 타입명이 아니라, 키워드 사용
// A ~ Z 까지 어떤 문자를 사용해도 좋지만, 직관적인 키워드로 Type 은 T 로 사용하는 것이 좋음
// T 가 내부 필드의 타입으로 자동 저장됨
@Data
class TheGenericBox<T>{
	public T theItem;
	
	public T get() {
		return theItem;
	}
	
	public void set(T theItem) {
		this.theItem = theItem;
	}
}

public class GenericEx1 {

	public static void main(String[] args) {
		
		TheBox box = new TheBox();
		box.obj = "신발";
		box.count = Integer.valueOf(2); // Integer
		
		String theItem = (String)box.obj;
		
		TheGenericBox<String> tgBox = new TheGenericBox<String>();
		tgBox.theItem = "명품옷";
		String cloth = tgBox.theItem;
		
		// Elements
		List<String> list = null;
		
	}

}
