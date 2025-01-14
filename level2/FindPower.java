//10
import java.util.Scanner;

class FindPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the base number : ");
        int number = input.nextInt();
		
        System.out.print("Enter the power : ");
        int power = input.nextInt();
		
		// Initialize the result
        int result = 1;

        // Calculate power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by number
        }

        System.out.println(number + " the power of " + power + " is " + result);
		
        input.close();
    }
}