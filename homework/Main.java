//package homework;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        UserManager userManager = new UserManager(sc);
//        Game game = new Game(sc);
//        Rank rank = new Rank();
//
//        while (true) {
//            System.out.println("\n=== 가위바위보 게임 ===");
//            System.out.println("1. 로그인");
//            System.out.println("2. 회원가입");
//            System.out.println("3. 비밀번호 변경");
//            System.out.println("4. 전적/순위 보기");
//            System.out.println("5. 프로그램 종료");
//            System.out.print("선택: ");
//            String sel = sc.nextLine().trim();
//
//            switch (sel) {
//                case "1": { // 로그인
//                    User user = userManager.login();
//                    if (user == null) break;
//                    while (true) {
//                        System.out.println("\n1. 가위바위보 게임하기");
//                        System.out.println("2. 랭크 보기");
//                        System.out.println("3. 로그아웃");
//                        System.out.print("선택: ");
//                        String s2 = sc.nextLine().trim();
//                        if (s2.equals("1")) {
//                            game.play(user);
//                        } else if (s2.equals("2")) {
//                            rank.showMenu(sc, user);
//                        } else if (s2.equals("3")) {
//                            break;
//                        } else {
//                            System.out.println("잘못된 선택입니다.");
//                        }
//                    }
//                    break;
//                }
//                case "2": // 회원가입
//                    userManager.signUp();
//                    break;
//                case "3": // 비밀번호 변경
//                    userManager.changePassword();
//                    break;
//                case "4": { // 전적/순위 보기
//                    System.out.println("1. ID로 순위 보기");
//                    System.out.println("2. 승률 TOP10");
//                    System.out.println("3. 게임수 TOP10");
//                    System.out.println("4. 돌아가기");
//                    System.out.print("선택: ");
//                    String s4 = sc.nextLine().trim();
//                    if (s4.equals("1")) {
//                        rank.showUserRankById(sc);
//                    } else if (s4.equals("2")) {
//                        rank.showWinRateRank();
//                    } else if (s4.equals("3")) {
//                        rank.showGameCountRank();
//                    }
//                    break;
//                }
//                case "5":
//                    System.out.println("프로그램을 종료합니다.");
//                    System.exit(0);
//                default:
//                    System.out.println("잘못된 선택입니다.");
//            }
//        }
//    }
//}
