//계정
package homework;

import lombok.Data;

@Data //getter, setter 생성
public class RSPAccount {
	private String email; // 이메일
	private String passwd; // 패스워드
	private String registrationDate;
	private String lastLogin;
	private int totalGames = 0; // 총 게임 수
	private int wins = 0; // 승
	private int losses = 0; // 패
	private int draws =0; // 무
	
	public RSPAccount(String email, String passwd, String registrationDate, String lastLogin) {
		this.email = email;
		this.passwd = passwd;
		this.registrationDate = registrationDate;
		this.lastLogin = lastLogin;
	}
	
	public String toString() {
		return "Id: " + email + "\nPassword: " + passwd;  
	}
	
	public double getWinRate() {
		return totalGames> 0 ? (double)wins / totalGames * 100 : 0;
	}
	
	public void updateStats(String result) { // 승 패 무 추가 
        totalGames++;
        switch (result) {
            case "승":
                wins++;
                break;
            case "패":
                losses++;
                break;
            case "무":
                draws++;
                break;
        }
    }

    public void displayStats() { // 매 게임이 끝날때마다 전적을 보여줌
        System.out.println("총 게임 수: " + totalGames);
        System.out.println("승: " + wins);
        System.out.println("패: " + losses);
        System.out.println("무: " + draws);
        if (totalGames > 0) {
            double winRate = (double) wins / totalGames * 100;
            System.out.printf("승률: %.2f%%\n", winRate);
        } else {
            System.out.println("승률: 0.00%");
        }
    }

	
}
