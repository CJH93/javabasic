package homework;

import java.util.Scanner;

public class RSPPlay {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void startGame(RSPAccount userAccount) { // 가위바위보 게임 시작
        System.out.println("가위바위보 게임을 시작합니다.");
        boolean gameRun = true;

        while (gameRun) { //gameRun이 true 인 동안 실행
            System.out.println("가위(0), 바위(1), 보(2) 중 하나를 입력해 주세요");
            String userChoice = sc.nextLine();

            if (checkValue(userChoice)) {
                userChoice = convertUserChoice(userChoice);
                ComRSP cChoice = new ComRSP();
                String comChoice = cChoice.getComRSP3(); // 0, 1, 2 문자열로 받아옴
                
                String result = RSPLogic.result(userChoice, comChoice); // 결과
                userAccount.updateStats(result); // 통계 업데이트
                userAccount.displayStats(); // 통계 출력

                System.out.println("다시 하시겠습니까? (y/n)");
                while (true) {
                    String replay = sc.nextLine();
                    if (replay.equals("n")) {
                        System.out.println("게임 종료");
                        gameRun = false;
                        System.exit(0); // 프로그램 종료
                    } else if (replay.equals("y")) {
                        System.out.println("게임을 다시 시작합니다.");
                        break;
                    } else {
                        System.out.println("잘못된 값입니다. 다시 입력하세요 (y/n)");
                    }
                }
            }else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }

    private static String convertUserChoice(String userChoice) {
        switch (userChoice) {
            case "가위":
                return "0";
            case "바위":
                return "1";
            case "보":
                return "2";
            default:
                return userChoice; // 잘못된 경우는 그대로 반환
        }
    }

    public static boolean checkValue(String userChoice) {
        return userChoice.equals("가위") || userChoice.equals("0") ||
               userChoice.equals("바위") || userChoice.equals("1") ||
               userChoice.equals("보") || userChoice.equals("2");
    }
}
