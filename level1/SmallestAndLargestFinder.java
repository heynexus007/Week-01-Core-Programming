//8
import java.util.Scanner;
class SmallestAndLargestFinder {
	// Method for finding largest and smallest
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
		// Taking 3 numbers as input
        System.out.print("Enter first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Enter third number : ");
        int thirdNumber = input.nextInt();
        
		// Storing method output in 'finalRes' variable
        int[] finalRes = findSmallestAndLargest(firstNumber, secondNumber, thirdNumber);
        System.out.println("Smallest: " + finalRes[0] + ", Largest: " + finalRes[1]);
		
		// Closing Scanner 
		input.close();
    }
}