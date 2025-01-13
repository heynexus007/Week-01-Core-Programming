//11
import java.util.Scanner;
class SumToZero2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            // Enter a number
            double number = input.nextDouble();
			
			// when num is Negative or 0, it will brake and Print output
            if (number <= 0) {
                break;
            }
            total += number;
        }

        System.out.println("The total sum is: " + total);
		
		input.close();
    }
}