/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand Final keyword
 */
public class FinalKeyword {
	public final int lucky_number = 7 ;
	public final static int unlucky_number= 13;
	/*
	 * final value cant be changed
	 */
	
	public void Show(){
		System.out.println(lucky_number);
		System.out.println(unlucky_number);
	}
}
