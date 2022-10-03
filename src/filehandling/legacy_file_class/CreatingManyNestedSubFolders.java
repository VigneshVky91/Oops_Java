package filehandling.legacy_file_class;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingManyNestedSubFolders {
	public static void main(String[] args) {
		System.out.println("Testing");
		String path = "C:\\Users\\Dell\\Desktop\\folder";
		Scanner s = new Scanner(System.in);
		System.out.println("Input no of files to be created...");
		int nums = s.nextInt();
		String folderName = "";
		for(int i=1; i<=nums; i++) {
			folderName+=("\\sub"+i);
		}
		path = path+folderName;
		
		File file = new File(path);
		file.mkdirs();
		
		String completePath = file.getPath()+"\\secretfile.txt";
		File secretFile = new File(completePath);
		try {
			secretFile.createNewFile();
			System.out.println("Secret file created at :"+completePath);
		} catch (IOException e) {
			System.out.println("Unable to create the file...");
		}
		System.out.println("Folders created successfully...");
	}
}
