package Unit_01;


/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
//		obj.sortAnArray(array);
//		obj.print_array(array);
//		obj.findTheDuplicateElements(array);
//		obj.findSecondLargestAndSecondSmallestElement(array);
//		obj.leftRotationInAnArray(array);
//		obj.print_array(array);
		obj.removeElementInArray(array); 
		obj.print_array(array);

	}

}

class QuestionsOnArray {
	
	void print_array(int a[])
	{
		for (int i = 0; i < a.length; i++)
        {
            
            System.out.print(a[i]);
        }
		System.out.print("\n");
	}

	void sortAnArray(int[] arr) {
		int n = arr.length;
		  
        
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
  
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

	}

	void findTheDuplicateElements(int[] arr) {
		System.out.println("Printing the duplicates -->");
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] == arr[i - 1])
			{
				System.out.print(arr[i]);
			}
		}
		System.out.print("\n");

	}

	void findSecondLargestAndSecondSmallestElement(int[] a) { //NOT WORKING 
		int min = 100000, max = 0, flag = 0; 
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
			else if(a[i] > max)
			{
				max = a[i];
			}
			else
			{
				flag = 1;
			}
		}
		
		//now, to find second min and max
		int s_min = 100000, s_max = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < s_min && s_min != min)
			{
				s_min = a[i];
			}
			else if(a[i] > s_max  && s_max != max)
			{
				s_max = a[i];
			}
			else
			{
				flag = 1;
			}
		}
		System.out.println("Second min "+s_min+" "+"Second max "+s_max);
	}

	void leftRotationInAnArray(int[] a) {
		int temp = a[0], i;
		for(i = 0; i < a.length - 1; i++)
		{
			a[i] = a[i + 1];
		}
		a[i] = temp;
		

	}

	void removeElementInArray(int[] arr) {
		int n = arr.length-1;
		int ele = 6;
		int a[] = new int [n]; //array has been created ---> int a[n]; is wrong syntax in java
		for(int i = 0; i < n; i++)
		{
			if(a[i] == ele)
			{
				if(i == n - 1)
				{
					n--;
				}
				else
				{
					while(i < n-1)
					{
						a[i] = a[i + 1];
						i++;
						
					}					n--;
				}
							
				break;
			}
		}
		
		

	}

}
