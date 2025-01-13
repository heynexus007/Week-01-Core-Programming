//3
import java.util.Scanner;
class GetLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter number1, number2 and number3
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        boolean is1Largest = (number1 >= number2) && (number1 >= number3);
        boolean is2Largest = (number2 >= number1) && (number2 >= number3);
        boolean is3Largest = (number3 >= number1) && (number3 >= number2);

        System.out.println("Is the first number the largest? " + (is1Largest? "YES" : "NO"));
        System.out.println("Is the second number the largest? " + (is2Largest? "YES" : "NO"));
        System.out.println("Is the third number the largest? " + (is3Largest? "YES" : "NO"));
		
		input.close();
    }
}