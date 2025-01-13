import java.util.Scanner;
class heightConvo10{
public static void main (String args[]){
	// Declaring Scanner object
	Scanner input = new Scanner(System.in);
	
	// Taking height in input
	double height = input.nextDouble();
	
	// Calculate height feets and inches
	double inch = height/2.54;
	int feet = (int)inch/12;
	int remInches = (int) inch
	
	System.out.println("Your Height in cm is " +height+" while in feet is "+feet+ " and inches is "+remInches);
	
	input.close();

   }
}