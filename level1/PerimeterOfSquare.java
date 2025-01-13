import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
		// Declaring Scanner object
        Scanner input = new Scanner(System.in);

        // Enter the perimeter of the square
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is %.2f whose perimeter is %.2f.%n", side, perimeter);
		
		input.close();
    }
}