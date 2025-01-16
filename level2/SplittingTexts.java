//2
import java.util.Scanner;

public class SplittingTexts {

    // Method to find the length of a string without using length()
    public static int findLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch exception when index is out of bounds
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextIntoWords(String input) {
        int wordCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // For the last word

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' || i == input.length() - 1) {
                if (i == input.length() - 1) i++; // Include last character
                words[wordIndex++] = input.substring(startIndex, i).trim();
                startIndex = i + 1;
            }
        }
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a complete text: ");
        String s = input.nextLine();
        
        // Split using custom method
        String[] customSplit = splitTextIntoWords(s);
        
        // Split using built-in method
        String[] builtInSplit = s.split(" ");
        
        // Compare results
        boolean areEqual = compareStringArrays(customSplit, builtInSplit);
        
        // Display results
        System.out.println("Custom Split: ");
        for (String word : customSplit) {
            System.out.println(word);
        }
        
        System.out.println("Built-in Split: ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        
        System.out.println("Are both split results equal? " + areEqual);
        
        //Closing scanner obj
        input.close();
    }
}