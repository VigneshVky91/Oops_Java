package filehandling.legacy_file_class;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Dell\\Desktop\\testfile.docx");
		
//		System.out.println("File exists: "+file.exists());
		
		if(file.exists()) {
			System.out.println("File exists...");
		}
		else {
			System.out.println("File not found...");
			try {
				file.createNewFile();
				System.out.println("File successfully created...");
			} catch (IOException e) {
				System.out.println("Unable to create the file.."+e.getMessage());
			}
		}
	}
}
