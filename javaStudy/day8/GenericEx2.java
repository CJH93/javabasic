package javaStudy.day8;

import java.util.List;

import lombok.Data;

@Data // 유지기간이 있음, 컴파일 및 실행시까지 이 코드들을 유지하는 어노테이션
class BoxItems<K, M>{
	private K kind;
	private M model;
	
	
}

class TV {
	
}

class WrapTop {
	
}

public class GenericEx2 {

	public static void main(String[] args) {
		
		BoxItems<TV, String> item1 = new BoxItems<TV, String>();
		item1.setKind(new TV());
		item1.setModel("삼성 스마트 티비 85인치");
		
		BoxItems<WrapTop, String> item2 = new BoxItems<WrapTop, String>();
		item2.setKind(new WrapTop());
		item2.setModel("갤럭시 북 360");
		
		TV tv = item1.getKind();
		String model = item1.getModel();
		
		WrapTop wrapTop = item2.getKind();
		String model2 = item2.getModel();
		
		
		
	}

}
