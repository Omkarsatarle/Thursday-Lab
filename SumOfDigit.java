public class SumOfDigit {
	  
	static int findSum(int number)  
	{  
	
	return number == 0 ? 0 : number % 10 +findSum(number/10) ;  
	}  
	  
	public static void main(String args[])  
	{  
	int number = 1234567;  
	   
	System.out.println("The sum of digits: "+findSum(number));  
	}  
}