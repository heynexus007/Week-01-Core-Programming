//8
import java.util.Scanner;
class NumCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // Enter a number for countdown or counting
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
			
		input.close();
        }
    }
}