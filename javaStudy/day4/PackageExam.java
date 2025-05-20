package javaStudy.day4;

import javaStudy.day3.Animal;
import javaStudy.day3.Cat;
import javaStudy.day3.Dog;
import javaStudy.day3.Duck;
import javaStudy.day4.sub1.A;
import javaStudy.day2.*;

/*
 * 자바 package : package 란 우리가 정의한, 또는 이미 정의된 class, interface 등의 API 를 논리적 및 물리적으로 구분지어 관리하게 하는 개념
 * window 에서는 package 로 구분된 API 를 보면 folder 처럼 보이는데, 자바에서는 폴더가 아닌 패키지로 인식을 합니다.
 * 패키지는 일반적으로 논리적 이름을 . 을 구분자로 해서 API를 배치 및 관리하도록 합니다.
 * 
 * 패키지 이름은 자유롭게 지을 수 있습니다.
 * 
 * 패키지는 . 을 기준으로 나열시 (ex> fullstack.java.fundermental) fundermental 하위에 API 가 있을시에도,
 * 상위에서는 하위 API 를 가져다 쓰는 경우 반드시 패키지 명을 기술해야함.
 * 즉 일반 폴더처럼 상위 개념이 없음
 * 
 *  패키지 선언문은 반드시 코드 첫머리에 나와야 함.
 *  
 *  다른 패키지에 있는 API를 가져다 사용할때는 import 라는 키워드를 통해서 API 가 속해 있는 패키지 명을 모두 나열 후
 *  API 이름을 쓰면, import 가 되어집니다. 만약 패키지 내의 모든 API 를 import 할 경우엔 * 을 사용하면 됨.
 *  
 *  
 *  accessModifier : 접근제어자, public > protected > default > private
 *  
 *  클래스에는 public, default(package) 만 사용할 수 있고, 필드 및 메서드에서는 모두 사용가능함
 *  중복 사용은 불가하고. 반드시 하나만 사용 가능함
 *  
 *  class 에 public 이 붙을시엔 외부 패키지에서 해당 클래스를 참조(Access) 가능 하다는 의미, default 는 같은 패키지 내에서만 가능하다는 의미
 *  
 *  private . default 는 같은 패키지에서만 참조 가능하다는 의미
 *  
 *  protected 는 같은 패키지에는 모두 가능함, 단 다른 패키지에서는 반드시 상속받은 자식 클래스에서만 접근 가능하도록 제어 하는것임.
 *  이걸 두는 이유는 외부 패키지의 자식 클래스가 super 를 통해서 부모의 것을 access 할 수 있도록 하기 위해서임.
 *  
 */


public class PackageExam {
	
	public static void main(String[] args) {
		Dog dog = null;
		Cat cat = null;
		ArrayEx arr = null;
		Animal animal = null;
		
		A a = null;
		
		Duck duck = null;
		duck = new Duck(null, null);

	}

}
