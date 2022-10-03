package filehandling.characterBasedWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BWDemo {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		Scanner s = new Scanner(System.in);
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\Desktop\\welcome.txt", true));
			System.out.println("Enter text");
			String message = s.nextLine();
			bw.write(message);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
