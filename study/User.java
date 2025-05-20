package study;

// User class 정의 (Id, Password, NickName)
public class User implements Trade{
	private String Id;
	private String Password;
	private String NickName;

	public User(String Id, String Password) {
		this.Id = Id;
		this.Password = Password;
	}

	public User(String Id, String Password, String NickName) {
		this(Id, Password);
		this.NickName = NickName;
	}

	@Override
	public String toString() {
		return this.NickName;
	}
	
	public boolean login(String password)
	{
		if(Password.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// get, set

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getNickName() {
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	@Override
	public void buyItem(String item) {
		System.out.println("아이템 삽니다.");
		
	}

	@Override
	public void sellItem(String index) {
		System.out.println("아이템 팝니다.");
		
	}

	
	
	
}

/*
 * 1. 예제 (10분 / 추가 예제 포함 5분더) 회원 가입 시스템을 만들려고 하는데 이때 필요한 User Class를 정의하고자 한다.
 * 
 * User Class에 Id / Password / NickName (해당 값은 없을 수도 있음), 라는 필드가 있고, 해당 필드 값은
 * 외부에서 getter / setter 할 수 없게 만든다.(생성자를 이용한 초기화) (overload) method에선 로그인을 하는
 * 기능을 구현 하며, 리턴 타입을 boolen으로 설정한다.
 * 
 * toString() 시 닉네임을 호출하게 한다.
 * 
 * (추가 예제) 1. 각 필드의 값을 확인하는 method 추가 get(필드명)();0 (추가 예제) 2. 각 필드의 값을 변경하는 기능을
 * 추가 set(필드명)();
 * 
 * 2. 회원 가입을 실행할 main class를 만들고자 한다. 위에 정의한 User Class 를 이용하고, 회원 가입 정보를 입력 받아서
 * 클래스를 생성하고, (되도록 입력을 받는 코드로 작성 / 안되면 직접 코드에서 초기화 진행) 생성한 정보의 비밀번호를 입력 받아 로그인을
 * 가능한 코드를 작성해보자 . (15분)
 * 
 * 3. User Class를 상속 받는 Admin Class를 만들고자 한다. Admin에는 User Class를 Params을 받는
 * deleteUser라는 메서드가 존재하고, 추가적으로 필드엔 직원 번호를 가지고 있다.
 * 
 * toString() 시 닉네임을 호출하게 하되, Admin_ 값이 현재 존재하는 닉네임 앞에 붙어서 나와야한다.
 * 
 * 4. 위 admin을 사용하여, modifyNickname과 deleteUser를 호출해보자 (5분)
 * 
 * 5. 위 사용했던 user를 id, pw를 infomation이라는 추상 클래스를 하나 더 생성해 상속 받아보자. // 시간 나면 하는
 * 식으로
 * 
 */
