package filehandling.bytesBasedReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISExample {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			 fis= new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile.txt");
			System.out.println("File opened for reading...");
			
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
			int ch;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			System.out.println("File Not available");
		}
		finally {
			try {
				fis.close();
				System.out.println("\nFile closed successfully...");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
