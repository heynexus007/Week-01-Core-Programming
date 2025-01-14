//12
import java.util.Scanner;

class FindMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        System.out.println("Multiples of " + number + " below 100 are ");
        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) { // Check if i is a multiple of number
                System.out.println(i); // Print the multiple
            }
        }
		
        input.close();
    }
}