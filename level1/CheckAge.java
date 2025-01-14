//1
import java.util.*;
class CheckAge{
public static void main (String args[]){
	Scanner input = new Scanner(System.in);
	// Declaring Array with 10 integer elements
	int studentAges[] = new int[10];
	for(int idx=0; idx<studentAges.length; idx++){
		// Taking Student's age
		System.out.println("Enter Student Age : ");
		studentAges[idx]= input.nextInt();
		
		// Student age is greater than or equal to 18 can vote
		if(studentAges[idx]>=18){
			System.out.println("The student with the age "+ studentAges[idx]+" can vote");
		}
		
		// Student age is greater than 0 and less than 18 cannot vote
		else if(studentAges[idx]<18 && studentAges[idx]>0){
			System.out.println("The student with the age "+ studentAges[idx]+" cannot vote");
		}
		
		// otherwise invalid age
		else{
			System.out.println("Invalid age");
		}
	}
	
	input.close();
   }
}