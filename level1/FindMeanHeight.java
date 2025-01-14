import java.util.Scanner;
 class FindMeanHeight {
     public static void main(String[] args) {
        // Creating input scanner Object
        Scanner input = new Scanner(System.in);
		// Creating an array of size 11
		double height[]=new double[11];
		double sum=0;
		// Taking input of number
		for (int i = 0; i < height.length; i++) {
			System.out.print("Enter "+(i+1)+" player height : ");
            height[i]=input.nextDouble();
			
			sum+=height[i];
        }
		
		double meanHeight= sum/11;
		// Print mean height
		System.out.println("The mean height of the football team "+meanHeight);
		
        // Closing the scanner object
        input.close();
	}
 }