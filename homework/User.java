package homework;

import lombok.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class User {
	
	private String email;
    private String password;
    private String regDate;
    private String lastLogin;
    private int win;
    private int lose;
    private int draw;
    private int total;
    
    public User(String email, String password, String regDate, String lastLogin, int win, int lose, int draw, int total) 
    {
        this.email = email;
        this.password = password;
        this.regDate = regDate;
        this.lastLogin = lastLogin;
        this.total = total;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public User(String email, String password) {
        this(email, password, now(), now(), 0, 0, 0, 0);
    }

    public static String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getEmail() {
    	return email; 
    }
    
    public String getPassword() { 
    	return password; 
    }
    
    public void setPassword(String pw) { 
    	this.password = pw; 
    }
    
    public String getRegDate() { return 
    		regDate; 
    }
    
    public String getLastLogin() {
    	return lastLogin; 
    }
    
    public void setLastLogin(String lastLogin) {
    	this.lastLogin = lastLogin; 
    }
    
    public int getTotal() {
    	return total; 
    }
    
    public int getWin() { 
    	return win; 
    }
    
    public int getLose() {
    	return lose; 
    }
    public int getDraw() {
    	return draw; 
    }

    
    public void addGame(String result) {
        total++;
        switch (result) {
            case "win": win++; 
            break;
            case "lose": lose++; 
            break;
            case "draw": draw++; 
            break;
        }
    }

    public void addStats(int total, int win, int lose, int draw) {
        total += total;
        win += win;
        lose += lose;
        draw += draw;
    }

    public double getWinRate() {
        return total == 0 ? 0 : (win * 100.0 / total);
    }

    public String toFileString() {
        return String.join(",",
                email, password, regDate, lastLogin,
                String.valueOf(total), String.valueOf(win),
                String.valueOf(lose), String.valueOf(draw));
    }

    public static User fromFileString(String s) {
        String[] arr = s.split(",");
        return new User(
            arr[0], arr[1], arr[2], arr[3],
            Integer.parseInt(arr[4]), Integer.parseInt(arr[5]),
            Integer.parseInt(arr[6]), Integer.parseInt(arr[7])
        );
    }

    public String statsString() {
        return String.format("총전적: %d, 승: %d, 패: %d, 무: %d, 승률: %.2f%%",
                total, win, lose, draw, getWinRate());
	    }
	}
