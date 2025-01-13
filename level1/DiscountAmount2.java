import java.util.Scanner;
class DiscountAmount2{
public static void main (String args[]){
	// Declaring Scanner object
	Scanner input = new Scanner(System.in);
	
	// Given Student course fee and discountPercent
	int fee = input.nextInt();
	double discountPercent = input.nextDouble();
	
	// Calculate discount and final discounted fee 
	int discountFee  = (fee*10)/100;
	int finalFees= fee - discountFee;
	
	System.out.println("The discount amount is INR " +discountFee+" and final discounted fee is INR "+finalFees);
	
	input.close();

   }
}