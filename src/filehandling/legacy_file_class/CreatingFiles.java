package filehandling.legacy_file_class;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFiles {

	public static void main(String[] args) {
		String path = "C:\\Users\\Dell\\Desktop\\folder";
		File folder = new File(path);
		Scanner s = new Scanner(System.in);
		if(!folder.exists()) {
			folder.mkdir();
		}
		System.out.println("Input no of files");
		int noOfFiles = s.nextInt();
		System.out.println("Input file with extension: ");
		for(int i=0; i<noOfFiles; i++) {
			String fName = s.next();
			File file = new File(path+"\\"+fName);
			try {
				file.createNewFile();
				System.out.println("File "+fName+" has been created successfully...");
			} catch (IOException e) {
				System.out.println("Unable to create the file...");
			}
		}
	}
}
