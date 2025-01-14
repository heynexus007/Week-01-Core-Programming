//1
import java.util.Scanner;
class CheckLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input a year
        int year = input.nextInt();
        
        // find Leap year or Not 
        if (year%4==0){
			if(year%100==0){
				if(year%400==0){
				System.out.println("It is a Leap Year");
				}
				else{
				System.out.println("It is not a Leap Year");
				    }
				}

			else{
			System.out.println("It is a Leap Year");
			}
			}
		else{
		System.out.println("It is not a Leap Year");
		}
    input.close();
    }
}
