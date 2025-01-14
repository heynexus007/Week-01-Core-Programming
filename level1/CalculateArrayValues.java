//4
import java.util.*;

class CalculateArrayValues {
    public static void main(String[] args) {
        // Creating input scanner object
        Scanner input = new Scanner(System.in);
		
        // Creating an array of Max size 10
        double a[] = new double[10];
		int i=0;
        // Printing the each multiplication of number
        while(i<10){
			System.out.print("Enter number : ");
			// Taking input of array elements
			a[i]= input.nextDouble();
			
			// if number <=0, then break the While loop
			if(a[i]<=0)
				break;
			else{
				
			}
			i++;
        }
		
		double total=0;
		for(int j=0; j<a.length;j++){
			total+=a[j];
		}
		
		System.out.println("Total value : ");
        // closing the scanner object
        input.close();
    }
}