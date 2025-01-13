import java.util.Scanner;
public class DistanceConversion2 {
    public static void main(String[] args) {
		// Declaring Scanner object
        Scanner input = new Scanner(System.in);

        // Enter the distance (in feet)
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance is "+ distanceInYards+" yards or "+ distanceInMiles+" miles.");
		
		input.close();
    }
}