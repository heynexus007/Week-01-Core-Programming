//3
import java.util.Scanner;
class FirstNonRepeatingChrt {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of each character

        // Loop to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char k = text.charAt(i);
            charFrequency[k]++;
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char k = text.charAt(i);
            if (charFrequency[k] == 1) {
                return k; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a string:");
        String s = input.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeating(s);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        input.close();
    }
}