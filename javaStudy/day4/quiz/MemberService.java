package javaStudy.day4.quiz;

public class MemberService {

//	private String id;
//	private String password;
	
	public boolean login(String id, String password)
	{
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
//		else {
			return false;
//		}
	}
	
	// member 객체를 파라미터로 받아서 처리하는 메서드 오버로딩
	public boolean login(Member member) {
		if(member.getId().equals("hong") && member.getPassword().equals("12345")) {
			return true;
		}
		return false;
		
	}
	
	public void logout(String id)
	{
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
	public void logout(Member member) {
		System.out.println(member.getId() + " 님이 로그아웃 함");
	}
	
	
}