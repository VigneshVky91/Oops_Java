package filehandling.bytesBasedReading;

import java.io.FileInputStream;
import java.io.IOException;

public class FISExampleByteArray {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			 fis= new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile.txt");
			 System.out.println("File opened for reading...");
//			 Creating byte array to store the character read from the file
			 byte[] b = new byte[fis.available()];
			 fis.read(b);
			 System.out.println(new String(b));
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
