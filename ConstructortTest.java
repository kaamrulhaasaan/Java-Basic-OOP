/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand constructor.
 */
public class ConstructortTest {

	public static void main(String[] args) {
		new Constructor();
		/*
		 * we do not need to create object to call a constructor
		 * all we need is the new keyword before the constructor
		 * name.
		 */
		new Constructor("Biology!");
		
		new Constructor("Physics", 250);
	}

}
