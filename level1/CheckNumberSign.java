//7
import java.util.Scanner;
class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter month from 1-12 
        int month = input.nextInt();
        // Enter day from 1-31
        int day = input.nextInt();

        boolean isSpringS = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        
        if (isSpringS) {
            System.out.println("It's a Spring Season");
        } 
		else {
            System.out.println("Not a Spring Season");
        }
		
		input.close();
    }
}