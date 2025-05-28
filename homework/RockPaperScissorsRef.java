package homework;

import java.util.Scanner;

public class RockPaperScissorsRef {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

				

		System.out.print("가위, 바위, 보 또는 1, 2, 3 입력");
		

		String[] RPS = {"가위", "바위", "보"};
		int win = 0, lose = 0, draw = 0, total = 0;
		
		while (true) 
		{
			// 입력
			System.out.print("가위, 바위, 보 또는 1(가위), 2(바위), 3(보) 중 하나 입력");
			String userInput = sc.next();
			
			// 유저
			int userInputV = -1;
			if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3"))
			{
				userInputV = Integer.parseInt(userInput) - 1;
			}
			else if (userInput.equals("가위")) {
				userInputV = 0;
            } 
			else if (userInput.equals("바위")) {
				userInputV = 1;
            } 
			else if (userInput.equals("보")) {
				userInputV = 2;
            } 
			else {
                System.out.println("잘못된 입력. 다시 입력하세요.");
                continue;
            }
			
			// 컴퓨터
			int comV = (int) (Math.random() * 3);
			
			System.out.printf("나 : %s, 컴 : %s ", RPS[userInputV], RPS[comV]);
			
			int result = (userInputV - comV + 3) % 3;
			total++;
			
			if (result == 0) 
			{
                System.out.println("축 무승부 !!");
                draw++;
            } 
			else if (result == 1) 
			{
                System.out.println("축 승리 !!");
                win++;
            } 
			else 
			{
                System.out.println("아쉽게 패배 ㅠㅠ");
                lose++;
            }
			System.out.printf("총 전적 : %d전 %d승 %d무 %d패 \n", total, win, draw, lose);
			
			System.out.print("한 번 더 하시겠습니까? (Y/N)");
			String retry = sc.next().toUpperCase();
			
			if (retry.equalsIgnoreCase("n")) 
			{
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		
		System.exit(0);
		
	}

}
