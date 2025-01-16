//7
import java.util.Scanner;
class HandlingNumberFormatException {

    // Method generates NumberFormatException
    public static void generatesException(String v) {
        // This will throw NumberFormatException if input is not a valid int
        int number = Integer.parseInt(v);
        System.out.println("Parsed number : " + number);
    }

    // Method for Handling the NumberFormatException
    public static void handlesException(String v) {
        try {
            generatesException(v);
        } 
		catch (NumberFormatException exp) {
            System.out.println("Caught a NumberFormatException! " + exp.getMessage());
        } 
		catch (RuntimeException exp) {
            System.out.println("Caught a RuntimeException! " + exp.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a String or Number : ");
        String s = input.nextLine();
        
        // Calling the method to handle the RuntimeException
        handleException(s);
        
        input.close();
    }
}