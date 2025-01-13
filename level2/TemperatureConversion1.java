//4
import java.util.Scanner;
class TemperatureConversion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // Enter temperature in Celsius
        double celsius = input.nextDouble();
		
		//Coversion of temperature in fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
		
		input.close();
    }
}