package study;

public class Admin extends User{

	private int num;
	public Admin(String id, String pass , String nickname, int num) {
		super(id, pass, nickname);
		this.num = num;
	}
	
	
	public void deleteUser(User user)
	{
		user.setId(null);
		user.setPassword(null);
		user.setNickName(null);
	}
	
	@Override
	public String toString() {
		
		return "Admin_" + super.getNickName();
	}
	
	public static void main(String[] args) {
		Admin admin = new Admin("", "", "", 1);
	}
	
	
	
}



/* 
 * 3. User Class를 상속 받는 Admin Class를 만들고자 한다. Admin에는 User Class를 Params을 받는
 * deleteUser라는 메서드가 존재하고, 추가적으로 필드엔 직원 번호를 가지고 있다.
 * 
 * toString() 시 닉네임을 호출하게 하되, Admin_ 값이 현재 존재하는 닉네임 앞에 붙어서 나와야한다.
 * 
 * 4. 위 admin을 사용하여, modifyNickname과 deleteUser를 호출해보자 (5분)
 * 
 * 5. 위 사용했던 user를 id, pw를 infomation이라는 추상 클래스를 하나 더 생성해 상속 받아보자. // 시간 나면 하는
 * 식으로
 */
 