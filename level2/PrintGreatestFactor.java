//9
import java.util.Scanner;

class PrintGreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
		
		// Initializing greatestFactor
        int greatestFactor = 1;

        // Loop from number - 1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor
                greatestFactor = i; // assign i to greatest factor
                break; // exit the loop if the greatest factor is found
            }
        }

        System.out.println("The greatest factor of " + number + " is : " + greatestFactor);
		
        input.close();
    }
}