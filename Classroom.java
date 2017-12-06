
public class Classroom {
	Person[] Student ; 
	Person Teacher; 
//	double totalGPA = 1.0;
	public Classroom(Person[] Student , Person Teacher )
	{
		this.Teacher  = Teacher ; 
		this.Student = Student ; 
	}

	public Person[] getStudent() {
		return Student;
	}

	public Person getTeacher() {
		return Teacher;
	}
	public double classAverage()	{
		double classGPA = 0.0;

		for (Person p : this.Student)	{
			if (p instanceof Student) {
				classGPA += ((Student)p).getGpa();
			}
		}
		return classGPA/this.Student.length;	
	}
	public String printClass()	{
		String allStudents = "";
		for (Person p : this.Student)	{
			if (p instanceof Student) {
			allStudents= allStudents + ("\n"+((Student)p).getFirstName() +  ((Student)p).getFamilyName() + ", GPA: " + ((Student)p).getGpa() + " Major:" +((Student)p).getMajor() + ((Student)p).getGender());
			}	
		}
		return allStudents;
	}
}
