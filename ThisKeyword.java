/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple program to undrstand this keyword in java
 */
public class ThisKeyword {
	private String name;
	private int age;
	
	/*
	 * these variables are private.so we cant access these
	 * variables from other classes directly.
	 * to access these variables from other classes we need to 
	 * use Set Method and Get method with this keyword.
	 * so lets try it out
	 */
	
	//this method is to set the name of the object
	public void SetName(String name){
		this.name = name;
		/*
		 * we used this keyword before name to access the private
		 * variable name.
		 * if we do not use this keyword here then we cant access
		 * the private variable name.we will access the 
		 * name parameter of SetName method instead.
		 * but that is not our concern.we need to access the 
		 * private variable name here.
		 * so we used this.name 
		 */
		}
	
	//this method is to set the age of the object
	public void SetAge(int age){
		this.age = age;
	}
	
	//now, we need to write get method here to get the result
	public String GetName(){
		return name;
	}
	public int GetAge(){
		return age;
	}
}
