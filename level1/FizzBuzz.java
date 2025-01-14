//10
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a positive integer : ");
        int number = input.nextInt();
        
        // Creating a String array to save results
        String[] results = new String[number + 1];

        if(number>0){
			// Loop starts from 0 to the number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                results[i] = "FizzBuzz";
			
            else if (i % 3 == 0)
                results[i] = "Fizz";
            
			else if (i % 5 == 0)
                results[i] = "Buzz";
            
			else
                results[i] = String.valueOf(i);
        }
		}

        // Printing the results
        System.out.println("FizzBuzz results : ");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
		
		// Closing the scanner object
		input.close();
    }
}
