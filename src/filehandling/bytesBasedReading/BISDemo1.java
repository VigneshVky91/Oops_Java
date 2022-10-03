package filehandling.bytesBasedReading;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BISDemo1 {

	public static void main(String[] args) {
		System.out.println("Test");
		try 
		{
			BufferedInputStream buffer = new BufferedInputStream(new FileInputStream("C:\\Users\\Dell\\Desktop\\file2.txt"));
			int ch;
			while((ch=buffer.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
