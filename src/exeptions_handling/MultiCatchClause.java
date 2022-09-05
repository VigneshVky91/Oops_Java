package exeptions_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatchClause {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile.txt");
			fis.read();
//			Thread.sleep(3000);
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(FileNotFoundException|ClassNotFoundException e) {
			System.out.println(e);
//			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Unable to read from the file");
		}
	}
}
