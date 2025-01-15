import java.util.Scanner;

public class BMICalculator10 {

    // Method1 to check if a number is positive or negative
    public static String isPositive(int number) {
        if (number >= 0) return "positive";
		
        else return "negative";
    }

    // Method2 to check if a positive number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) return "even";
		
		else return "odd";
    }

    // Method3 for comparing two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
		else if (number1 == number2) return 0; 
		else return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check each number if it's positive or negative, and if positive, check if even or odd
        for (int i = 0; i < 5; i++) {
            String result = isPositive(numbers[i]);
            if (result.equals("positive")) {
                String evenOdd = isEven(numbers[i]);
                System.out.println("Number " + numbers[i] + " is positive and " + evenOdd);
            } 
			else {
                System.out.println("Number " + numbers[i] + " is negative");
            }
        }

        // Comparing first and last elements of the array
        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1) {
            System.out.println("The first number is greater than the last number");
        } 
		else if (comparison == 0) {
            System.out.println("The first number is equal to the last number");
        } 
		else {
            System.out.println("The first number is less than the last number");
        }

        // Closing scanner
        input.close();
    }
}
