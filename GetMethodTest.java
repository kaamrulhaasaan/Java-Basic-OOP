/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand Get method
 */
public class GetMethodTest {

	public static void main(String[] args) {
		//lets create some objects
		GetMethod person1 = new GetMethod();
		GetMethod person2 = new GetMethod();
		GetMethod person3 = new GetMethod();
		
		//now assign the values
		person1.name = "Mr. X";
		person1.age = 22;
		
		person2.name = "Mr. Y";
		person2.age = 21;
		
		person3.name = "Mr. Z";
		person3.age = 23;
		
		/*
		 * now lets hold the returned values in variables
		 * for this remove the multi line comments from the lines below.
		 */
		
		/*String name1 = person1.GetName();
		int age1 = person1.GetAge();
		
		String name2 = person2.GetName();
		int age2 = person2.GetAge();
		
		String name3 = person3.GetName();
		int age3 = person3.GetAge();
		
		System.out.println("Name of Person1 is "+name1);
		System.out.println(name1+" is "+age1+" years old");
		System.out.println("\n");
		System.out.println("Name of Person2 is "+name2);
		System.out.println(name2+" is "+age2+" years old");
		System.out.println("\n");
		System.out.println("Name of Person3 is "+name3);
		System.out.println(name3+" is "+age3+" years old");
		System.out.println("\n");
		*/
		
		//Lets print the outputs now
		System.out.println("Name of Person1 is "+person1.GetName());
		System.out.println(person1.GetName()+" is "+person1.GetAge()+" years old.");
		System.out.println("\n");
		
		System.out.println("Name of Person2 is "+person2.GetName());
		System.out.println(person2.GetName()+" is "+person2.GetAge()+" years old.");
		System.out.println("\n");
		
		System.out.println("Name of Person3 is "+person3.GetName());
		System.out.println(person3.GetName()+" is "+person3.GetAge()+" years old.");
		System.out.println("\n");
	}

}
