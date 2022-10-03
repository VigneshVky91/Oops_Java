package filehandling.legacy_file_class;

import java.io.File;

public class DeletingFilesInAFolder {

	public static void main(String[] args) {
		String path = "C:\\Users\\Dell\\Desktop\\folder";
		File folder = new File(path);
		
		File[] listFiles = folder.listFiles();
		
		for(File file: listFiles) {
			file.delete();
			System.out.println(file.getName()+" has been deleted...");
		}
		
		folder.delete();
		System.out.println("Parent folder is also deleted...");
	}
}
