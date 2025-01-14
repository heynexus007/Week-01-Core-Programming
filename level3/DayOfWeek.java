//5
import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Taking inputs
        System.out.print("Enter month : ");
        int m = input.nextInt();
        System.out.print("Enter day : ");
        int d = input.nextInt();
        System.out.print("Enter year : ");
        int y = input.nextInt();

        // Calculating y0, x, m0, and d0
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

		// Printing the day of the week
        System.out.println("Day of the week: " + d0);
		
        input.close();
    }
}