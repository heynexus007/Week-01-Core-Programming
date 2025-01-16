//7 
import java.util.Scanner;
class PalindromeCheckerr {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false; // Characters at start and end do not match
            }
            start++;
            end--;
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a text to check if it is a palindrome:");
        String s = input.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String processedInput = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the input is a palindrome
        boolean res = isPalindrome(processedInput);

        // Display the result
        if (res) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }

        input.close();
    }
}