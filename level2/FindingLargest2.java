
import java.util.Scanner;

class FindingLargest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for a number
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        
        // Declare an array to store the digits
        int maxDigit = 10; 	// size of the array
        int[] digits = new int[maxDigit];
        int index = 0;  	// Index to keep tracks of the number of digits
		
        // Extracting digits and store them in the array
        while (number != 0) {
            // Check if we need to increase the size of the array
            if (index == maxDigit) {
                maxDigit += 10; // Increase the size by 10
                int[] temp = new int[maxDigit]; // Create a new array with the new size
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy old digits to new array
                digits = temp; // Assign the new array to digits
            }
            digits[index++] = number % 10; 	// Storing the last digit
            number /= 10; 	// Remove the last digit from the number
        }

        // Variables to store the largest and second largest
        int largest = Integer.MIN_VALUE; 
        int secLargest = Integer.MIN_VALUE;

        // Loop for finding the largest and second largest digits in an array
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secLargest = largest; 	// Update second largest
                largest = digits[i]; 	// Update largest
            } else if (digits[i] > secLargest && digits[i] != largest) {
                secLargest = digits[i]; // Update second largest if it's not equal to largest
            }
        }

        // Print the largest and second largest digits
        System.out.println("Largest digit : " + largest);
        System.out.println("Second largest digit : " + secLargest);
        
        // Close the scanner
        input.close();
    }
}

