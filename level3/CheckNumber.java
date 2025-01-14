//3
import java.util.Scanner;

class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Enter Phone number upto 10 digits
        System.out.print("Enter an integer ");
        int number = input.nextInt();
        int sum = 0;
        int originalNumber = number;

        // Loop to calculate the sum of digits
        while (originalNumber != 0) {
            sum+=originalNumber % 10; 	// Add last digit to sum
            originalNumber/=10; 		// Removing last digit
        }

        // Check if the number is divisible by the sum (digits)
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } 
		else {
            System.out.println(number + " is not a Harshad number.");
        }
		
        input.close();
    }
}