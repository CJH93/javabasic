package javaStudy.day9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InOutEx3 {

	static void printArr(byte[] barr, byte[] outSrc) {
		System.out.println("barr : " + Arrays.toString(barr));
		System.out.println("OutSource : " + Arrays.toString(outSrc));
}
	public static void main(String[] args) throws IOException {
		
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] barr = new byte[4];
		
		ByteArrayOutputStream bao = null;
		ByteArrayInputStream bai = null;
		
		bai = new ByteArrayInputStream(inSrc);
		bao = new ByteArrayOutputStream();
		
		while(bai.available() > 0)
		{
			bai.read(barr);
			bao.write(barr);
			
			outSrc = bao.toByteArray();
			printArr(barr, outSrc);
		}
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));

	}

}
