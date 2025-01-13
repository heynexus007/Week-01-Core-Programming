import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
		// Declaring Scanner object
        Scanner input = new Scanner(System.in);

        // Enter the unit price (in INR):
        double unitPrice = input.nextDouble();

        // Enter the quantity
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "+ totalPrice+" if the quantity is "+ quantity+" and the unit price is INR " +unitPrice);
	    
		input.close();
    }
}