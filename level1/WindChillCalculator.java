//11
import java.util.Scanner;
class WindChillCalculator {
	// Method for finding calculateWindChill
	public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour : ");
        double windSpeed = input.nextDouble();
        
		// Storing method output in 'windChill' variable
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is : " +windChill);
		
		// Closing Scanner 
		input.close();
    }
}