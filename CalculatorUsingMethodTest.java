/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to make a calculator by using
 * method
 */
public class CalculatorUsingMethodTest {

	public static void main(String[] args) {
		//we need to create an object first
		CalculatorUsingMethod calculate = new CalculatorUsingMethod();
		
		//do your operation by calling the methods
		calculate.Add(15.56, 10.24);
		calculate.Subtract(15.56, 10.24);
		calculate.Multiply(15.56, 10.24);
		calculate.Divide(15.56, 10.24);
	}

}
