//8
import java.util.*;

class FindWhoIsYoungestTall {
	
	public static void getYougest(double age[],String name[]){
		
		// Suppose amar is yougest with this we calculate yougest age 
		double youngest = age[0];
		String youngestFrnd = name[0];
		
		for(int i=0;i<3;i++){
			if(youngest>age[i]){
				youngest = age[i];
				youngestFrnd = name[i];
			}
		}

        // Display the youngest friend 
        System.out.println("The youngest friend is " + youngestFrnd + " with age " + youngest);	
	}
	
	public static void getTallest(double height[],String name[]){
	// Suppose amar is tallest with this we calculate tallest height
		double tallest = height[0];
		String tallestFrnd = name[0];
		
		for(int i=0;i<3;i++){
			if(tallest<height[i]){
				tallest = height[i];
				tallestFrnd = name[i];
			}
		}
		// Display the tallest friend
		System.out.println("The tallest friend is " + tallestFrnd + " with height " + tallest);
	}
    public static void main(String[] args) {
		
        // Creating the Scanner object to get input
        Scanner input = new Scanner(System.in);
        
		// Creating Age nd Height array for 3 friends
		double age[] = new double[3];
		double height[] = new double[3];
		String name[] = {"Amar","Akbar","Anthony"};
		
		
		
		for(int i=0;i<3;i++){		  
	   System.out.print("Enter the Age "+name[i] +" : ");
	  
	   // Taking age as input for user
	    age[i] = input.nextDouble();
	  
	    System.out.print("Enter the height "+name[i]+" : ");
	  
	     // Taking height as input for user
	    height[i] = input.nextDouble();
		}
		
		// Calling methohs to return yougest and tallest
		getYougest( age, name);
		getTallest( height, name);
		
		// Closing scanner
		input.close();
    }
}