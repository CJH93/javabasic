package javaStudy.day9;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/*
 * 특정 파일의 Path 및 정보를 관리하는 Paths
 * 이 객체의 get() 을 이용, 파일의 Path 객체를 리턴 시킨 후,
 * Path 객체의 메서드를 이용해서 원하는 정보를 get 할 수 있다.
 * 
 *  기존에는 File 을 이용했지만, 요즘엔 Paths, Path 도 많이 이용함.
 *  
 */

public class PathsExam {

	public static void main(String[] args) {
		
		// Path 는 Interface 이므로 반드시 Paths 를 통해서 객체를 get 할 수 있음.
		Path path = Paths.get("D:\\backEnd_Workspace_Real\\javaStudy\\src\\javaStudy\\day10\\io\\BufferedReaderEx.java");
		
		System.out.println(path.getFileName());
		System.out.println(path.getParent().getFileName());
		System.out.println("중첩 경로수 : " + path.getNameCount());
		
		System.out.println();
		for(int i = 0; i < path.getNameCount(); i++)
		{
			System.out.println(path.getName(i));
		}
		
		System.out.println();
		Iterator<Path> it = path.iterator();
		while(it.hasNext())
		{
			Path thePath = it.next();
			System.out.println(thePath.getFileName());
		}
		
		System.out.println();
		System.out.println(path.getRoot());

	}

}
