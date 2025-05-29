package homework;

import lombok.Data;

@Data
public class User {
	
	// 아이디(이메일), 비밀번호,
	
	private String id;
	private String pass;
	
	private int win = 0;
	private int lose = 0;
	private int draw = 0;
	private int total = 0;
	

}
