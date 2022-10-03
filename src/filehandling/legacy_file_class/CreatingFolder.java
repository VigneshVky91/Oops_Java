package filehandling.legacy_file_class;

import java.io.File;

public class CreatingFolder {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\Dell\\Desktop\\myfolder");
		if(folder.exists()) {
			System.out.println("Folder available");
		}
		else {
			System.out.println("Folder not available");
			folder.mkdir();
			System.out.println("Folder created...");
		}
	}
}
