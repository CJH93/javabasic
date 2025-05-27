//package homework;
///*
// * 가위바위보 게임 : 이 클래스에서 시작을 하고, 3개 이상의 클래스를 정의해서 완성하기.
// * 
// * 게임 룰 : 게임 시작 출력후 Id(Email) 및 password 를 입력하라고 한 뒤, 본인의 email 과 password 가 아니라면 메세지와 함께 종료. // 클래스 하나 생성
// * 인증이 되었을 시, 기존 룰대로 입력을 받고(가위 ,바위 ,보) 컴퓨터의 랜덤한 입력값과 승부 후 결과를 출력.(ex > 컴 : 가위, 나 : 보 컴 승리)
// * 이후 계속 할건지에 대한 질문을 출력하고 y/n 으로 결정 
// * 게임이 끝나면 총 전적과 승률을 출력시키고 게임 종료
// * 
// * ※Final 확장
// * 게임 시작시 1.로그인 2.회원가입 3.비밀번호 변경 4.전적보기 5.순위 보기 라는 메뉴 등장 
// * 
// * 
// * 1 선택시 ID와 비밀번호를 입력받고 로그인을 검증 ID 는 이메일형식이며 회원가입한 모든사람은 이메일ID로 자신만의 파일 생성 암호는 파일 내부에 있으며 가져와서 인증
// *  
// * 인증이 3번 틀릴시 프로그램은 종료되고 인증이 완료되면 마지막 로그인 로그를 출력한 뒤(시간 및 날짜), 1.가위바위보 게임하기 2.랭크 보기 메뉴 등장
// *  
// * 1 선택시 게임 시작되고 한판 종료시마다 계속할지 여부를 물음 그만할 시, ID 의 전적이 합산 누적되어 파일에 저장됨 (총전적, 승, 패, 무, 승률) 이후 프로그램 종료
// *  
// * 2 선택시 1.승률 보기 2.총 게임수 보기 3.내 순위 보기 메뉴 등장
// *  
// * 3번을 제외한 결과는 10명의 플레이어를 순위로 나오게 함 
// * ex> 1등 aa@bb.com -> 승률 : 95% 2등 / cc@dd.com -> 승률 : 85% ...10등 ~ 
// * 2번 선택시 게임수 순위로 나타냄
// *  
// * 랭크를 보고 난 뒤 게임을 할 것인지 여부를 묻고 한다고 하면 게임을 진행 안한다 하면 프로그램 종료
// *  
// * 첫 메뉴 2번인 회원가입을 선택시 email, password 를 받아 사용자 파일 생성 이때 ID 중복 체크를 하여 없는 경우에만 생성. 생성 파일에는 가입일자, 암호가 저장됨
// *  
// * 이후 로그인을 유도 한 뒤 로그인 한다고 할 시 1번이랑 동일 공정으로 빠지게 처리. 첫 로그인은 이전 로그인 기록대신 가입 시간을 출력
// *  
// * 3번은 로그인을 먼저 한 뒤 신규비번을 입력받아 변경 단 이전 비번과 동일하게 설정하는것 못하게 할것 완료시 로그인 한 뒤랑 똑같게
// *  
// * 4번 선택시 ID 를 입력받고 순위가 몇위인지를 출력 단 ID 없을시 메인메뉴로 
// *  
// * 5번 선택시 위와 동일하게 순위표 등장
// */
//import java.util.Scanner;
//
//public class RSPMain {
//	private static Scanner sc = new Scanner(System.in);
//	
//	
//	public static void main(String[] args) {
//		RSPAccountManagement.loadAccounts();
//		mainMenu();
//	}
//	
//	public static void mainMenu() {
//		while(true) {
//			System.out.println("1.로그인 2.회원가입 3.비밀번호 변경 4.전적보기 5.순위 보기 6.프로그램 종료");
//			String choice = sc.nextLine();
//			
//			switch(choice) {
//			case "1":
//				RSPAccountManagement.logIn();
//				break;
//			case "2":
//				RSPAccountManagement.signUp();
//				break;
//			case "3":
//				RSPAccountManagement.changePw();
//				break;
//			case "4":
//				RSPAccountManagement.viewReadBoard();
//				break;
//			case "5":
//				System.out.println("1.승률 순위 2.총 게임 수 순위");
//				String choice2 = sc.nextLine();
//				if(choice2.equals("1")) {
//					RSPAccountManagement.viewRanking();
//					break;
//				}else if(choice2.equals("2")){
//					RSPAccountManagement.viewtotalGamesRanking();
//					break;
//				}else {
//					System.out.println("잘못된 입력");
//				}
//			case "6":
//				System.out.println("프로그램 종료");
//				System.exit(0);
//			default:
//				System.out.println("잘못된 입력");
//			}
//		}
//	}
//}
