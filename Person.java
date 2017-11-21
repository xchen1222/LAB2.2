
public abstract class Person {
	
	private String gender;
	private String firstName;
	private String familyName;
	private int age;
	
	public Person (int age, String firstName, String familyName, String gender)
	{
		this.gender = gender;
		this.firstName = firstName;
		this.familyName = familyName;
		this.age = age;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public abstract String toString();
}
