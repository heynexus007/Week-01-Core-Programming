//14
import java.util.Scanner;
class FindFactorialUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // Enter a positive integer
        int number = input.nextInt();

        // Checking no. is +ve intger or not
        if (number >= 0) {
            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } 
        else {
            System.out.println("Please enter a positive integer.");
        }
        input.close();
    }
}