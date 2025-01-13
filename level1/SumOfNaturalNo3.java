//13
import java.util.Scanner;
class SumOfNaturalNo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking a natural number
        int n = input.nextInt();

        if (n > 0) {
            // Using formula
            int SumByF = n * (n + 1) / 2;

            // Using for loop
            int sum = 0;
            for (int i=1; i <= n; i++) {
                sum += i;
            }

            // Comparing both results
            System.out.println("Sum using formula " + SumByF+" Sum using while loop " + sum+ " Are both results equal? " + (SumByF == sum));
        } 
		else {
            System.out.println("The number " + n + " is not a natural number.");
        }
		
		input.close();
    }
}