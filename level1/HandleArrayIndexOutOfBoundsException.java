//7
import java.util.Scanner;
class HandleArrayIndexOutOfBoundsException {

    // Method generates ArrayIndexOutOfBoundsException
    public static void generatesException(int [] a) {
        int hold = a[6];
    }

    // Method for Handling the NumberFormatException
    public static void handlesException(int[] a) {
        try {
            generatesException(a);
        } 
		catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Opps! you trying to get index which is not available " + exp.getMessage());
        } 
		catch (RuntimeException exp) {
            System.out.println("ERROR!!! Caught a RuntimeException! " + exp.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a array : ");
        int [] names = new int[3];
		int len=names.length;
		for(int i=0; i<len; i++){
			names[i]= input.nextInt();
		}
        
        // Calling the method to handle the RuntimeException
        handleException(names);
        
		// Closing scanner obj
        input.close();
    }
}