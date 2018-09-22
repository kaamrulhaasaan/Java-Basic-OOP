/*
 * Author: Md. Kamrul Hasan
 * CSE 13th Batch, PSTU
 */
/*
 * this is a simple java program to understand StringBuilder
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		//lets create an instance variable first
		String info = "";
		info = info + "Hi,";
		info = info + " ";
		info = info + "My name is Kamrul Hasan";
		
		System.out.println(info);
		/*
		 * this line will give us
		 * Hi, My name is Kamrul Hasan
		 * as output
		 * cause java does not change any String 
		 * so the first line
		 * String info = ""
		 * will assign an empty String
		 * second line 
		 * info = info + "Hi," 
		 * will assign Hi as String info and so on
		 * but we need huge memory in this way
		 * so we can use a better way named StringBuilder
		 */
		
		//lets create an object of StringBuilder
		StringBuilder obj = new StringBuilder("");
		obj.append("Hi,");
		obj.append(" ");
		obj.append("I'm Kamrul Hasan");
		
		//we need toString() to print the result
		System.out.println(obj.toString());
		/*
		 * this will show
		 * Hi, I'm Kamrul Hasan
		 * as output
		 * but we need a small amount of memory here
		 * we can do this by the process below too
		 */
		
		StringBuilder ob = new StringBuilder();
		ob.append("")
		.append("Hi,")
		.append("Welcome to Java");
		
		//and now use toString() to print the result
		System.out.println(ob.toString());
	}

}
