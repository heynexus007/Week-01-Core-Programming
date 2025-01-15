//1
import java.util.Scanner;

class FindEmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declaring arrays for salaries and years of service
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
		// Creating & initializing Variable
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // loop for Collecting employee data
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + " : ");
                salaries[i] = input.nextDouble();
                if (salaries[i] < 0) {
                    System.out.println("Invalid salary! Please enter a positive number.");
                    continue;
                }
                
                System.out.print("Enter years of service for employee " + (i + 1) + " : ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service! Please enter a non-negative number.");
                    continue;
                }
                break; // Exit the loop if valid input is received by employee
            }
        }

        // Calculate bonuses and their new salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = (salaries[i] * 5)/100; // 5% bonus
            } 
			else {
                bonuses[i] = (salaries[i] * 2)/100; // 2% bonus
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print total bonuses payout and salaries
        System.out.println("Total Bonus Payout : "+ totalBonus);
        System.out.println("Total Old Salary : "+ totalOldSalary);
        System.out.println("Total New Salary : "+ totalNewSalary);
        
        // Closing Scanner object
        input.close(); 
    }
}