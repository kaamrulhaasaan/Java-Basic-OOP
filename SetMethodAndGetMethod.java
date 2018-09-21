/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand Set Method and 
 * Get Method
 */
public class SetMethodAndGetMethod {
	String name;
	int age;
	
	//this method will set the name for the object
	public void Setname(String newName){
		name = newName;
	}
	
	//this method is to set the age of the object
	public void SetAge(int newAge){
		age = newAge;
	}
	
	//this method will make the name available
	public String GetName(){
		return name;
	}
	
	//this method will make the age available
	public int GetAge(){
		return age;
	}
}
