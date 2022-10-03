package filehandling.bytesBasedReading;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BISDemo2 {
	public static void main(String[] args) {
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Dell\\Desktop\\file2.txt"));
			byte[] b = new byte[bis.available()];
			bis.read(b);
			System.out.println(new String(b));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
