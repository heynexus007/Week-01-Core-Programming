//1
import java.util.Scanner;

class CheckArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        int sum = 0, originalNumber = number;

        // Loop to calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Getting the last digit of number
            sum += digit * digit * digit; // Add the cube to sum
            originalNumber /= 10; // Remove the last digit from number
        }

        // Checking if the sum is equal to the original number
        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } 
		else {
            System.out.println(number + " is not an Armstrong number");
        }
		
        input.close();
    }
}