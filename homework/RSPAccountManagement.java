//package homework;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//import org.json.JSONObject;
//
//public class RSPAccountManagement {
//	private static List<RSPAccount> accounts = new ArrayList<>();
//	private static Scanner sc = new Scanner(System.in);
//	private static final String DATA_DIR = "D:\\backEnd_Workspace_Real\\javaStudy\\src\\RSPProject\\userInfo/";
//	
//	public static void loadAccounts() { // 계정 정보 불러들이는 메서드 
//		File dir = new File(DATA_DIR);
//		if(!dir.exists()) {
//			dir.mkdir();
//		}
//		
//		String email = null;
//		String passwd = null;
//		String registrationDate = null;
//		String lastLogin = null;
//		int totalGames = 0;
//		int wins = 0;
//		int losses = 0;
//		int draw = 0;
//		
//		File files[] = dir.listFiles();
//		if(files != null) {
//			for(File file : files) {
//				try(BufferedReader br = new BufferedReader(new FileReader(file))){
//					StringBuilder jsCon = new StringBuilder();
//					String line;
//					while((line = br.readLine()) != null) {
//						jsCon.append(line);
//					}
//					JSONObject jsObject = new JSONObject(jsCon.toString());
//					email = jsObject.getString("email"); //아이디
//					passwd = jsObject.getString("passwd"); //비번
//					registrationDate = jsObject.getString("registrationDate"); //가입일
//					lastLogin = jsObject.getString("lastLogin"); //마지막 로그인
//					totalGames = jsObject.getInt("totalGames"); //총 게임 수
//					wins = jsObject.getInt("wins"); //승 수
//					losses = jsObject.getInt("losses"); //패 수
//					draw = jsObject.getInt("draw"); //무승부 수
//				}catch (Exception e) {
//					e.printStackTrace();
//				}
//				
//				RSPAccount account = new RSPAccount(email, passwd, registrationDate, lastLogin); 
//				account.setTotalGames(totalGames);
//				account.setWins(wins);
//				account.setLosses(losses);
//				account.setDraws(draw);
//				accounts.add(account); // RSPA 객체 생성 후 accounts 리스트에 추가
//				
//			}
//		}
//	}
//	
//	public static void signUp() { // 회원가입
//		System.out.println("ID(email)을 입력하시오");
//		String id = sc.nextLine();
//	
//		if(!isValidEmail(id)) {
//			System.out.println("유효하지 않은 이메일 형식입니다.");
//			return;
//		}
//		
//		if(isIDExist(id)) {
//			System.out.println("이미 사용중입니다.");
//			return;
//		}
//		System.out.println("Password를 입력하시오");
//		String pw = sc.nextLine();
//		String registrationDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()); // 지금 시간을 등록시점으로 설정
//		
//		
//		RSPAccount newAccount = new RSPAccount(id,pw,registrationDate,"로그인 기록 없음");
//		accounts.add(newAccount);
//		saveUserStats(newAccount);
//		System.out.println("회원가입 성공");
//		
//		System.out.println("로그인하시겠습니까? (Y/N)");
//		String loginCheck = sc.nextLine();
//		while(true) {
//			if(loginCheck.equalsIgnoreCase("y")) {
//				logIn();
//			}else if(loginCheck.equalsIgnoreCase("n")) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}else {
//				System.out.println("잘못된값을 입력하셨습니다");
//			}
//		}	
//	}
//	
//	public static void logIn() { // 로그인
//		System.out.println("ID(email)을 입력하시오");
//		String id = sc.nextLine();
//		
//		if(!isValidEmail(id)) {
//			System.out.println("유효하지 않은 이메일 형식입니다.");
//			return;
//		}
//		
//		System.out.println("Password를 입력하시오");
//		String pw = sc.nextLine();
//		int fail = 0;
//		
//		for(RSPAccount account : accounts) {
//				if(account.getEmail().equals(id)) {
//					while(fail < 3) { // 3번까지 시도
//						if(account.getPasswd().equals(pw)) {
//							System.out.println("로그인 성공");
//							account.setLastLogin(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//							System.out.println("1. 가위바위보 게임하기 2. 전체 랭크 보기 3.프로그램 종료");
//							String choice = sc.nextLine();
//							switch(choice) {
//							case "1":
//								RSPPlay.startGame(account);
//								break;
//							case "2":
//								detailChoice();
//								break;
//							case "3":
//								System.out.println("프로그램 종료");
//								System.exit(0);
//							default:
//								System.out.println("잘못된 입력");
//							}
//						}else {
//							fail++;
//							if(fail == 3) {
//								System.out.println("3번 틀렸으므로 프로그램이 종료됩니다.");
//								System.exit(0);
//							}
//							System.out.println("비밀 번호가 틀렸습니다(남은 입력 기회 : " + (3 - fail) + "회)");
//							pw = sc.nextLine();
//						}
//					}
//				}
//		}
//		System.out.println("아이디가 틀렸습니다.");
//	}
//	
//	public static void changePw() { //비밀번호교체
//		System.out.println("ID(email)을 입력하시오");
//		String id = sc.nextLine();
//		
//		if(!isValidEmail(id)) {
//			System.out.println("유효하지 않은 이메일 형식입니다.");
//			return;
//		}
//		int fail = 0;
//		
//		for(RSPAccount account : accounts) {
//			if(account.getEmail().equals(id)) {
//				while(fail < 3){ //3번까지 시도
//					System.out.println("Password를 입력하시오");
//					String nowPw = sc.nextLine();
//					if(!account.getPasswd().equals(nowPw)) {
//						fail++;
//						System.out.println("비밀번호가 틀립니다");
//						if(fail == 3) {
//							System.out.println("3번 틀렸으므로 프로그램이 종료됩니다.");
//							System.exit(0);
//						}
//						System.out.println("비밀 번호가 틀렸습니다(남은 입력 기회 : " + (3 - fail) + "회)");
//						nowPw = sc.nextLine();
//					}
//					System.out.println("새로운 Password를 입력하시오");
//					String newPw = sc.nextLine();
//					account.setPasswd(newPw);
//					saveUserStats(account);
//					System.out.println("Password 변경 완료");
//					return;
//				}
//			}
//		}
//		System.out.println("없는 아이디 입니다.");
//	}
//	
//	//위 3개는 로그인으로 이어지게 
//	
//	public static void viewReadBoard() { // 아이디를 입력 받아 전적 검색
//		System.out.println("전적을 보고싶은 ID를 입력하시오");
//		String viewID = sc.nextLine();
//		
//		for(RSPAccount account : accounts) {
//			if(account.getEmail().equals(viewID)) {
//				account.displayStats();
//				return;
//			}
//		}
//		System.out.println("없는 아이디 입니다.");
//	}
//	
//	public static void viewRanking() { // 승률 순위 
//		accounts.sort(Comparator.comparingDouble(RSPAccount::getWinRate).reversed());
//		
//		System.out.println("승률 순위");
//		for (int i = 0; i < Math.min(accounts.size(), 10); i++) {
//            RSPAccount account = accounts.get(i);
//            System.out.printf("%d등. %s -> 승률: %.2f%%\n", i + 1, account.getEmail(), account.getWinRate());
//        }
//	}
//	
//	public static void viewtotalGamesRanking() { // 총 게임 수 순위
//		accounts.sort(Comparator.comparingInt(RSPAccount::getTotalGames).reversed()); // 총게임수
//		System.out.println("총 게임 수 순위");
//	    for (int i = 0; i < Math.min(accounts.size(), 10); i++) {
//	        RSPAccount account = accounts.get(i);
//	        System.out.printf("%d등. %s -> 총 게임 수: %d, 승률: %.2f%%\n", 
//	                i + 1, account.getEmail(), account.getTotalGames(), account.getWinRate());
//	    }
//	}
//	
//	private static void viewMyRanking() { // 내 랭킹
//		accounts.sort(Comparator.comparingDouble(RSPAccount::getWinRate).reversed()); // 내 순위
//	    for (int i = 0; i < accounts.size(); i++) {
//	    	RSPAccount account = accounts.get(i);
//	        if (accounts.get(i).getEmail().equals(account.getEmail())) {
//	            System.out.printf("내 순위: %d등. 총 게임 수: %d, 승률: %.2f%%\n", 
//	                    i + 1, account.getTotalGames(), account.getWinRate());
//	            return; // 내 순위를 찾으면 메서드 종료
//	        }
//	    }
//	}
//	
//	private static boolean isIDExist(String id) { //이메일 중복 체크 메서드
//		return accounts.stream().anyMatch(account -> account.getEmail().equals(id));
//	}
//	
//	private static boolean isValidEmail(String id) { //이메일 체크 메서드 
//		String emaliRex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
//		//Pattern pattern = Pattern.compile(emaliRex);
//		return id.matches(emaliRex);
//	}
//	
//	
//	private static void saveUserStats(RSPAccount account) { // 계정 정보 저장 메서드
//		JSONObject jsOb = new JSONObject(); 
//		jsOb.put("email", account.getEmail());
//		jsOb.put("passwd", account.getPasswd());
//		jsOb.put("registrationDate", account.getRegistrationDate());
//		jsOb.put("lastLogin", account.getLastLogin());
//		jsOb.put("totalGames", account.getTotalGames());
//		jsOb.put("wins", account.getWins());
//		jsOb.put("losses", account.getLosses());
//		jsOb.put("draw", account.getDraws());
//		jsOb.put("winRate", account.getWinRate()); //RPSAccount 객체 -> JSON 객체 전환
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter(DATA_DIR+account.getEmail()+".json",false))) {
//			bw.write(jsOb.toString(4));//4 : 인덴트 추가로 보기 편하게함.
//		}catch (Exception e) {
//			e.printStackTrace();
//		}//JSON 객체를 파일로 저장
//	}
//	
//	private static void detailChoice() { // 로그인 뒤 랭크 보기 세부메뉴
//		System.out.println("1.승률 2.총 게임 수 3.내 순위");
//		String choice = sc.nextLine();
//		
//		switch(choice) {
//		case "1":
//			viewRanking();
//			break;
//		case "2":
//			viewtotalGamesRanking();
//			break;
//		case "3":
//			viewMyRanking();
//			break;
//		case "4":
//			System.out.println("프로그램 종료");
//			return;
//		default:
//			System.out.println("잘못된 입력");
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
//
//
