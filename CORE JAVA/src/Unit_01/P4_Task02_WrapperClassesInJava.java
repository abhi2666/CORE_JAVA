
/*
 * 
 * The Wrapper class in java provides the mechanism to conver primitive data types
 * into object and we do this because ---
 * we want to use predefined methods of those objects
 * 
 */


package Unit_01;

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		// Converitng int into Integer (wrapper class)
		int a = 5;
		Integer i = Integer.valueOf(a); // Converting int into Integer explicitly
		Integer j = a; //Autoboxing --> now compiler will do the same as in line 18 but internally
		
		System.out.println(i.toString()); // Possible
		a.toString(); //Not possible because int a is not an object
		
		//Autoboxing -> Converting primitives into objects
		byte b = 10;
		byte bobj = b; //autoboxing is done
		
		System.out.println(bobj);
		
		//Unboxing --> Converting Objects to primitives
		
		byte be = bobj;
		System.out.println(be); // Converted to primitive
		
		
		

	}

}
