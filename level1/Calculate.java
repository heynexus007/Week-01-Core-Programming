
class Calculate{
public static void main (String args[]){
	
	// Given costPrice and selling price
	int costPrice = 129;
	int sellingPrice = 191;
	
	// Finding profit and profit percentage
	double profit = sellingPrice-costPrice;
	double profitPercentage = (profit/costPrice)*100;
	
	System.out.println("The Cost Price is INR " +costPrice+" and Selling Price is INR "+sellingPrice+'\n'+"The Profit is INR " +costPrice+" and the Profit Percentage is "+profitPercentage);

   }
}
