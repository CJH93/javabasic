package javaStudy.day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.Arrays;

public class ReaderWriterEx1 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		// 파일에 관련된 모든 정보를 관리하는 File 객체 사용
		File file = new File("InputEx1_back.java");
		
		fr = new FileReader(file);
		
		char buffer[] = new char[200];
		int data;
		
		while((data = fr.read(buffer)) != -1)
		{
			System.out.print(Arrays.toString(buffer));
		}
		fr.close();
		
		fr = new FileReader("D:\\spread\\myLog.log", Charset.forName("ISO-8859-1"));
		fr.read(buffer);
		System.out.println(Arrays.toString(buffer));
		fr.close();
	}

}
