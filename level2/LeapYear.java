//3
import java.util.Scanner;
class LeapYear{
	// Method for checking Leap year or Not
	public static boolean leapYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		
		else
			return false;			
	}
	public static void main(String [] args){
		// Creating Scanner object
		Scanner input = new Scanner(System.in);
		// Taking year input by user
		System.out.print("Enter a year for checking leap year : ");
		int year = input.nextInt();
		
		// If the year is less 1582, ERROR so ReEnter Year again
		if(year < 1582){
			System.out.println("ERROR! Please Enter a valid year ");
			return;
		}
		System.out.print(leapYear(year));
		// Closing scanner
		input.close();
	}
}