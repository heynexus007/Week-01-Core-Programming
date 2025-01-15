//5
import java.util.Scanner;
class SignnCheckerr {
	public static int getSign(int number) {
        if (number > 0) return 1; // Positive       
		else if (number < 0) return -1; // Negative       
		else return 0; // Zero
    }
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
		// taking integer value from user
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        int finalRes = getSign(number);
        System.out.println("Result : " + finalRes);
		
		// Closing Scanner 
		input.close();
    }
}