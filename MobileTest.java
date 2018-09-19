
public class MobileTest {

	public static void main(String[] args) {
		//lets create some objects of Mobile class
		
		Mobile mobile1 = new Mobile();
		Mobile mobile2 = new Mobile();
		Mobile mobile3 = new Mobile();
		
		/*
		 * here, mobile1, mobile2 and mobile3 are objects.these has 
		 * the common attributes but uncommon
		 * values of their attributes.
		 */
		
		//lets assign the values of the objects
		mobile1.name = "Nokia";
		mobile1.model = "Nokia-2";
		mobile1.price = 12000;
		
		mobile2.name = "Apple";
		mobile2.model = "Apple-X2";
		mobile2.price = 54000;
		
		mobile3.name = "Black Berry";
		mobile3.model = "Balck Berry-Z1";
		mobile3.price = 75000;
		
		//lets print the values
		System.out.println(mobile1.name);
		System.out.println(mobile1.model);
		System.out.println(mobile1.price);
		System.out.println("\n");
		
		System.out.println(mobile2.name);
		System.out.println(mobile2.model);
		System.out.println(mobile2.price);
		System.out.println("\n");
		
		System.out.println(mobile3.name);
		System.out.println(mobile3.model);
		System.out.println(mobile3.price);
	}

}
