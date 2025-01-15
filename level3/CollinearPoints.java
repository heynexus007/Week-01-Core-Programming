//10 
import java.util.*;

class CollinearPoints {
    // Method for checking collinearity using Slope formula
    public static boolean pCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate Slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if all both Slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method for checking collinearity using area of triangle formula
    public static boolean pCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double A = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return A == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input coordinates of 3 points
        System.out.print("Enter x1 and y1 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2 : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3 and y3 : ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Check collinearity using slope formula
        boolean coliBySlope = pCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope method : " + coliBySlope);

        // Check collinearity using area of triangle formula
        boolean coliByArea = pCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area method : " + coliByArea);

        // Sample test for A(2,4), B(4,6), C(6,8)
        System.out.println("Sample Test for A(2,4), B(4,6), C(6,8) : ");
        System.out.println("Collinear using slope method : " + pCollinearUsingSlope(2, 4, 4, 6, 6, 8));
        System.out.println("Collinear using area method : " + pCollinearUsingArea(2, 4, 4, 6, 6, 8));
		
		// Closing Scanner 
		input.close();
    }
}