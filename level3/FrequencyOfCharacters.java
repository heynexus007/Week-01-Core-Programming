//4
import java.util.Scanner;
class FrequencyOfCharacters {
    public static String[][] gettingFrequency(String text) {
        // Create an array to store frequency of characters (ASCII range 0 to 255)
        int[] frequency = new int[256];
        
        // Loop through the text and count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char k = text.charAt(i);
            frequency[k]++;
        }
        
        // Create a list to store characters and their frequencies
        String[][] result = new String[text.length()][2];
        int index = 0;
        
        // Loop through the frequency array and store non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a strin : ");
        String text = input.nextLine();

        // Call the method to get the frequency of characters
        String[][] f = gettingFrequency(text);

        // Display the result
        System.out.println("Character Frequency :  ");
        for (int i = 0; i < f.length && f[i][0] != null; i++) {
            System.out.println(f[i][0] + ": " + f[i][1]);
        }

        input.close();
    }
}