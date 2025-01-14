//6
import java.util.*;
 class FizzBuzz {
     public static void main(String[] args) {
        // Creating input scanner Object
        Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		// Taking input of number
		int number=input.nextInt();
		int res;
		String s[]=new String[];
		if(number>0){
			for(int i=0; i<=number; i++){
				if(i%3==0 && i%5==0)
					s[i]="FizzBuzz";
				
				else if(i%5==0)
					s[i]="Buzz"
				
				else if(i%3==0)
					s[i]="Fizz";
				else
					s[i]=Integer.toString();
				
				System.out.println("Position"+(i) +" = "+ s[i]);
			}
		}
		
		// Print the even and odd array elements;
		//System.out.println("Even array elements : " +evenArray[i]);
		
		
        // Closing the scanner object
        input.close();
	}
 }