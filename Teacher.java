public class Teacher extends Person {
	
	private String subject;
	private String title;
	
	public Teacher (String subject, String title , int age , String firstName, String familyName, String gender) {
		super (age, firstName,familyName,gender);
		this.subject = subject;
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}
	public String toString() {
		return title;
	}
	
}
