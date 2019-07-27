package array;

/* 1 to 100 elem in unsorted order in an array and 1 elem is missing. How to find the missing element?

METHOD 1: (Use sum formula)
1. Get the sum of numbers 
       total = n*(n+1)/2
2  Subtract all the numbers from sum and
   you will get the missing number.

 */
public class FindMissingNumber_in_UnsortedArray {

	static int getMissingNo (int a[], int n)
	{
	 int total = (n+1)*(n+2)/2; 
	 
	 for (int i = 0; i< n; i++)
	    total = total - a[i];
	 
	 return total;
	}   

	public static void main(String[] args) {
		int a[] = {3, 8, 7,13,15,9,1,2,4,5,6,12,10,11 };
		int miss = getMissingNo(a,a.length); //14
		
		System.out.println("Missing Number : "+ miss);
	}
}
