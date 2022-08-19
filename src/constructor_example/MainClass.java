package constructor_example;

public class MainClass {

	public static void main(String[] args) {
		Student dharsan = new Student(123, "Dharsan", "KKV");
		Student mathi = new Student(124, "Mathi", "AKV");
		Student kaviNila = new Student(125, "Kavinila", "TTV");
		Student jayaShree = new Student();
		
		dharsan.displayStudentDetails();
		mathi.displayStudentDetails();
		kaviNila.displayStudentDetails();
	}
}
