package filehandling.bytesBasedWriting;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BOSDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Dell\\Desktop\\file2.txt", true));
			System.out.println("Input any text to be added to the file...");
			String message = scan.nextLine();
			
			bos.write(message.getBytes());
			System.out.println("Success...");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
