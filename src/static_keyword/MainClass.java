package static_keyword;

public class MainClass {
	public static void main(String[] args) {
		Student mathi = new Student();
		Student dharsan = new Student();

		mathi.studentId = 123;
		mathi.studentName = "Mathiarasu";
		mathi.laptopBrand = "Dell";
		
		Student.whiteBoardBrand = "Bell";
		Student.projectorBrand = "Epson";
		
		
		dharsan.studentId = 124;
		dharsan.studentName = "Dharsan Frank";
		dharsan.laptopBrand = "ACER";
		
		Student.whiteBoardBrand = "Camel";
		Student.projectorBrand = "Sharp";
		
		Student.whiteBoardBrand = "Camlin";
		Student.projectorBrand = "ACER";
		
		System.out.println("Printing Mathi's details:");
		
		System.out.println(mathi.studentId);
		System.out.println(mathi.studentName);
		System.out.println(mathi.laptopBrand);
		System.out.println(Student.whiteBoardBrand);
		System.out.println(Student.projectorBrand);
		
		System.out.println("Printing Dharsan's details:");
		
		System.out.println(dharsan.studentId);
		System.out.println(dharsan.studentName);
		System.out.println(dharsan.laptopBrand);
		System.out.println(Student.whiteBoardBrand);
		System.out.println(Student.projectorBrand);
	}
}
