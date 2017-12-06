
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
		String[] firstNames = {"a " , "B " , "c ", "d " , "e ", "f " };
		String[] familyNames = {"d " , "e ", "f ", "a " , "B " , "c " };
		String[] subject = {"math " , "english " , "??? ", "hadwja ", "wuajk " , "uwhjad" }; 
		String[] title = {"mr." , "mrs." , "ms." , "mr."};
		
		Person teacher = new Teacher(subject[x] , title[z] , age , firstNames[x], familyNames[y] , gender[q]); 
		
		
		System.out.print(title[z] );
		System.out.print(firstNames[x] );
		System.out.print(familyNames[y] );
		System.out.print("teaches " + subject[x]);
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
			studentBody[i]= new Student (  rand.nextDouble()+ rand.nextInt(50)+50, 12 , major[rand.nextInt(5)], age , firstNames[rand.nextInt(5)], familyNames[rand.nextInt(5)], gender[rand.nextInt(2)]) ;
		}
		Classroom classroom1 = new Classroom (studentBody , teacher) ; 
		System.out.println(classroom1.printClass());
		System.out.println("Class Average: " + classroom1.classAverage());
		
	

	}
//	public static newStudent ( )
	
		
	
			
			}


	
	
		


