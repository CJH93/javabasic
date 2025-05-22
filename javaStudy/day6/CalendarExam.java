package javaStudy.day6;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExam {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.UK);
		Locale locale = Locale.getDefault();
		
		
		System.out.println(locale);
		
//		for(Locale locale2 : locale.getAvailableLocales())
//		{
//			System.out.println(locale2);
//		}
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		Calendar gb = Calendar.getInstance(locale);
		System.out.println(gb);
		
	}

}
