//12
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
			// Another Way
			// System.out.printf("Sum using formula %d Sum using while loop %d Are both results equal? %d " ,SumByF, sum,(SumByF == sum));
        } 
		else {
            System.out.println("The number " + n + " is not a natural number.");
        }
		
		input.close();
    }
}