//2
import java.util.Scanner;
class MaximumHandshakes {
	// Method for calculating Handshakes
	public static int calHandshakes(int n) {
        return (n * (n - 1)) / 2; // finding combinations
    }
	
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int nStudents = input.nextInt();
		
		// Calling method to get the number of handshakes
        int handShakes = calHandshakes(nStudents);
        System.out.println("Maximum number of handshakes : " + handShakes);
		
		// Closing Scanner 
		input.close();
    }
}