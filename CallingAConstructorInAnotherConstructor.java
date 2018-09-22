/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to call a constructor
 * from another constructor.
 */
public class CallingAConstructorInAnotherConstructor {
	private String name;
	private int age;
	
	//this co
	public CallingAConstructorInAnotherConstructor(){
		//lets call the third constructor from this constructor
		this("name",12);
		System.out.println("First Constructor is running!");
	}
	
	public CallingAConstructorInAnotherConstructor(String name){
		//lets call the first constructor here
		//the first constructor will call the third constructor first
		//then it will be called.
		this();
		System.out.println("Second Constructor is running!");
	}
	
	public CallingAConstructorInAnotherConstructor(String name, int age){
		System.out.println("Third Constructor is running!");
	}
}
