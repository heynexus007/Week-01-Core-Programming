//14
import java.util.Scanner;
class FindFactorialUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // Enter a positive integer
        int number = input.nextInt();

        // Checking no. is +ve integer or not
        if (number >= 0) {
            int factorial = 1;
            // Calculating Factorial
            for(int i=1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } 
        else {
            System.out.println("Please enter a positive integer.");
        }
        input.close();
    }
}