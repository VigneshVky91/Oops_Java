package exeptions_handling;

import java.io.FileNotFoundException;

public class ThowingException2 {

	public static void openFile(String path) throws FileNotFoundException{
		if(path.isEmpty() || path=="") {
			throw new FileNotFoundException();
		}
	}
	public static void main(String[] args) {
		try {
			openFile("");
		}
		catch(FileNotFoundException fe) {
			System.out.println("File path is empty hence FileNotFoundException thrown manually...");
		}
	}
}
