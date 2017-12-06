
import java.util.Random;
public class Runner {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(5);
		int y = rand.nextInt(5);
		int z = rand.nextInt(3);
		int q = rand.nextInt(2);
		int age = rand.nextInt(89)+10;
	//	int gpa = rand.nextInt(50)+50;
		
		String[] major =  {"Math " ,"Physics " , "Biology " , "Architecture " , "Economics " };
		String[] gender = {"Male", "Female"};
		String[] firstNames = {"Adam " , "Ben " , "Colin ", "Daniel " , "Emily ", "Fermented ", "Wine ",
				"Blair ", "Amy " , "Trust " , "Me " , "These ", "Names ", "Are ", "Totally ", "Legit "
				, "Winry ", "Creep ", "Moon "};
		String[] familyNames = {"Denice " , "Enmancipates ", "Froth ", "Appleseed " , "Beckons " , "Cooler "
				, "Frezia " , "Last ", "Moon " ,"Additional " , "Pylons ", "Bench ", "The ", "Kench ", "Please " , 
				"Let " , "MeOff ", "Thehook "};
		String[] subject = {"Math " , "English " , "Philosophy ", "Social Studies ", "Computer Science " , "Engineering" }; 
		String[] title = {"Mr." , "Mrs." , "Ms." , "Alien. "};
		
		Person teacher = new Teacher(subject[x] , title[z] , age , firstNames[x], familyNames[y] , gender[q]); 
		
		
		System.out.print(title[rand.nextInt(4)] );
		System.out.print(firstNames[rand.nextInt(19)] );
		System.out.print(familyNames[rand.nextInt(18)] );
		System.out.print("teaches " + subject[rand.nextInt(6)]);
	//	int jn = 0 ;
	/*	for (int i = 0 ; i<34 ; i++) 
		{
		Person student = new Student (  rand.nextDouble()+ rand.nextInt(50)+50, 12 , major[rand.nextInt(5)], age , firstNames[rand.nextInt(5)], familyNames[rand.nextInt(5)], gender[rand.nextInt(2)]);
		
		//jn = jn + rand.nextInt(50)+50 ;
		//System.out.println(student);
		}*/
		
		//System.out.println(jn); 
		Person[] studentBody = new Person[34];
		for (int i=0; i<studentBody.length;i++)	
		{
			studentBody[i]= new Student (  rand.nextDouble()+ rand.nextInt(50)+50, 12 , major[rand.nextInt(5)], age , firstNames[rand.nextInt(19)], familyNames[rand.nextInt(18)], gender[rand.nextInt(2)]) ;
		}
		Classroom classroom1 = new Classroom (studentBody , teacher) ; 
		System.out.println(classroom1.printClass());
		System.out.println("Class Average: " + classroom1.classAverage());
		
	

	}
//	public static newStudent ( )
	
		
	
			
			}


	
	
		


