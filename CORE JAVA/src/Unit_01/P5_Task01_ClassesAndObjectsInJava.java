package Unit_01;

public class P5_Task01_ClassesAndObjectsInJava {

	public static void main(String[] args) {
		
		ABC2 obj = new ABC2(); //creating an instance of class ABC2
		obj.display2();
		
		ABC2.display(); // calling with the help of class name 

	}

}

class ABC2
{
	int a = 10; // a is instance variable and can be accessed inside non-static methods
	static int b = 10;
	
	static void display()
	{
		int b = 10;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	void display2()
	{
		System.out.println(a);
		//as a was a local variable so we can not access it outside the method
	}	
}
