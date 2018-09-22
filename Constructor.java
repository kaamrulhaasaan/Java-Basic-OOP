/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand constructor.
 */
public class Constructor {
	private String name;
	private int age;
	
	//lets try a constructor here
	public Constructor(){
		System.out.println("First constructor is running.");
	}
	/*
	 * constructor has the same name as the class and 
	 * it has no return type.
	 * that means constructors return nothing.
	 */
	
	//this constructor has a parameter
	public Constructor(String name){
		this.name = name;
		System.out.println("Constructor name is " +name);
	}
	
	//this constructor has two parameters
	public Constructor(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println("Constructor name is "+name+" and he/she is "+age+" years old");
	}
}
