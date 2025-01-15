// 10
import java.util.Scanner;

class FindDigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for a number
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        // Counting the number of digits in the number
        int temp = number; 	// Temporary variable to count digits
        int count = 0; 		// Variable to store the count
        
        while (temp != 0) {
            temp /= 10; 	// Remove the last digit
            count++; 		// Increment the digit count
        }

        // Creating an array to store the digits
        int[] digits = new int[count];
        temp = number; // Reset temp to original number

        // Store the digits in the array
        for (int i = 0; i < count; i++) {
			// Get the last digit and Remove the last digit
            digits[i] = temp % 10; 
            temp /= 10; 
        }

        // Create a frequency array
        int[] frequency = new int[10];

        // Calculate the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Print the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { 
			// Only display digits that appear in that number
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
        
        // Close the scanner obj
        input.close();
    }
}