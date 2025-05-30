//package homework;
//
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class UserManager {
//    private Scanner sc;
//
//    public UserManager(Scanner sc) {
//        this.sc = sc;
//    }
//
//    public boolean isValidEmail(String email) {
//        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", email);
//    }
//
//    public User signUp() {
//        System.out.print("이메일 입력: ");
//        String email = sc.nextLine().trim();
//        if (!isValidEmail(email)) {
//            System.out.println("이메일 형식이 올바르지 않습니다.");
//            return null;
//        }
//        if (FileUtil.userExists(email)) {
//            System.out.println("이미 존재하는 이메일입니다.");
//            return null;
//        }
//        System.out.print("비밀번호 입력: ");
//        String pw = sc.nextLine().trim();
//        User user = new User(email, pw);
//        FileUtil.saveUser(user);
//        System.out.println("회원가입 완료! 가입일: " + user.getRegDate());
//        return user;
//    }
//
//    public User login() {
//        for (int i = 0; i < 3; i++) {
//            System.out.print("이메일 입력: ");
//            String email = sc.nextLine().trim();
//            if (!isValidEmail(email)) {
//                System.out.println("이메일 형식이 올바르지 않습니다.");
//                continue;
//            }
//            System.out.print("비밀번호 입력: ");
//            String pw = sc.nextLine().trim();
//            User user = FileUtil.loadUser(email);
//            if (user != null && user.getPassword().equals(pw)) {
//                String prevLogin = user.getLastLogin();
//                user.setLastLogin(User.now());
//                FileUtil.saveUser(user);
//                if (user.getTotal() == 0) {
//                    System.out.println("첫 로그인! 가입일: " + user.getRegDate());
//                } else {
//                    System.out.println("마지막 로그인: " + prevLogin);
//                }
//                return user;
//            } else {
//                System.out.println("로그인 실패. 다시 시도하세요.");
//            }
//        }
//        System.out.println("3회 실패. 프로그램 종료.");
//        System.exit(0);
//        return null;
//    }
//
//    public void changePassword() {
//        User user = login();
//        if (user == null) return;
//        System.out.print("새 비밀번호 입력: ");
//        String newPw = sc.nextLine().trim();
//        if (newPw.equals(user.getPassword())) {
//            System.out.println("이전 비밀번호와 동일합니다. 변경 불가.");
//            return;
//        }
//        user.setPassword(newPw);
//        FileUtil.saveUser(user);
//        System.out.println("비밀번호 변경 완료! 다시 로그인 해주세요.");
//    }
//}
