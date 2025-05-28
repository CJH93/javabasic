package javaStudy.day10.io;

import java.io.File;

public class FileDelExam {

	//폴더와 파일 정보를 주면 해당 하위의 모든 파일들을 지우고, 자신도 지우도록 정의
//	public static void delete(File dir, String ext)
	public static void delete(File dir)
	{
		// 먼저 해당 폴더의 모든 파일을 get
		File[] files = dir.listFiles();
		
		// 순회하면서 폴더가 있는지 찾아내기
		for(int i = 0; i < files.length; i++)
		{
			if(files[i].isDirectory())
			{
				// 폴더 찾음. 따라서 해당 폴더로 다시 들어가도록 함
//				delete(files[i], ext);
				delete(files[i]);
				
			}
			files[i].delete();
		}
	}
//			else
//			{
//				// 폴더가 없기 때문에 확장자를 기준으로 삭제 작업함
//				String fileName = files[i].getAbsolutePath();
//				
//				if(fileName.endsWith(ext))
//				{
//					System.out.println(fileName);
//					if(files[i].delete())
//					{
//						System.out.println("삭제 성공");
//					}
//					else
//					{
//						System.out.println("삭제 실패");
//					}
//				}
//			}
//		}
//	}
	public static void main(String[] args) {
		
//		delete(new File("D:\\rootFolder"), ".java");
		delete(new File("D:\\rootFolder"));

	}

}
