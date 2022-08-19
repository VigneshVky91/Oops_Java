package class_objects;

public class MainClass {
	public static void main(String[] args) {
		Student dharsan = new Student();
		Student mathi = new Student();
		Student kaviNila = new Student();

//		dharsan.studentId = 123;
//		dharsan.studentName = "Dharsan";
//		dharsan.school = "AKKV";
//		
//		mathi.studentId = 120;
//		mathi.studentName = "Mathiarasu";
//		mathi.school = "VSK";
//		
//		kaviNila.studentId = 124;
//		kaviNila.studentName = "Kavi Nila";
//		kaviNila.school = "ABC";
		
		dharsan.acceptInput();
		mathi.acceptInput();
		kaviNila.acceptInput();
		
		dharsan.displayStudentDetails();
//		dharsan.displayStudentDetails();

		mathi.displayStudentDetails();
//		mathi.displayStudentDetails();

		kaviNila.displayStudentDetails();
	}
}
