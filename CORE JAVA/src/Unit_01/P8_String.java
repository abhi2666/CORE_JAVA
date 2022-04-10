package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("1234");
		String s2 = new String("1234");

//		int res = obj.palindrome_string(s);
//        if(res == 1)
//        {
//            System.out.println("String is a Palindrome");
//        }
//        else
//        {
//            System.out.println("String is not a Palindrome");
//        }
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	int palindromeOrNot(String s) {
		 int n = s.length();
//       char c[] =  new char [n]; //declaration and intialization at the same time
//
//
//       for (int i = n - 1; i >= 0 ; i--) {
//           c[i] = s.charAt(i); // putting  element by element into char array
//       }
//       //Comparing string and char
//
       int i = 0, j = s.length() -  1;
       while(i < j)
       {
            if(s.charAt(i) != s.charAt(j))
            {
                return -1;
            }
            i++;
            j--;
       }
       return 1;
		
	}

	void reverseOfAString(String s) {
		String s1 = new String();
		for(int i = s.length()-1; i >= 0; i--)
		{
			s1 += s.charAt(i);
		}
		System.out.println(s1);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		int i = 0, flag = 0; 
		if(s1.length() == s2.length())
		{
			while(i < s1.length()-1)
			{
				if(s1.charAt(i) != s2.charAt(i))
				{
					flag = 1;
				}
				i++;
			}
			if(flag == 1)
			{
				System.out.println("Strings are not Equal");
			}
			else
			{
				System.out.println("Strings are Equal");
			}
		}
		else
		{
			System.out.println("Strings are not Equal !");
		}
		
		
	}
}