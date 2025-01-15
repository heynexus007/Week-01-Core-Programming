//2
import java.util.Scanner;

class RecursiveSumOfNum{
	// Method for find the sum of n natural numbers using recursion
	public static int sumRecursive(int number){
		if(number <= 1){
			return number;
		}
		return number + sum(number-1);
	}
	// Method to find the sum of n natural numbers
	public static int sum(int number){
		int total = number * (number+1) / 2;
		return total;
	}
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number :");
		// Taking user input
		int number = input.nextInt();
		// Print Sum of n natural number by using recursion
		System.out.println("Sum of n natural number by using recursion is : " + sumRecursive(number));
		// Print Sum of n natural number using formula
		System.out.println("Sum of n natural number by using loop is : " + sum(number));
		
		// Comparing both equal or not
		if(sumRecursive(number) == sum(number)){
			System.out.print("Both results is same : " + sum(number));
		}else{
			System.out.print("results are different ");
		}
		
		// Closing scanner
		input.close();
	}
}