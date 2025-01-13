//5
import java.util.Scanner;
class TemperatureConversionFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter temperature in Celsius fahrenheit
        double fahrenheit = input.nextDouble();
		
		// Coversion of fahrenheit in temperature
        double celsiusResult = (fahrenheit - 32) * 5/9;

        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
		
		input.close();
    }
}