import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // Taking inputs
        System.out.print("Enter the first number : ");
        double first = input.nextDouble();
        
        System.out.print("Enter the second number : ");
        double second = input.nextDouble();
        
        System.out.print("Enter an operator : ");
        String op = input.next();

        // Perform calculation based on the operator
        double result = 0;

        switch (op) {
            case "+":  		// Addition case
                result = first + second;
                break;
				
            case "-":		// Subtraction case
                result = first - second;
                break;
				
            case "*":		// Multiplication case
                result = first * second;
                break;
				
            
			case "/":	// Division case
                if (second != 0) {
                    result = first / second;
                } 
				else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
				
            default:
                System.out.println("Invalid Operator");
                break;
        }

        // Printing the Final result 
		System.out.println("Result " + result);
		
        input.close();
    }
}

