package javaStudy.day10.io;

import java.io.File;
import java.io.IOException;

/*
 * File 객체. File 및 Folder 의 정보를 관리하는 객체
 * 많은 메서드를 이용해서 파일의 정보를 관리할 수 있다. 
 * 폴더, 파일 등 모든 File 을 객체로 생성, 메서드를 이용해서 폴더, 파일 여부를 확인할 수 있음.
 * 
 */

public class FileExam {

	public static void main(String[] args) throws IOException {

		// 폴더 또는 파일을 생성만 할 수 있음. 
		// read/write 는 반드시 스트림을 통해야만 함
		File parent = new File("D:" + File.separator + "rootFolder");
		File subFolders = new File(parent, "sub" + File.separator + "f1");
		
		String thePath = subFolders.getAbsolutePath();
		File file = new File(thePath, "asdf.asd");

		
		if(!parent.exists())
		{
			parent.mkdir();
		}
		else
		{
			System.out.println(subFolders.mkdirs());
		}
		file.createNewFile();
		
		System.out.println(file.getName());
		
		int pos = file.getName().lastIndexOf(".");
		String fileName = file.getName().substring(0, pos);
		String surfix = file.getName().substring(pos + 1);
		System.out.println(fileName);
		System.out.println(surfix);
		
		System.out.println(file.length());
		// System.out.println(file.delete());
		
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		// 같은 경로에 어떤 것이 있는지 리턴 받음
		File[] files = parent.listFiles();
		for(File f : files)
		{
			System.out.println(f.isDirectory() ? "폴더" : "파일");
			System.out.println(f.isFile());
			System.out.println(f.delete());
									
		}
		
		System.out.println(file.lastModified());
		
		
		
	}

}
