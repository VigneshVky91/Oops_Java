package filehandling.legacy_file_class;

import java.io.File;
import java.io.IOException;

public class CreatingAFolder {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Dell\\Desktop\\testing\\sub1\\sub2\\sub3");
		
		if(file.exists()) {
			System.out.println("File / Folder Exists");
			if(file.isDirectory()) {
				System.out.println("It is a folder");
			}else {
				System.out.println("It is a file");
			}
		}
		else {
			System.out.println("Folder not available...");
			//Creates a single folder metnioned in the path. Not suitable for nested folder
			file.mkdir();
			System.out.println("Folder created...");
		}
	}
}
