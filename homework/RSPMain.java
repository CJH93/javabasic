package homework;

import java.util.Scanner;

public class RSPMain {
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		RSPAccountManagement.loadAccounts();
		mainMenu();
	}
	
	public static void mainMenu() {
		while(true) {
			System.out.println("1.로그인 2.회원가입 3.비밀번호 변경 4.전적보기 5.순위 보기 6.프로그램 종료");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1":
				RSPAccountManagement.logIn();
				break;
			case "2":
				RSPAccountManagement.signUp();
				break;
			case "3":
				RSPAccountManagement.changePw();
				break;
			case "4":
				RSPAccountManagement.viewReadBoard();
				break;
			case "5":
				System.out.println("1.승률 순위 2.총 게임 수 순위");
				String choice2 = sc.nextLine();
				if(choice2.equals("1")) {
					RSPAccountManagement.viewRanking();
					break;
				}else if(choice2.equals("2")){
					RSPAccountManagement.viewtotalGamesRanking();
					break;
				}else {
					System.out.println("잘못된 입력");
				}
			case "6":
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 입력");
			}
		}
	}
}
