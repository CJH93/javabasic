package study;

public interface Trade {
	
	void buyItem(String item);
	
	void sellItem(String index);
}

/*
 * 5월 20일자 입니당.

어제 못하셨던 분들은 어제 코드 2,4번 푸시면되고, 하셨던 분들은 아래 문제 함 만들어보세용 

1. User 간의  거래하는 인터페이스인 Trade라는 인터페이스 상속받고자 한다.

인터페이스엔 해당 메서드가 있다. 

void buyItem(String item);

void sellItem(String index);

User필드에는 소유하고있는 ItemList 라는 목록을 추가하고
두 유저 간에 아이템을 거래할 수 있는 기능을 구현해보자

2. 실제 거래하는 코드를 작성해보자

화이팅! 
 */