/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple program to undrstand this keyword in java
 */
public class ThisKeywordTest {

	public static void main(String[] args) {
		//lets create an object first
		ThisKeyword player = new ThisKeyword();
		
		player.SetName("Mashrafee Bin Mortuza");
		player.SetAge(32);
		
		System.out.println(player.GetName());
		System.out.println(player.GetAge());
	}

}
