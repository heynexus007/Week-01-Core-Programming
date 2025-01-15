// 5
import java.util.Scanner;
class UnitConvertor{
	
	 public static double ConvertYardsToFeet(double yards) {
		// yards to feet = 3;
		 return yards*3;
      
    }
	 public static double ConvertFeetToYards(double feet) {
		
		// feet to yards = 0.333333
         return feet*0.333333;
      
    }
	 public static double ConvertMeterToInches(double meters) {
		// meters to inches = 39.3701;
		 return meters*39.3701;
      
    }
	 public static double ConvertInchesToMeter(double inches) {
		// inches to meters = 0.0254;
		 return inches*0.0254;
      
    }
	 public static double ConvertInchesToCm(double inches2) {
		// inches to cm = 2.54
		 return inches2 * 2.54;
      
    }
	
	public static void main(String[] args){		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
      // Displaying options to the user
        System.out.println("Select a conversion type:");
        System.out.println("1 for yards to feet");
        System.out.println("2 for feet to yards");
        System.out.println("3 for Meters to inches");
        System.out.println("4 for inches to Meters");
		System.out.println("5 for inches to cm");
        System.out.print("Enter the number of your choice : ");
        
        int option = input.nextInt(); 

        double result;
        // Creating Switch case for Conversions
        switch (option) {
            case 1:
                // Call method convert yards to feet
                System.out.print("Enter yards : ");
                double yards = input.nextDouble();
                result = ConvertYardsToFeet(yards);
                System.out.println(yards + " yards is equal to " + result + " feet");
                break;
                
            case 2:
                // Call method convert feet to yards
                System.out.print("Enter feet : ");
                double feet = input.nextDouble();
                result = ConvertFeetToYards(feet);
                System.out.println(feet + " miles is equal to " + result + " yards");
                break;
                
            case 3:
                // Call method convert meters to feet
                System.out.print("Enter meters : ");
                double meters = input.nextDouble();
                result = ConvertMeterToInches(meters);
                System.out.println(meters + " meters is equal to " + result + " inches");
                break;
                
            case 4:
                // Call method convert inches to meters
                System.out.print("Enter inches : ");
                double inches = input.nextDouble();
                result = ConvertInchesToMeter(inches);
                System.out.println(inches + " inches is equal to " + result + " meters");
                break;
				
			case 5:
                // Call method convert inches to cm
                System.out.print("Enter inches : ");
                double inches2 = input.nextDouble();
                result = ConvertInchesToCm(inches2);
                System.out.println(inches2 + " inches is equal to " + result + " cm");
                break;
                
            default:
                System.out.println("Invalid choice!!! Please select a valid option.");
        }
		// Closing scanner
		input.close();
	}
}
