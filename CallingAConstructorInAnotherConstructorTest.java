/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to call a constructor
 * from another constructor.
 */
public class CallingAConstructorInAnotherConstructorTest {

	public static void main(String[] args) {
		new CallingAConstructorInAnotherConstructor();
		new CallingAConstructorInAnotherConstructor("Bob");
		new CallingAConstructorInAnotherConstructor("John",13);
	}

}
