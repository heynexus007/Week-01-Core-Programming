//3
import java.util.Scanner;
class WordsAndItsLengths {

    // Method to find the length of a string without using length()
    public static int getLength(String v) {
        int count = 0;
        try {
            while (true) {
                v.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch exception when index is out of bounds
        }
        return count; // Return the length
    }

    // Method to split text into words without using split() method
    public static String[] splittingTxtIntoWords(String v) {
        int wordCnt = 0;
        for (int i = 0; i < v.length(); i++) {
            if (v.charAt(i) == ' ') {
                wordCnt++;
            }
        }
        wordCnt++; // For the last word

        String[] words = new String[wordCnt];
        int wordIdx = 0;
        int startIdx = 0
        for (int i = 0; i < v.length(); i++) {
            if (v.charAt(i) == ' ' || i == v.length() - 1) {
                if (i == v.length() - 1) i++; // Include last character
                words[wordIdx++] = v.substring(startIdx, i).trim();
                startIdx = i + 1;
            }
        }
        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] arrayHasWordLength(String[] words) {
        String[][] arrWordLen = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arrWordLen[i][0] = words[i]; // Word
            arrWordLen[i][1] = String.valueOf(getLength(words[i])); // Length as String
        }
        return arrWordLen;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a complete text: ");
        String s = input.nextLine();
        
        // Split using custom method
        String[] chr = splittingTxtIntoWords(s);
        
        // Create 2D array of words and their lengths
        String[][] hold = arrayHasWordLength(chr);
        
        // Print results in tabular format (Searched)
        System.out.printf("%-15s %s%n", "Word", "Length");
        System.out.println("---------------------");
        for (String[] e : hold) {
            System.out.printf("%-15s %s%n", e[0], e[1]);
        }
    
        //Closing scanner obj
        input.close();
    }
}