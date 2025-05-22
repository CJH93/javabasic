package javaStudy.day6;

class Person
{
	int juminNo;
	
	public Person(int juminNo)
	{
		this.juminNo = juminNo;
	}
	
	// equals 를 오버라이드 해서 주민번호가 같으면 true 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
		{
			return this.juminNo == ((Person)obj).juminNo;
		}
		else
		{
			return false;
		}
	}
	
}

public class ObjectExam {

	public static void main(String[] args) {
		
		// 내가 만든 클래스 객체의 특정 값이 같은지를 알려고 할때 equals 를 오버라이드 하면 편함
		Person p1 = new Person(100); 
		Person p2 = new Person(100);
		
		System.out.println(p1.equals(p2));
		
		

		// Object 의 toString() 의 정의된 내용을 구현
		// 이 클래스의 모든 정보를 담고 있는 Class 객체 얻어내기
		Object theObj = new ObjectExam();
		Class cls = theObj.getClass();
		String clsName = cls.getName();
		int hash = theObj.hashCode();
		System.out.println(clsName + "@" + Integer.toHexString(hash));
		System.out.println(theObj.toString());
		
		// object 의 equals 는 두 객체의 hash 가 같은지 비교함
		// 즉 같은 객체인지만 확인
		
		Object theObj2 = theObj; // new ObjectExam();
		
		System.out.println(theObj);
		System.out.println(theObj2);
		
		if(theObj.equals(theObj2))
		{
			System.out.println("같은 객체");
		}
		else
		{
			System.out.println("틀린 객체");
		}
		
		
		
	}

}
