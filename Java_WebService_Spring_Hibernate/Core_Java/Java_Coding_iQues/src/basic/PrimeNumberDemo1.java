package basic;

/* Number which is not divisible by any other number 
   - Ex- 2, 3, 5, 7, 11, 13, 17 etc. 
   - 1 is not a prime number
   Be prepared for cross e.g. checking till the square root of a number etc.
 */

public class PrimeNumberDemo1 {

	static boolean isPrimeNumber(int number) { 
		if (number == 2 || number == 3) { 
			return true; } 
			
		if (number % 2 == 0) { 
			return false; } 
			
		int sqrt = (int) Math.sqrt(number) + 1; //sqrt of 144 is 12
		for (int i = 3; i < sqrt; i += 2) { 
			if (number % i == 0)
				return false; 
		} 
	return true; 
	}
	
	public static void main(String[] args) {
		System.out.println("82 isPrimeNumber : "+isPrimeNumber(82));
		System.out.println("83 isPrimeNumber : "+isPrimeNumber(83));
	}
}
