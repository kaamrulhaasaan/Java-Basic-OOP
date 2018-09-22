/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand static method
 * and static variable
 */
public class StaticMethodAndVariableTest {

	public static void main(String[] args) {
		//lets create objects
		StaticMethodAndVariable stat1 = new StaticMethodAndVariable();
		StaticMethodAndVariable stat2 = new StaticMethodAndVariable();
		
		/*
		 * we need to call instance method Show by creating
		 * objects cause instance methods cant call directly
		 * by its class
		 */
		
		stat1.name = "Bob";
		stat2.name = "John";
		System.out.println(stat1.name);
		System.out.println(stat2.name);
		/*
		 * StaticMethodAndVariable.name ="John"; wont work cause
		 * name is not a static variable
		 * so it cant be called by its class directly.but we 
		 * can call static variable description directly by its 
		 * class
		 */
		
		StaticMethodAndVariable.description = "Teacher";
		StaticMethodAndVariable.Display();
		/*
		 * the static method is called directly without creating 
		 * any object
		 * static method accessed its static variable directly
		 */
	}

}
