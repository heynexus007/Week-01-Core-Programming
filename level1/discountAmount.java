import java.util.*;
class discountAmount{
public static void main (String args[]){
	
	// Given Student course fee and discountPercent
	int fee = 125000;
	int discountPercent = 10;
	
	// Calculate discount and final discounted fee 
	int discountFee  = (fee*10)/100;
	int finalFees= fee - discountFee;
	
	System.out.println("The discount amount is INR " +discountFee+" and final discounted fee is INR "+finalFees);

   }
}