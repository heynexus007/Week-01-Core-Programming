//6
import java.util.Scanner;
class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter salary
        double salary = input.nextDouble();
        // Enter bonus
        double bonus = input.nextDouble();
		// Calculate totalIncome
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
		
		input.close();
    }
}