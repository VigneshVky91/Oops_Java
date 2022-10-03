package filehandling.serializingAndDeserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Dell\\Desktop\\myobj.bin"));
			Student student = (Student)ois.readObject();
			System.out.println(student);
		} catch (IOException|ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
