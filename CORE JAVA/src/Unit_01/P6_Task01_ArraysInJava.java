package Unit_01;

/*
 * Array is a collection of similar types of elements which are stored in contiguous
 * memory location.
 * Java Array is an object which contains elements of similar type
 * Issues with array - 
 * 		1. we can store only the fixed size of elements in the array
 * 		2. It doesn't grow its size at runtime(static array)
 * 		3. To solve this problem, collection framework is used in Java which grows automatically
 * 
 * Types of arrays - 
 * 		1. Single dimension array.
 * 		2. Multi Dimensional array.
 */

public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {
		// Declaration 
		int a1[];
		
		int[] a2;
		int []a3;
		
		// can we do a1[0] = 1; ?
		// No, because we haven't provided it any memory yet(not initialized)
		//Initialization - to create an empty array.
		
		a1 = new int [6];
		
		for(int i = 0; i < a1.length; i++)
		{
			a1[i] = i;
		}
		
		int a4[] = {1, 2, 3, 4, 5}; // declaration, instantiation and initialization
		
		//passing array to methods
		func(a4); // kaam chalau approach, but not optimized !
		func(new int[] {1, 2, 3, 4, 5});
		
		//returning array from method
		int[] a5[] = get_array(); 
		System.out.println(a5.toString());
		
		// array index out of bound Exception
		
		int a6[] = {1, 2, 3, 4, 5};
		for(int i = 0; i <= a6.length; i++)
		{
			System.out.println(a6[i]); // it will give error because of i<= a6.length in for loop.
			
		}
		
		int[][] a7 = new int[3][3]; //3 rows and 3 columns
		for(int i = 0, j = 0; i < 3 && j < 3; i++, j++)
		{
			a7[i][j] = i;
		}
		for(int i = 0, j = 0; i < 3 && j < 3; i++, j++)
		{
			System.out.println(a7[i][j]);
		}
		
		static void func(int a[])
		{
			for(int i = 0; i <= a.length; i++)
			{
				System.out.println(a[i]); 
			}
		}
		
		static int[] get_array()
		{
			int a4[] = {1, 2, 3, 4};
			return a4;
		}
		
	}

}
