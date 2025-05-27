//가위바위보 룰
package homework;

public class RSPLogic {
	//가위 : 0 바위 : 1 보 : 2
	public static String result(String comChoice, String userChoice) {
		
		if(comChoice.equals(userChoice)) { // 둘의 결과가 같다면
			System.out.println("무승부");
			return "무";
		}else if(userChoice.equals("0")) { // 유저 가위
			if(comChoice.equals("1")){
				System.out.println("컴: 바위 유저: 가위, 패배");
				return "패";
			}else if(comChoice.equals("2")){
				System.out.println("컴: 보 유저: 가위, 승리");
				return "승";
			}
		}else if(userChoice.equals("1")) { // 유저 바위
			if(comChoice.equals("2")){
				System.out.println("컴: 보 유저: 바위, 패배");
				return "패";
			}else if(comChoice.equals("0")){
				System.out.println("컴: 가위 유저: 바위, 승리");
				return "승";
			}
		}else if(userChoice.equals("2")) { // 유저 보
			if(comChoice.equals("0")){
				System.out.println("컴: 가위 유저: 보, 패배");
				return "패";
			}else if(comChoice.equals("1")){
				System.out.println("컴: 바위 유저: 보, 승리");
				return "승";
			}
		}
		return "";
	}
}
