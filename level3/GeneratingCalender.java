//8
import java.util.*;

class GeneratingCalender {

    // Creating Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; 	// Leap year adjustment for February
        }
        return days[month - 1];
    }
	
	// Creating Method to get the month name
    public static String gettingMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Creating method to check if a year is a leap year or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Creating Method to get the first day of the month
    public static int get1stDayOfMonth(int month, int year) {
        int d = 1; // Day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
		// 0 = Sunday, 1 = Monday,2 = Tues, ..., 6 = Saturday
        return (d + x + (31 * m0) / 12) % 7; 
    }

    // Method to print calendar
    public static void displayCalendar(int month, int year) {
        System.out.println(gettingMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = get1stDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Printing all days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.println("%3d",day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for month and year
        System.out.print("Enter month (1-12) : ");
        int month = input.nextInt();
        System.out.print("Enter year : ");
        int year = input.nextInt();

        // Printing the calendar
        displayCalendar(month, year);

        // closing the scanner 
        input.close();
    }
}