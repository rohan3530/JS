package comm;

public class Stu {
	
	int studRollNo;
	String studName;
	int studMarks;
	
	public Stu() {
		// TODO Auto-generated constructor stub
	}
	
	public Stu(int studRollNo, String studName, int studMarks) {
		super();
		this.studRollNo = studRollNo;
		this.studName = studName;
		this.studMarks = studMarks;
	}

	public int getStudRollNo() {
		return studRollNo;
	}
	
	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}
	
	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudMarks() {
		return studMarks;
	}

	public void setStudMarks(int studMarks) {
		this.studMarks = studMarks;
	}
	
	@Override
	public String toString() {
		return "<h2>Student<br><h4 style=\"color: Blue\">[studRollNo="+ studRollNo + ",<br> studName=" + studName + ",<br> studMarks=" + studMarks + "]<br>";
	}

	public String displayInfo() {
		
		return toString();
		
	}
}

