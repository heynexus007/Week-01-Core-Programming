import java.util.Scanner;
class StringLengthWithoutMethod {

    // Method to find the length of a string without using length()
    public static int getLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count); // Access each character
                count++; // Increment count by 1
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch exception when index is out of bounds
        }
        return count; // Return the length
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String s = input.next();
        
        // Calling user-defined method
        int customLength = getLength(s);
        
        // Calling built-in length() method
        int builtIn = s.length();
        
        // Printing both results
        System.out.println("User-defined Length : " + customLength);
        System.out.println("Built-in Length : " + builtIn);
        
		//Closing scanner obj
        input.close();
    }
}