package collections_demo.userdefined_list;

public class Student implements Comparable<Student>{
	private Integer sid;
	private String sName;
	public Student(Integer sid, String sName) {
		super();
		this.sid = sid;
		this.sName = sName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//		return this.sid - o.sid;
//	}
	
//	@Override
//	public int compareTo(Student o) {
//		return this.sName.length() - o.sName.length();
//	}
	
	@Override
	public int compareTo(Student o) {
		return this.sName.compareTo(o.sName);
	}
}
