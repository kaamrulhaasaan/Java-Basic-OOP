/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand static method
 * and static variable
 */
public class StaticMethodAndVariable {
	public String name;
	public static String description;
	
	public void Show(){
		System.out.println(name);
		/*
		 * System.out.println(description) will work here
		 * cause instance method can work with both static and
		 * instance variables
		 */
	}
	
	public static void Display(){
		System.out.println(description);
		/*
		 * System.out.println(name); wont work here
		 * cause name is an instance variable and static method 
		 * does not work with instance variables
		 * it works with static variables
		 */
	}
}
