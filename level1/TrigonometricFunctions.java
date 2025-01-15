//12
import java.util.Scanner;
class TrigonometricFunctions {
	// Method for finding Trigonometric Functions
	public static double[] calculateTrigonometricFunctions(double angle) {
        double angleInRadians = Math.toRadians(angle);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[]{sine, cosine, tangent};
    }
	
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees : ");
        double angleInDegrees = input.nextDouble();
        
		// Storing method output in 'finalRes' variable
        double[] finalRes = calculateTrigonometricFunctions(angleInDegrees);
        System.out.println("Sine : "+finalRes[0]+", Cosine : "+finalRes[1]+", Tangent : "+ finalRes[2]);
		
		// Closing Scanner 
		input.close();
    }
}