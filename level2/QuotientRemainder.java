import java.util.Scanner;
class QuotientRemainder {
    public static void main(String[] args) {
		// Declaring Scanner object
        Scanner input = new Scanner(System.in);
		
        // Enter number1 and number2
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
		
		input.close();
    }
}