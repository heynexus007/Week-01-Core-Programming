//9
import java.util.Scanner;
class QuotientAndRemainder {
	// Method for finding Remainder And Quotient
	public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend : ");
        int dividend = input.nextInt();
        System.out.print("Enter the divisor : ");
        int divisor = input.nextInt();
        
		// Storing method output in 'finalRes' variable
        int[] finalRes = findRemainderAndQuotient(dividend, divisor);
        System.out.println("Quotient : " + finalRes[0] + ", Remainder : " + finalRes[1]);
		
		// Closing Scanner 
		input.close();
    }
}