package filehandling.serializingAndDeserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Dell\\Desktop\\myobj.bin"));
			System.out.println("File opened");
			Student mathi = new Student(123, "Mathi");
			oos.writeObject(mathi);
		} catch (IOException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
