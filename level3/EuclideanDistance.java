//9
import java.util.*;

class EuclideanDistances {
    // Method to calculate Euclidean distance
    public static double calcDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the Slope and Y-intercept of a Line
    public static double[] calcLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input of coordinates of two points
        System.out.print("Enter x1 : ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1 : ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2 : ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2 : ");
        double y2 = input.nextDouble();

        // Calculate and display the Euclidean distance
        double eDistance = calcDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance : "+  eDistance);

        // Calculate and display the line equation
        if (x1 != x2) { // Ensure the points do not form a vertical line
            double[] lineEqn = calcLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the line : y = "+lineEqn[0]+"x + "+ lineEqn[1]);
        } else {
            System.out.println("The line is vertical, equation : x = " + x1);
        }
		
		// Closing Scanner 
		input.close();
    }
}