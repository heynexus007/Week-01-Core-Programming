//10
import java.util.Scanner;
class ChocolateDistribution {
	// Method for finding chocolates to be distributed
	public static int[] distributedChocos(int chocolates, int children) {
        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }
    public static void main(String[] args) {
		// Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of chocolates : ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children : ");
        int numberOfChildren = input.nextInt();
        
		// Storing method output in 'finalRes' variable
        int[] finalRes = distributedChocos(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates per child : " + finalRes[0] + ", Remaining chocolates : " + finalRes[1]);
		
		// Closing Scanner 
		input.close();
    }
}