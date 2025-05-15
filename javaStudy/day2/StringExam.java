package javaStudy.day2;

public class StringExam {

	public static void main(String[] args) {
		int a = 10;
		
		String str = null; // 보통 객체 초기화 값으로 null 줌.
		
		str = "안녕";
		System.out.println(str);
		
		
		// null 객체의 메서드 호출
		System.out.println(str.toString());
		
		String str2 = "안녕";
		
		if (str == str2) { // 같은 instance 인지 비교
			System.out.println("같은 객체입니다. 당연히 값도 같습니다.");
		}
		
		// 생성자를 이용해서 같은 값의 문자열 객체 생성해보기
		str2 = new String("안녕");
		if(str == str2) {
			System.out.println("같은 객체입니다. 당연히 값도 같습니다.");
		}
		else {
			System.out.println("틀린 객체입니다. 값이 같은지는 모르겠네요.");
		}
		
		// 다른 문자열 객체간의 값이 같은지를 문자열 객체의 메서드를 이용해서 알아보자
		if (str.equals(str2)) {
			System.out.println("같은 객체인지 모르지만, 값은 같네요.");
		}
		else {
			System.out.println("같은 객체인지 모르지만, 값은 틀리네요.");
		}
		
		String str3 = "ABC";
		String str4 = "abc";
		
		if (str3.equalsIgnoreCase(str4)) {
			System.out.println("같은 문자열 값(대소문자 구분 없음)");
		}
		
		System.out.println(str3.charAt(0));
		
		int leng = str4.length();
		System.out.println(leng);
		for (int i=0; i<str4.length(); i++) {
			char ch = str4.charAt(i);
			System.out.println(ch);
		} 
		
		String myName = "CJH";
		for(int i=0; i<myName.length(); i++) {
			System.out.println(myName.codePointAt(i));
			System.out.println((char)myName.codePointAt(i));
		}
		
		// concat(str) : + 와 같은 역할. 문자열을 합친 새로운 객체(instance)를 생성해서 그 ref 를 리턴시킴
		String con = myName.concat(str3);
		System.out.println(con);
		
		String myemail = "qwr123@asdf.com";
		if(myemail.endsWith(".com")) {
			System.out.println(".com 으로 끝나네요.");
		}
		
		System.out.println(myemail);
		
		System.out.println(" hello ".trim().length());
		
		/*
		 * 이메일을 입력 받아서 노가다로 검증하는 로직 작성
		 * 이메일은 @ 를 기준으로 앞은 id, 뒤는 메일 서버로 구분됩니다.
		 * 때문에 @ 를 기준으로 분리해야 하는데, 이때 subString() 을 이용하면 편리함.
		 * 분리된 이메일 ID 는 6 ~ 10 자 사이여야 하고, 반드시 영문자와, 숫자로만 구성되어야 하며,
		 * 첫 자로는 숫자가 올 수 없어야 합니다.
		 * 서버는 반드시 .com, .net, co.kr 로 끝나야 합니다.
		 * 이 조건을 검증하는 로직을 작성하고, 만약 위배시엔 어떤 조건을 위배했는지에 대한 내용을 콘솔에 찍어야합니다.
		 * ex> ID 의 첫 자는 숫자가 있음.
		 */
		
		int atidx = -1;
		String eId, emailServer;
		if(myemail.indexOf('@') != -1) {
			atidx = myemail.indexOf('@');
//			System.out.println(atidx);
			eId = myemail.substring(0,atidx).trim();
			System.out.println(eId);
			emailServer = myemail.substring(atidx + 1);
			System.out.println(emailServer);
		
			
			if(eId.length() >= 6 && eId.length() <= 12) {
				char firCh = eId.charAt(0);
				if((firCh >= 'a' && firCh <= 'z') || (firCh >= 'A' && firCh <= 'Z')) {
					for(int i=0; i<eId.length(); i++) {
						char theCha = eId.charAt(i);
						if((theCha >= 'a' && theCha <= 'z') || (theCha >= 'A' && theCha <= 'Z') || (theCha >= '0' && theCha <= '9')) {
							System.out.println("입력 성공");
							continue;
						}
						else {
							System.out.println("영문자나 숫자가 아닌 입력 값 :" + theCha);
//							return;
							// 프로그램 명시적으로 종료하는 법
							System.exit(0);
						}
					}
				} 
				else {
					System.out.println("첫 자는 반드시 영문자. 첫 문자 : " + firCh);
				}
			}
			else {
				System.out.println("ID 길이는 6 ~ 12자");
			}
		}
		else {
			System.out.println("@가 없습니다.");
			return;
		}
		
		
		
		
	}

}
