import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating objects DateTimeFormate
        DateTimeFormatter form= DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter date in format (yyyy-mm-dd) : ");
        String date=input.nextLine();

        LocalDate formatDate= LocalDate.parse(date,form);
        LocalDate updateDate= formatDate.plusDays(7).plusMonths(1).plusYears(2);
        // Updated date after add 7 day, 1 months and 2 years: 
        System.out.println("Updated date : "+ updateDate.format(form));

        LocalDate finalDate= updateDate.minusWeeks(3);
        System.out.println("Final Dates after changing : "+finalDate.format(form));

    }
}
