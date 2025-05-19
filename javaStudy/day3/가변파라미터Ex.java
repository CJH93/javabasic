package javaStudy.day3;

/*
 * 메서드 파라미터의 가변파라미터 적용해보기
 * 기존에는 메서드의 파라미터에 반드시 타입 변수명, 타입 변수명... 으로 해야 했지만,
 * 같은 타입의 변수가 가변(갯수가 일정하지 않을시)시에 가변 파라미터를 사용할 수 있다. 
 */

class MyCom{
	// 파라미터의 값의 합을 구하는 메서드 정의
	int sum(int ... values) { // 파라미터 표식자가 가변을 뜻함
		// 위 가변 파라미터는 배열처럼 적용이 되어져서, length 속성을 이용할 수 잇음
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	int findNumber(int num) {
		// 리턴타입이 있는 메서드에서는 return 문을 만나면 거기서 코드가 종료됩니다.
		if(num == 1) {
			return 1;
		}
		else if(num == 2) {
			return 2;
		}
		return 3;
	}
}

public class 가변파라미터Ex {

	public static void main(String[] args) {
		MyCom mc = new MyCom();
		int res1 = mc.sum(1, 2, 3);
		
		int res2 = mc.sum(1, 2, 3, 4, 5);
		
		// 배열을 파라미터로 줄 수도 있음
		int[] val = {10, 20, 30};
		int res3 = mc.sum(val);
		
		int res4= mc.sum(new int[] {100, 200, 300, 400});
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);

	}

}
