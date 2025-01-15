//7
import java.util.Scanner;
public class StudentVoteChecker{
	
	public static boolean canStudentVote(int age){
		// check age is not negative
	if (age < 0) return false;
        // Check age is 18 or above 
        return age >= 18;
    }
		
	
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  // Creating an array of ages
	  int age[] = new int[10];
	  
	  // loop for input for getting student age
	  for(int i=0; i<age.length;i++){   
		// taking StudAge as input
		System.out.print("\nEnter student age : "+(i+1)+" ");
	    age[i]= input.nextInt();
	  }
	  
        // Check eligibility age for voting
	    for(int i=0; i<age.length;i++){
			boolean resHold = canStudentVote(age[i]);
		
		if(resHold){			
			System.out.println("The student with the age "+age[i]+" can vote ");
		}
		else{			
			System.out.println("The student with the age "+age[i]+" cannot vote ");
		}
	  }
	  // Closing scanner
		input.close();
	}
}