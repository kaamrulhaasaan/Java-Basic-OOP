/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand Set Method and 
 * Get Method
 */
public class SetMethodAndGetMethodTest {

	public static void main(String[] args) {
		//lets create an object first
		SetMethodAndGetMethod frog = new SetMethodAndGetMethod();
		
		frog.Setname("Pabon");
		frog.SetAge(2);
		
		System.out.println(frog.GetName());
		System.out.println(frog.GetAge());
	}

}
