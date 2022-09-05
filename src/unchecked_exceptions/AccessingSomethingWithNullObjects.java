package unchecked_exceptions;

class Student{
	private int sid;
	private String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	public void displayDetails() {
		System.out.println("Student id: "+sid);
		System.out.println("Student name: "+sname);
	}
	
	public static void callDisplayDetails(Student student) {
		try {
			student.displayDetails();
		}
		catch(NullPointerException npe) {
			System.out.println("Unable to call the method with null object...");
		}
	}
}

public class AccessingSomethingWithNullObjects {

	public static void main(String[] args) {

		Student mathi = new Student(123, "Mathi");
//		Student mathi = null;
		Student.callDisplayDetails(mathi);
	}
}
