/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */

/*
 * this is a simple java program to understand Methods.
 */
public class MethodTest {

	public static void main(String[] args) {
		/*in the Method class we have created two methods
		*now we will call them and run the program
		*for this, we need to create object/s first
		*/
		Method method1 = new Method();
		Method method2 = new Method();
		
		//lets assign the methods name and type
		method1.name = "Display";
		method1.type = "public";
		
		method2.name = "DisplayWithLoop";
		method2.type = "public";
		
		//lets print the objects states
		System.out.println("Method name is "+method1.name);
		System.out.println("Method type is "+method1.type);
		System.out.println("\n");
		
		System.out.println("Method name is "+method2.name);
		System.out.println("Method type is "+method2.type);
		System.out.println("\n");
		
		//lets call the methods
		method1.Display();
		method1.DisplayWithLoop();
		System.out.println("\n");
		
		method2.Display();
		method2.DisplayWithLoop();
	}

}
