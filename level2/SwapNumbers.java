//7
import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter number1 and number2
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
		
		// closing Scanner object
		input.close();
    }
}