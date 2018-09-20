/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */

/*
 * this is a simple java program to understand methods
 * we have a class name Method below.
 * we already know that a class contains the state and behavior
 * of its object.state means the variables and behavior means methods
 * here.so lets look at the Method class first.
 */
public class Method {
	//the state of the object is
	String name;
	String type;
	
	//now we need to define its behavior
	public void Display(){
		System.out.println("Method is working.");
	}
	
	//lets try another method
	public void DisplayWithLoop(){
		for(int i=0; i<10; i++){
			System.out.println("Method is working nicely!!");
		}
	}
	
	/*
	 * so, basically we are seeing that a method defines an specific 
	 * job for an object.
	 * method explains how the object works
	 * we have used return type void as we do not need to return 
	 * anything in these methods
	 * look at MethodTest class to know how to call the method.
	 */
}
