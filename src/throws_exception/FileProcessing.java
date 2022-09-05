package throws_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileProcessing {
	
	public static void openFile() throws FileNotFoundException {
		//Code to open file goes here
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile.txt");
		System.out.println("File opened successfully...");
	}
	
	public static void broker1() throws FileNotFoundException{
		openFile();
	}

	public static void broker2() throws FileNotFoundException {
		broker1();
	}
	
	public static void broker3() throws FileNotFoundException {
		broker2();
	}
	
	public static void main(String[] args) {
		try {
			broker3();
		} catch (FileNotFoundException e) {
			System.out.println("File Not found");
		}
	}

}
