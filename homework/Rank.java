//package homework;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Rank {
//    public void showMenu(Scanner sc, User user) {
//        while (true) {
//            System.out.println("\n=== 랭킹 메뉴 ===");
//            System.out.println("1. 승률 TOP10");
//            System.out.println("2. 게임수 TOP10");
//            System.out.println("3. 내 순위 보기");
//            System.out.println("4. 돌아가기");
//            System.out.print("선택: ");
//            String sel = sc.nextLine().trim();
//            switch (sel) {
//                case "1": showWinRateRank(); break;
//                case "2": showGameCountRank(); break;
//                case "3": showMyRank(user); break;
//                case "4": return;
//                default: System.out.println("잘못된 선택입니다.");
//            }
//        }
//    }
//
//    public void showWinRateRank() {
//        List<User> all = FileUtil.loadAllUsers();
//        all = all.stream().filter(u -> u.getTotal() > 0)
//                .sorted(Comparator.comparingDouble(User::getWinRate).reversed())
//                .limit(10).collect(Collectors.toList());
//        System.out.println("--- 승률 TOP10 ---");
//        int rank = 1;
//        for (User u : all) {
//            System.out.printf("%d등 %s -> 승률: %.2f%% (%d전)\n",
//                    rank++, u.getEmail(), u.getWinRate(), u.getTotal());
//        }
//    }
//
//    public void showGameCountRank() {
//        List<User> all = FileUtil.loadAllUsers();
//        all = all.stream().sorted(Comparator.comparingInt(User::getTotal).reversed())
//                .limit(10).collect(Collectors.toList());
//        System.out.println("--- 게임수 TOP10 ---");
//        int rank = 1;
//        for (User u : all) {
//            System.out.printf("%d등 %s -> %d전, 승률: %.2f%%\n",
//                    rank++, u.getEmail(), u.getTotal(), u.getWinRate());
//        }
//    }
//
//    public void showMyRank(User user) {
//        List<User> all = FileUtil.loadAllUsers();
//        all = all.stream().filter(u -> u.getTotal() > 0)
//                .sorted(Comparator.comparingDouble(User::getWinRate).reversed())
//                .collect(Collectors.toList());
//        int idx = 1;
//        boolean found = false;
//        for (User u : all) {
//            if (u.getEmail().equals(user.getEmail())) {
//                System.out.printf("내 승률 순위: %d위 (%.2f%%)\n", idx, u.getWinRate());
//                found = true;
//                break;
//            }
//            idx++;
//        }
//        if (!found) System.out.println("아직 게임 전적이 없습니다.");
//    }
//
//    public void showUserRankById(Scanner sc) {
//        System.out.print("ID(이메일) 입력: ");
//        String email = sc.nextLine().trim();
//        if (!FileUtil.userExists(email)) {
//            System.out.println("존재하지 않는 ID입니다.");
//            return;
//        }
//        User user = FileUtil.loadUser(email);
//        List<User> all = FileUtil.loadAllUsers();
//        all = all.stream().filter(u -> u.getTotal() > 0)
//                .sorted(Comparator.comparingDouble(User::getWinRate).reversed())
//                .collect(Collectors.toList());
//        int idx = 1;
//        boolean found = false;
//        for (User u : all) {
//            if (u.getEmail().equals(user.getEmail())) {
//                System.out.printf("%s의 승률 순위: %d위 (%.2f%%)\n", email, idx, u.getWinRate());
//                found = true;
//                break;
//            }
//            idx++;
//        }
//        if (!found) System.out.println("아직 게임 전적이 없습니다.");
//    }
//}
//
