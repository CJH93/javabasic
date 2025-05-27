package javaStudy.day9;

import java.util.*;

	 class Student implements Comparable {
		 
	 String name;
	 int ban;
	 int no;
	 int kor, eng, math;
	 
	 Student(String name, int ban, int no, int kor, int eng, int math) {
		 this.name = name;
		 this.ban = ban;
		 this.no = no;
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
	 }
	 
	 int getTotal() {
		 return kor + eng + math;
	 }
	 
	 float getAverage() {
		 return (int)((getTotal() / 3f) * 10 + 0.5)/10f;
	 }
	 
	 public String toString() {
		 return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
	 + "," + getTotal() + "," + getAverage();
	 }

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	 
	 
	 // 크면 1 같으면 0 작으면 -1
}
