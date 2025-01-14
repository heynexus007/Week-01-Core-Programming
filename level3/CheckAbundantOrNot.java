//4
import java.util.Scanner;

class CheckAbundantOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Taking input
        System.out.print("Enter an integer ");
        int number = input.nextInt();
        int sum = 0;

        // Loop for finding the sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 	// Check if i is a divisor
                sum += i; 			// Adding i to sum
            }
        }

        // Checking if the sum of divisors > number
        if (sum > number) {
            System.out.println(number + " is an Abundant number");
        } 
		else {
            System.out.println(number + " is not an Abundant number");
        }
		
        input.close();
    }
}