package exeptions_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinally {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile.txt");
//			fis.read();
//			System.out.println("File read successfully...");
			if(fis!=null) {
				throw new IOException("Unable to read");
			}
		}
		catch(IOException f) {
			System.out.println(f.getMessage());
		}
		finally {
			try {
				fis.close();
				System.out.println("File closed successfully...");
			} catch (IOException e) {
				System.out.println("Unable to close the file");
			}
		}
	}
}
