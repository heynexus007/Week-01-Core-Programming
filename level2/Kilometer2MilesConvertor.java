//4
import java.util.Scanner;
class Kilometer2MilesConvertor{
	
	 public static double convertKmToMiles(double km) {
		// km to miles = 0.621371;
		 return km*0.621371;
      
    }
	
	 public static double convertMilesTokm(double miles) {	
		// miles to km = 1.60934;
         return miles*1.60934;
      
    }
	 public static double convertMeterToFeet(double meters) {		 
		// meters to feet = 3.28084;
		 return meters*3.28084;
      
    }
	 public static double convertFeetToMeter(double feet) { 
		// feet to meters = 0.3048;
		 return feet*0.3048;
      
    }
	
	public static void main(String[] args){		
		// Creating Scanner object to take user input
		Scanner input = new Scanner(System.in);
		
      // Display options to the user
        System.out.println("Select the conversion type :");
        System.out.println("1 for Kilometers to Miles");
        System.out.println("2 for Miles to Kilometers");
        System.out.println("3 for Meters to Feet");
        System.out.println("4 for Feet to Meters");
        System.out.print("Enter the number of your choice : ");
        
        int choice = input.nextInt(); 

        double result = 0.0;
        //Creating switch cases for Conversions
        switch (choice) {
            case 1:
                // Call method convert km to miles
                System.out.print("Enter kilometers : ");
                double km = input.nextDouble();
                result = convertKmToMiles(km);
                System.out.println(km + " kilometers is equal to " + result + " miles");
                break;
                
            case 2:
                // Call method convert miles to km
                System.out.print("Enter miles : ");
                double miles = input.nextDouble();
                result = convertrMilesTokm(miles);
                System.out.println(miles + " miles is equal to " + result + " kilometers");
                break;
                
            case 3:
                // Call method convert m to feet
                System.out.print("Enter meters : ");
                double meters = input.nextDouble();
                result = convertMeterToFeet(meters);
                System.out.println(meters + " meters is equal to " + result + " feet");
                break;
                
            case 4:
                // Call method convert feet to meters
                System.out.print("Enter feet: ");
                double feet = input.nextDouble();
                result = convertFeetToMeter(feet);
                System.out.println(feet + " feet is equal to " + result + " meters");
                break;
                
            default:
                System.out.println("Invalid choice!!! Please select a valid option");
        }
		// Closing scanner
		input.close();
		
	}
}