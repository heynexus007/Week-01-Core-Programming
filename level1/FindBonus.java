//17

import java.util.Scanner;
class FindBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter salary
        double salary = scanner.nextDouble();

        // Enter years of service
        int yearsOfService = scanner.nextInt();

        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        System.out.println("The bonus amount is: " + bonus);
    input.close();
    }
}