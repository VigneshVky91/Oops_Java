package filehandling.characterBasedWriting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWWriteCharByChar {
	public static void main(String[] args) {
		FileWriter fw=null;
		Scanner s = new Scanner(System.in);
		try {
			fw = new FileWriter("C:\\Users\\Dell\\Desktop\\welcome.txt", true);
			System.out.println("Input any text...");
			String message = s.nextLine();
			
//			fw.write("\n"+message);
			for(int i=0; i< message.length(); i++) {
				fw.write(message.charAt(i));
			}
		}
		catch(IOException e) {
			System.out.println("File not available...");
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
