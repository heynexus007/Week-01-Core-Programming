
//18
import java.util.Scanner;
class GetMultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a number
        int number = input.nextInt();
        
        // Multiplication 
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    input.close();
    }
}