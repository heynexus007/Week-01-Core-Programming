//5
import java.util.Scanner;

class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // Taking user input for a number
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        // Count the number of digits in the number
        int temp = number; 		// Temporary variable to count digits
        int count = 0; 			// Variable to store the count of digits
        
        while (temp != 0) {
            temp /= 10; 	// Remove the last digit
            count++; 		// Increment the digit count
        }

        // Creating an array to store the digits
        int[] digits = new int[count];
        temp = number; 	// Reset temp to the original number

        // Store the digits in the array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10; 	// Get the last digit
            temp /= 10; 			// Remove the last digit
        }

        // Printing the digits in reverse order
        System.out.println("Digits in reverse order :");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " "); // Print each digit
        }
        
        // Close the scanner object
        input.close();
    }
}
