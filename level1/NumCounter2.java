//9
import java.util.Scanner;
class NumCounter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a number for countdown
        int counter = input.nextInt();

        // finding the rocket launch countDown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
		
		input.close();
    }
}