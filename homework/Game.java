package homework;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
			
	    Scanner sc = new Scanner(System.in);
	    
	    int win = 0;
    	int	lose = 0;
    	int draw = 0;
    	int total = 0;
    	String[] RPS = {"가위", "바위", "보"};
	    
    	System.out.print("가위, 바위, 보 또는 1, 2, 3 입력");
    	
	    while (true) {
	    	System.out.print("가위, 바위, 보 또는 1, 2, 3 입력");
	        String input = sc.next();
	        
	        String computer = randomRPS();
	        String result = judge(input, computer);
	        
	        // 결과 처리 및 출력
	        total++;
	        if (result.equals("win")) 
	        {
	        	System.out.println("축 승리!");
	        	win++;
	        }
	        else if (result.equals("lose")) 
	        {
	        	System.out.println("패배 ㅠㅠ");
	        	lose++;
	        }
	        else
        	{
	        	System.out.println("무승부!");
	        	draw++;
        	}
	        
	        System.out.print("계속 하시겠습니까? (Y/N): ");
	        
	        if (!sc.next().equalsIgnoreCase("Y"))
	        	break;
	    }
	    
	    user.updateStats(total, win, lose, draw);
	    FileUtil.saveUser(user);
	    System.out.println("전적: " + user.getStats());
		    
	}
}



//private Scanner sc;
//private static final String[] RPS = {"가위", "바위", "보"};
//private Random ran = new Random();
//
//public Game(Scanner sc) {
//  this.sc = sc;
//}
//
//private String randomRPS() {
//  return RPS[ran.nextInt(3)];
//}
//
//private String judge(String user, String com) {
//  if (user.equals(com)) return "draw";
//  if ((user.equals("가위") && com.equals("보")) ||
//      (user.equals("바위") && com.equals("가위")) ||
//      (user.equals("보") && com.equals("바위"))) {
//      return "win";
//  }
//  return "lose";
//}
//
//public void play(User user) {
//  int win = 0, lose = 0, draw = 0, total = 0;
//  while (true) {
//      System.out.print("가위/바위/보 입력: ");
//      String input = sc.nextLine().trim();
//      if (!input.equals("가위") && !input.equals("바위") && !input.equals("보")) {
//          System.out.println("잘못된 입력입니다.");
//          continue;
//      }
//      String comp = randomRPS();
//      String result = judge(input, comp);
//      System.out.printf("컴퓨터: %s, 나: %s => %s\n", comp, input,
//              result.equals("win") ? "승리!" : (result.equals("lose") ? "패배!" : "무승부!"));
//      total++;
//      switch (result) {
//          case "win": win++; break;
//          case "lose": lose++; break;
//          case "draw": draw++; break;
//      }
//      System.out.print("계속 하시겠습니까? (Y/N): ");
//      String yn = sc.nextLine().trim();
//      if (!yn.equalsIgnoreCase("Y")) break;
//  }
//  user.addStats(total, win, lose, draw);
//  FileUtil.saveUser(user);
//  System.out.println("게임 종료! 내 전적: " + user.statsString());
//}
//}


