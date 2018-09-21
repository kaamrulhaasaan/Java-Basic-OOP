/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */

/*
 * this is a simple java program to understand return type
 * of Methods.
 */
public class Method2 {
	String name;
	int age;
	
	public void Speak(){
		System.out.println("My name is "+name);
		System.out.println("I am "+age+" years old");
	}
	
	//lets try a method which returns integer values.
	public int YearsLeftToRetierd(){
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
}
