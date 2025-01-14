//2
import java.util.*;
class NumberChecker{
public static void main (String args[]){
	// Creating Scanner object
	Scanner input = new Scanner(System.in);
	// Declaring Array with 10 integer elements
	int arr[] = new int[5];
	System.out.println("Enter 5 numbers : ");
	for(int idx=0; idx<arr.length; idx++){
		// Taking Student's age
		arr[idx]= input.nextInt();
	}
	
	for(int idx=0; idx<arr.length; idx++){
		// check number is positive, negative and zero 
		// check number is even and odd 
		if(arr[idx]>0){
			if(arr[idx]%2==0)
				System.out.println("The number is Even");
			
			else
				System.out.println("The number is Odd");
		}
		
		else{
			if(arr[idx]==0)
				System.out.println("The number is Zero");
			
			else
				System.out.println("The number is negative");
		}
		
	
		}
		// checking first element is greater than last element of array
		if(arr[0]>arr[arr.length-1]){
			System.out.println("The first element of array is greater");
			System.out.println("The last element of array is less");
		}
		// checking last element is greater than first element of array
		else if(arr[arr.length-1]>arr[0]){
		    System.out.println("The first element of array is less");
			System.out.println("The last element of array is greater");
			
		}
		// checking first element is equal to last element of array
		else if(arr[0]==arr[arr.length-1])
			System.out.println("The first and last element of array is equal");
		
		input.close();
	}	
}