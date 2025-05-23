package javaStudy.day6;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

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


//		TimeZone zone = null;
		TimeZone zone = TimeZone.getTimeZone("Europe/Monaco");
//		for(String z : TimeZone.getAvailableIDs())
//		{
//			System.out.println(z);
//		}
		
		// 선택한 나라의 이름으로 calendar 객체 생성
		
		Calendar monaco = Calendar.getInstance();
		monaco.setTimeZone(zone);
		
		System.out.println(monaco);
		
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		int apm = now.get(Calendar.AM_PM);
		int h = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("" + y + (m+1) + date + (apm == 0? "오전" : "오후") + h + min);
		
		Calendar xMas = Calendar.getInstance();
		xMas.set(Calendar.MONTH, 11);
		xMas.set(Calendar.DATE, 25);
		System.out.println(xMas);
		
		int remain = xMas.get(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(remain);
		
		// 현재를 mills 로 리턴 받아서 변수에 담아보세요
		long nowMillis = now.getTimeInMillis();
//		System.out.println(nowMillis);
		// 위 값을 기준으로 DATE 객체 생성
		Date nowDate = new Date(nowMillis);
		System.out.println(nowDate);
		
		// now 에서 Date 객체를 리턴하는 메서드
		Date get = now.getTime();
		System.out.println(get);
		
		
		// 날짜의 값을 특정 포맷으로 변경해주는 클래시 SimpleDateFormat 을 API 로 찾아보세요. java.text
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM 월 dd 일 a h:mm분 입니다.");
		String r = sdf.format(nowDate);
		
		System.out.println(r);
		
		// LocalDateTime 객체 얻어내기
		LocalDateTime ldtNow = LocalDateTime.now();
		
		System.out.println(ldtNow);
//		sdf = new SimpleDateFormat("yy.MM.dd HH:mm. 입니다.");
//		System.out.println(sdf.format(ldtNow));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm분 입니다.");
		
		System.out.println(ldtNow.format(formatter));
		
		
		
		
	}

}
