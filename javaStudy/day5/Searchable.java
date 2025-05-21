package javaStudy.day5;

// 인터넷 검색 기능을 가진 인터페이스 정의

public interface Searchable {
	
	// interface 내의 메서드는 자동으로 public abstract 가 컴파일시 추가
	void search(String url);
	
}
