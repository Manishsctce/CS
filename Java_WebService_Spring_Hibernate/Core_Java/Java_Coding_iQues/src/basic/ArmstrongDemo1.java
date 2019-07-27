package basic;

/* A number is called an Armstrong number if it is equal to the cube of its each digit. 
   - for example, 153 is an Armstrong number because 153= 1+ 125+27
 */
public class ArmstrongDemo1 {

	private static boolean isArmStrong(int number) { 
		int result = 0; 
		int orig = number; 
		
		while(number != 0){ 
			int remainder = number%10; 
			result = result + remainder*remainder*remainder; 
			number = number/10; 
		} 
		//number is Armstrong return true 
		if(orig == result){ return true; } 
		
	return false; 
	} 
	
	public static void main(String[] args) {
		System.out.println("153 isArmStrong: "+isArmStrong(153));
		System.out.println("154 isArmStrong: "+isArmStrong(154));
	}
}
