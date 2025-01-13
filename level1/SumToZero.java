//10
import java.util.Scanner;
class SumToZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        
		// Declare Variable number
		double number;
        while (true) {
            // Enter a number
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
			// Sum number until Zero
            total += number;
        }

        System.out.println("The total sum is: " + total);
		
		input.close();
    }
}