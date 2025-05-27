package javaStudy.day9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class WriterEx1 {
	
	private static final String DIST_FOLDER_NAME = "D:\\spread";

	public static void main(String[] args) throws IOException {
		// D:\ 폴더를 동적으로 생성하고 그 하위에 콘솔에 입력한 내용을 파일에 저장
		// File 및 Folder 에 관련된 모든 작업은 File 객체가 함
		
		// 프로그램을 시작하면 해당 폴더가 있는지 조회
		File disFolder = new File(DIST_FOLDER_NAME);
		
		// (폴더에 "") 파일 생성
		File logFile = new File(disFolder, "myLog.log");
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd a hh:mm.ss");
		
		boolean stop = false;
		
		Charset charset = Charset.forName("ISO-8859-1");
		System.out.println(charset);
		
		if(disFolder.exists())
		{
			System.out.println("해당 폴더 존재함");
		}
		else
		{
			System.out.println("폴더 없음. 생성하실?");
			int res = (char)System.in.read();
			if(res == 'y')
			{
				disFolder.mkdir();
				System.out.println(disFolder.getAbsolutePath() + " 에 폴더 생성됨.");
			}
		}
		System.out.println("콘솔에 하고 싶은 말 입력. 종료하려면 Q or q 입력");
		
		fw = new FileWriter(logFile, charset, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String input = null;
		
		while(!stop)
		{
			System.out.println(">> ");
			input = sc.next();	
			if(input.equalsIgnoreCase("q")) stop = true;
			// 로깅날짜 write
			bw.write(sdf.format(now.getTime()) + " : ");
			bw.write(input);
			bw.newLine();
		}
		bw.flush();
		bw.close();

	}

}
