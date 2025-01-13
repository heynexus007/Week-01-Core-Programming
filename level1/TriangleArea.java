import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
		// Declaring Scanner object
        Scanner input = new Scanner(System.in);

        // Enter the base of the triangle (in inches)
        double base = input.nextDouble();

        // Enter the height of the triangle (in inches)
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        System.out.println("The area of the triangle is "+ areaInInches+" square inches or "+ areaInCm+" square centimeters.");
		
		input.close();
    }
}
