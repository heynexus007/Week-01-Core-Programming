//2
import java.util.Scanner;
class CheckLeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input a year
        int year = input.nextInt();
        
        // find if Leap year or Not 
		
		// Check if yrs is divisible by 4-> not by 100 -> 400, 
		// then, it is a leapYear otherwise not a leapYear
        if ((year%4==0) && (year%100!=0 || year%400==0))
			System.out.println("It is a Leap Year");
		
		else if ((year%4==0) && (year%100==0))
			System.out.println("It is not a Leap Year");
		
		else{
		System.out.println("It is not a Leap Year");
		}
		
        input.close();
    }
}
