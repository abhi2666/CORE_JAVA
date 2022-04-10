package Unit_01;

// To use scanner class you have to import --->
import java.util.Scanner;

/*
 * Scanner --> helps user to give inputs from console
 * 
 * nextLine()     -- Read user input(to read strings)
 * next()         -- Read next token from the input entered by the user
 * nextBoolean()  -- Read a boolean value from the user 
 * nextByte()     -- Reads a byte value from the user
 * nextDouble()     -- Reads a Double value from the user
 * nextFloat()     -- Reads a float value from the user
 * nextInt()     -- Reads a int value from the user
 * nextLine()     -- Reads a string value from the user
 * nextLong()     -- Reads a long value from the user
 * nextShort()     -- Reads a short value from the user
 */

public class P4_Task03_ScannerClassesInJava {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in); // create a scanner object to take values from user
		Scanner obj2 = new Scanner(System.in);
		
		// Read the First token : (until user enters a space)
		String name = obj1.next();
		String name2 = obj2.nextLine();
		
		System.out.println("name is :"+name+"\n");
		System.out.println("name is :"+name2+"\n");
		
		boolean b = obj2.nextBoolean();
		System.out.println(b+"\n");
		
		obj1.close();
		obj2.close();

	}

}
