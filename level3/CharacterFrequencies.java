//5
import java.util.Scanner;
class CharacterFrequencies {

    // Method to find the frequency of characters in a string
    public static int[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of each character

        // Loop to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char k = text.charAt(i);
            charFrequency[k]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (k[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (k[i] > 0) {
                result[index][0] = i; // Store ASCII value of the character
                result[index][1] = k[i]; // Store frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a string:");
        String s = input.nextLine();

        // Find the frequency of characters
        int[][] frequencies = findCharacterFrequency(s);

        // Display the result
        System.out.println("Character frequencies:");
        for (int[] entry : frequencies) {
            char character = (char) entry[0];
            int frequency = entry[1];
            System.out.println(character + ": " + frequency);
        }

        input.close();
    }
}