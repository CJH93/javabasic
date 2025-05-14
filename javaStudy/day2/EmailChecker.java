package javaStudy.day2;

import java.util.Scanner;

public class EmailChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 입력해 : ");
		
		String email = sc.nextLine();
		
		String id, server;
		int atidx;
		if(email.indexOf('@') != -1) {
			atidx = email.indexOf('@');
			
			server = email.substring(atidx+1);
			id = email.substring(0,atidx).trim();
			
			if(id.length() >= 6 && id.length() <=12) {
				//첫자 검증하기,,첫자를 추출해서 알파벳검사하기
				char firCh = id.charAt(0);
				if((firCh >= 'a' && firCh <= 'z') || (firCh >= 'A' && firCh <= 'Z')) {
					//첫자 검증통과 되었으니, ID 전체를 검증합시다....for 가 필요함..
					for(int i = 1; i<id.length(); i++) {
						char theCha = id.charAt(i);//두번째 문자부터 검증시작..
						if((firCh >= 'a' && firCh <= 'z') || 
								(firCh >= 'A' && firCh <= 'Z') || (firCh >= '0' && firCh <= '9')) {
							//ID 통과됨..
							break;
						}else {
							System.out.println("영문자나 숫자가 아닌게 들어감 확인해..니꺼--> " + theCha);
							//프로그램은 명시적으로 종료하는 법
							System.exit(0);
						}
					}
					
				}else {
					System.out.println("첫자는 반드시 영문자 여야함..너의 첫문자 : " + firCh);
				}
			}else {
				System.out.println("ID 길이는 반드시 6 ~ 12 여야함");
			}
			
		}else {
			System.out.println("@ 없는 이메일은 존재 하지 않음..프로그램 종료");
			return;
		}
		
		//서버검증해주기..
		
	}

}
