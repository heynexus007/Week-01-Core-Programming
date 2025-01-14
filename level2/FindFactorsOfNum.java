//11
import java.util.Scanner;

class FindFactorsOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        System.out.println("Factors of " + number + " are ");
        // Loop from 1 to (number - 1)
        for (int i = 1; i < number; i++) {
			// Check if i is a factor
            if (number % i == 0) { 
                System.out.println(i);
            }
        }
		
        input.close();
    }
}