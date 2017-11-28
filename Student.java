public class Student extends Person {
	
	private double gpa;
	private int gradeLevel;
	private String major;
	
	public Student (double gpa, int gradeLevel, String major, int age , String firstName, String familyName, String gender) {
		super (age, firstName,familyName,gender);
		this.gpa = gpa;
		this.gradeLevel = gradeLevel;
		this.major = major;
	}
	
	public double getGpa () {
		return gpa;
	}
	public int getGradeLevel () {
		return gradeLevel;
	}
	public String getMajor() {
		return major;
	}
	
	public String toString() {
		return getFamilyName()+ "," + getFirstName();
	}

	
}
