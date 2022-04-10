package Unit_01;

public class P2_task01_Keywords {

	public static void main(String[] args) {
		
		/* 
		 * Keywords are reserved words in Java that has some special meaning
		 * and that cannot be changed.
		 * 
		 * In java we have 50 keywords 
		Some of these are - abstract, assert, boolean, break, case, double, 
		else, etc., and many more..
		
		some of the keywords are meant for future use of only and some are
		supported by a specific version of java.
		*/
		
		int double = 1; //double is a keyword and cannot be used as a name
		int new() //new is a keyword and hence cannot be used as identifier
		{
			System.out.println("empty");
		}
		int a = 10;
		a = 11; //value gets changed
		
		
		

	}

}

class int  //This class name is also a keyword which is not possible hence we will get an error
{
	//// some code //////
}