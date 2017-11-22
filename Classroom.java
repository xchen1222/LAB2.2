
public class Classroom {
	Person[] Student ; 
	Person Teacher; 
	
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
	
}
