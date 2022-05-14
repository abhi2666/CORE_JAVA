Unit_02;
/* Inheritance in Java

 Inheritance is a property or feature of OO langugage that allows it inherit one class into another.
 Class which is inherited is called Super class.
 Class which inherited the Super Class is called Child class.
 
 In child class you can get access to public, protected members but you can't access private member of Super class
 
 To achieve Inhertiance use  -- extends -- keyword.
 Types of Inheritance - 
 	1. Multi-level Inheritance
 	2. Single Inheritance
 	3. hybrid Inheritance (but it will be like a tree)
 	4. Heirarchial Inheritance
 	
 	Multiple Inheritance is not supported in Java so as to remove Diamond Problem from its root
 	and to recover the features of Multiple Inheritance we use Interface(Java's Own Concept)
 	
 	 
 	 About the constructor -- the constructor of Super class will execute first after that of child class will execute.
*/
public class P08_Task01_InhertainceInJava {

	public static void main(String[] args) {
		Three g = new Three();
		g.methodOne();
		g.methodTwo();
		g.methodOne();
		g.methodThree();

		Two two = new Two(1);
		D obj = new D(2);
		obj.methodFour();

	}

}
//Below is the Example of Multilevel Inheritance
class One { // Super class
	int a;

	One(int x) { //parameterized constructor
		System.out.println("one constructor");
	}

	public void methodOne() {
		System.out.println("First method!");
	}
}

class Two extends One { // Inherited the class One
	int b;

	Two(int x) { //parameterized constructor 
		super(3);
		b = x;
		System.out.println("Two");
		System.out.println("hello");
	}

	public void methodTwo() {
		System.out.println("secondMethod!");
	}

}

class Three extends Two { //Inherited class Two which inherited class One
	int c;

	Three() { //Default constructor 
		super(1);
		System.out.println("Three constructor!");
	}

	Three(int x) {
		super(1);
		c = x;
		System.out.println("Three");
	}

	public void methodThree() {
		System.out.println("SecondMethod!");
	}

}

class A {
	int a;

	A(int a1) {
		a = a1;
	}

	public void methodOne() {
		System.out.println(a);
	}
}

class B extends A {
	int b;

	B(int x) {
		super(10);
		b = x;
	}

	public void methodTwo() {
		System.out.println(b);
	}
}

class C extends A {
	int c;

	C() {
		super(10);
		c =10;
	}

	public void methodThree() {

		System.out.println(c);
	}
}

class D extends A {
	int d;

	D(int d1) {
		super(d1);
		d = d1;
	}

	public void methodFour() {
		System.out.println(d);
	}
}
