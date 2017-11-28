
import java.util.Random;
public class Runner {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(5);
		int y = rand.nextInt(5);
		int age = rand.nextInt(89)+10;
		int gpa = rand.nextInt(50)+50;
		
		
		String[] gender = {"male", "female"};
		String[] firstNames = {"a" , "B" , "c", "d" , "e", "f" };
		String[] familyNames = {"d" , "e", "f", "a" , "B" , "c" };
		
		Person teacher1 = new Teacher("subject" , "title" , age , "sjad", familyNames[y] , "d");
		
		
		System.out.println(firstNames[x]);
		System.out.println(familyNames[y]);
		
		Person[] people = {teacher1};
		people = new Person[10];
		
		for (int i = 0; i < people.length; i++) {
			people[i] = PersonUtilities.randomShape();
		}
		
		for (Person people1  : people) {
			System.out.println(people1);
		}


	}
}

	
	
		


