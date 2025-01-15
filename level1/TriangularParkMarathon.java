//4
import java.util.Scanner;
class TriangularParkMarathon {
	// Method for the number of rounds user needs to do to complete 5km
	public static int totalRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; //find perimeter
        double distToRun = 5000; // 5 km in meters
        return (int) Math.ceil(distToRun / perimeter);
    }
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
		//Taking user input for 3 sides of a triangle
        System.out.print("Enter the length of side 1 : ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side 2 : ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of side 3 : ");
        double side3 = input.nextDouble();
        
		// Calculate total completeRounds
        int completeRounds = totalRounds(side1, side2, side3);
        System.out.println("Number of rounds to complete 5 km : " + completeRounds);
		
		// Closing Scanner 
		input.close();
    }
}