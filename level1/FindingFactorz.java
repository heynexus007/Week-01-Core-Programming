//8
import java.util.Scanner;

public class FindingFactorz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a number to find its factors : ");
        int number = input.nextInt();
        
        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding factors for number
        for (int i = 1; i <= number; i++) {
			// Check, if i is a factor of number
            if (number % i == 0) {
                // Check if we need to expand the array
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor];
					
					// Copy existing factors to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the new array
                }
                factors[index++] = i; // Store the factor
            }
        }

        // Printing the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
		
		// Closing Scanner object
		input.close();
    }
}