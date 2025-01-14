//3
import java.util.*;

class PrintMultiplicationTables {
    public static void main(String[] args) {
        // Creating input scanner object
        Scanner input = new Scanner(System.in);
        // taking input of number
        System.out.println("Enter number : ");
        int number = input.nextInt();
        // creating an array of size 10
        int table[] = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i]=number * (i+1);
        }
        // printing the each multiplication of number
        System.out.println("Printing Table : ");
        int i = 1;
        for (int each : table) {
            System.out.println(number +" * "+ i +" = "+each);
            i++;
        }
        // closing the scanner object
        input.close();
    }
}