package filehandling.legacy_file_class;

import java.io.File;

public class DeletingFolders {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Dell\\Desktop\\folder");
		
//		When folders don't have subfolder or files in it it can't be deleted directly
//		Instead the files or folders inside must be deleted first
		
		File[] filesAndFoldersInside = file.listFiles();
		
		for(int i=0; i< filesAndFoldersInside.length; i++) {
			System.out.println(filesAndFoldersInside[i]);
			if(i==4) {
				filesAndFoldersInside[i].delete();
			}
//			filesAndFoldersInside[i].delete();
		}
		System.out.println("Removed all the subfolders...");
		file.delete();
		System.out.println("Removed root folder...");
	}
}
