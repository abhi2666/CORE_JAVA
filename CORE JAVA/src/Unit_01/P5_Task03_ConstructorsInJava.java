package Unit_01;

/*It is used to initialize data members
 * It is called whenever an instance or object of the class is created
 * At the time of calling the constructor, memory for the object is allocated in the memory
 * It is special type of method which is used to init. the object
 * Every time an object is created using the new() keyword, at least one constructor is called
 * Types of Constructors --
 * 		1. Default Constructor(without parameter)
 * 		2. Parameterized Constructor(with parameters)
 * 
 */

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		ABC4 o1 = new ABC4(); // calls the default constructor
		ABC4 o2 = new ABC4(2); //calls the parameterized constructor 
		
		System.out.println(o1.a);
		System.out.println(o2.a);
	}

}

class ABC4
{
	int a;
	/*
	 * ClassName(Constructor Parameter)
	 * {
	 * All the class and Instance variables can be initialized here !
	 * }
	 */
	ABC4()
	{
		a = 10;
	}
	ABC4(int a)
	{
		this.a = a;
	}
	void display()
	{
		int b = 10;
		System.out.println(a);
		System.out.println(b);
	}
	
	int display2()
	{
		System.out.println(a);
		
		return a;
	}
}