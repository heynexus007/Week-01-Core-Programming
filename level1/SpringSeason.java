//6
import java.util.Scanner;
class SpringSeason {
	// Method for Spring season check
	public static boolean checkSpringS(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }
	
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
		// Taking month input 1-12
        System.out.print("Enter month : ");
        int month = input.nextInt();
		// Taking month input 1-31
        System.out.print("Enter day : ");
        int day = input.nextInt();
        
		// store method in isSpringS variable
        boolean isSpringS = checkSpringS(month, day);
        System.out.println(isSpringS ? "Its a Spring Season" : "Not a Spring Season");
		
		// Closing Scanner 
		input.close();
    }
}