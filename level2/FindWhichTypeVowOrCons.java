//6
import java.util.Scanner;
class FindWhichTypeVowOrCons {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkChrType(char ch) {
        // Convert to lowercase if it is an uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase using ASCII
        }
        
        // Check if the character is a vowel or consonant
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
		// If it is not a letter
        return "Not a Letter"; 
    }

    // Method to find vowels and consonants in a string and return a 2D array
    public static String[][] findVowelsAndCons(String v) {
        int len = v.length();
        String[][] finalres = new String[len][2]; // 2D array to store character and type

        for (int i = 0; i < len; i++) {
            char ch = v.charAt(i);
            String type = checkChrType(ch);
            finalres[i][0] = String.valueOf(ch); // Character
            finalres[i][1] = type; // Type (Vowel, Consonant, Not a Letter)
        }
        return result; // Return the 2D array
    }

    // Method to display the 2D array in tabular format
    public static void printResult(String[][] finalres) {
        System.out.printf("%-15s %s%n", "Character", "Type");
        System.out.println("----------------------------");
        for (String[] row : finalres) {
            System.out.printf("%-15s %s%n", row[0], row[1]);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string : ");
        String s = input.nextLine();
        
        // Find vowels and consonants
        String[][] finalres = findVowelsAndCons(s);
        
        // Display results
        printResult(result);
        
		input.close();
    }
}