/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */

/*
 * this is a simple java program to understand return type
 * of Methods.
 */
public class Method2Test {

	public static void main(String[] args) {
		Method2 person1 = new Method2();
		Method2 person2 = new Method2();
		
		person1.name = "Kamrul Hasan";
		person1.age = 22;
		
		person2.name = "Lord Voldemort";
		person2.age = 22;
		
		person1.Speak();
		System.out.println("\n");
		person2.Speak();
		System.out.println("\n");
		
		/*
		 * we need to declare a variable to hold the returned 
		 * value and then print the value.
		 * id we do not declare a variable then we will not get
		 * the result
		 */
		
		int years1 = person1.YearsLeftToRetierd();
		int years2 =person2.YearsLeftToRetierd();
		
		/*
		 * when we called the YearsLeftToRetired method
		 * the method will return the result but we will 
		 * not get the answer.so we needed these variables
		 * to hold the value and now i am goin to print that 
		 * value.
		 */
		System.out.println("Years left to retire: "+ years1);
		System.out.println("Years left to retire: "+ years2);
		
		
	}

}
