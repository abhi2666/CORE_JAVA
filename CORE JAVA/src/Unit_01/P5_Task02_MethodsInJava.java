package Unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		
		ABC3 obj = new ABC3();
		
		// calling display method/function
		obj.display();
		System.out.println(obj.a); // accessing static var. with object is wrong approach
		// Use class name to access it
	}

}
class ABC3
{
	static int a = 10;
	/*
	 * Actual method definition
	 * 
	 * DataType method_name(data_type p1, data_type p2)
	 * {
	 * 	method body;
	 * 
	 * return value; //if required
	 * }
	 */
	
	static void display()
	{
		int b = 10;
		int a = 10;
		 System.out.println(b);
		 System.out.println(a);
	}
	
	int display2()
	{
		System.out.println(a);
		//As a was a local variable so we can not access it outside the method where it is init..
		//System.out.println(b);  b is also local var.
		return a;
		
		
		
	}
}
