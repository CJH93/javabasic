package javaStudy.day4.quiz;

public class UseMemberService {

	public static void main(String[] args) {
		Printer pt = new Printer();
		pt.println(false);
		Printer.println(new Object());
		
		
		// Member 객체 생성
		
		Member me = new Member();
		me.setName("JH");
		me.setAge(33);
		me.setId("hong");
		me.setPassword("12345");
		
		MemberService memService = new MemberService();
		if(memService.login(me)) 
		{
			System.out.println(me.getName() + "님이 로그인 되었음");
		}
		else
		{
			System.out.println("아이디나 비밀번호 틀림");
		}
		
		memService.logout(me);
		
//		boolean res = memService.login(me);
//		if(res) 
//		{
//			System.out.println(me.getName() + "님이 로그인 되었음");
//		}
//		else 
//		{
//			System.out.println("아이디 혹은 패스워드 틀림");
//		}

	}

}
