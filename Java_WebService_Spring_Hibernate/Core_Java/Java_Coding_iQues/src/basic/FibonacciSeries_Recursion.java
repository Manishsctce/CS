package basic;

/*
 * It is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
   Ex- 1 1 2 3 5 8 13 ... . up to a given number. 
   - using iteration over recursion and how to optimize the solution using caching and memoization.

 */
public class FibonacciSeries_Recursion {

	// USING RECURSION
	public static int fibonacci(int number) {
		System.out.print(number + " ");
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
	}

	//USING ITERATION
	public static int fibonacci2(int number){ 
		if(number == 1 || number == 2) 
		    return 1; 
		 
		int fibo1=1, fibo2=1, fibonacci=1; 
		for(int i= 3; i<= number; i++){
			//Fibonacci number is sum of previous two Fibonacci number 
			fibonacci = fibo1 + fibo2; 
			fibo1 = fibo2; 
			fibo2 = fibonacci; 
		} 
	return fibonacci; //Fibonacci number 
	}
	
	public static void main(String[] args) {
		System.out.println("\nSum of Fibonacci numbers upto 4 is " + fibonacci(4));
		System.out.println("\nSum of Fibonacci numbers upto 4 is " + fibonacci2(4));
	}
}
