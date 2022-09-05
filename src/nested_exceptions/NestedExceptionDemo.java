package nested_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NestedExceptionDemo {

	public static void main(String[] args) {
		try {
		//	Code to open file goes here
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile1.txt");
			System.out.println("File opened successfully...");
		}
		catch(FileNotFoundException f1) {
			System.out.println("Unable to open the file... Try opening a new file");
			try {
				//Code to open another file
				FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile2.txt");
				System.out.println("Second file opened successfully...");
			}
			catch(FileNotFoundException f2) {
				System.out.println("Unable to open both the files trying to open the third file");
				try {
					//Code to open another file
					FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\myfile3.txt");
					System.out.println("Third file opened successfully...");
				}
				catch(FileNotFoundException f3) {
					System.out.println("Unable to open three files the files");
				}
			}
		}
	}

}
