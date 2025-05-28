package javaStudy.day10.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		
		// 로그 파일을 읽어서 콘솔에 출력
		String logFile = "D:\\spread\\myLog.log";
		
		File f = new File(logFile);
		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		
		File dest = new File("asdf.txt");
		FileWriter fw = new FileWriter(dest);
		PrintWriter pw = new PrintWriter(fw);
		
		if(f.exists())
		{
			// br = new BufferedReader((new FileReader(new File(logFile))));
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			lr = new LineNumberReader(br);
			String lines = null;
			
			while((lines = lr.readLine()) != null)
			{
				pw.println(lr.getLineNumber() + ". " + lines);
				pw.flush();
//				System.out.println(lr.getLineNumber() + ". " + lines);
//				new PrintWriter(new File("test.text")).println(lines);
			}
			br.close(); // close 는 맨 하위 객체의 하나만 호출하면 나머지는 자동으로 호출됨
			pw.close();
		}
		else
		{
			System.out.println("파일을 다시 확인해보세요");
		}
		
	}
}
