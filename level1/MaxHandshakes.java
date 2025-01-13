import java.util.Scanner;
public class MaxHandshakes {
    public static void main(String[] args) {
		// Declaring Scanner object
        Scanner input = new Scanner(System.in);

        // Enter the number of students
        int numberOfStudents = input.nextInt();

        int maxHandshakes = (numberOfStudents < 2) ? 0 : (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.printf("The maximum number of handshakes among "+ numberOfStudents+ " students is "+ maxHandshakes);
						   
		input.close();
    }
}