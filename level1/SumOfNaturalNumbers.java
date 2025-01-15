//7
import java.util.Scanner;
class SumOfNaturalNumbers {
	// Method for calculating sum
	public static int calcSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
	
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int vN = input.nextInt();
		// Storing method output in 'calsum' variable
        int calsum = calcSum(vN);
        System.out.println("Sum of first " + vN + " natural numbers: " + calsum);
		
		// Closing Scanner 
		input.close();
    }   
}