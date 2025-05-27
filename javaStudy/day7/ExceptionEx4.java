package javaStudy.day7;

import javax.swing.JOptionPane;

/*
 * 다중으로 예외 핸들링을 통한 예외 제어 
 */

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		String msg = "가위(1) 바위(2) 보(3) 아무거나 입력";
		String input = JOptionPane.showInputDialog(msg);
		String inStr = null;
		int inValue = -1;
		
		try
		{
			inValue = Integer.parseInt(input);
		}
		
		catch (Exception e)
		{
			inStr = input;		
		}
		

	}

}
