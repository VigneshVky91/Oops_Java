package filehandling.legacy_file_class;

import java.io.File;
import java.util.Scanner;

public class CreatingSubFoldersInTheSameLevels {

	public static void main(String[] args) {
		String path = "C:\\Users\\Dell\\Desktop\\folder";
		System.out.println("Input the no of folders:");
		int noOfFolders = new Scanner(System.in).nextInt();
		File file = new File(path);
		file.mkdir();
		
		for(int i=1; i<=noOfFolders; i++) {
			file = new File(path+"\\sub"+i);
			file.mkdir();
			System.out.println(file.getPath()+" has been created...");
		}
		
		
	}
}
