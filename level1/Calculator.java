import java.util.Scanner;
class Calculator{
public static void main (String args[]){
	// Declaring Scanner object
	Scanner input = new Scanner(System.in);
	
	// Taking inputs
	float number1 = input.nextFloat();
	float number2 = input.nextFloat();
	
	// Calculation
	float add = number1 + number2;
	float sub = number1 - number2;
	float multi = number1 * number2;
	float div = number1 / number2;
	
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +number1+" and "+number2+ " is "+add+", "+sub+", "+multi+", and "+div);
	
	input.close();

   }
}