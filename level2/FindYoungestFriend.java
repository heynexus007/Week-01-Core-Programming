//2
import java.util.Scanner;

public class FindYoungestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Creating Arrays to store ages and heights of friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // loop for taking ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + " : ");
            ages[i] = input.nextInt();
			
            System.out.print("Enter height of " + names[i] + " : ");
            heights[i] = input.nextDouble();
        }

        int youngestIdx = 0;
        int tallestIdx = 0;
		
		// Find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIdx]) {
                youngestIdx = i;
            }
            if (heights[i] > heights[tallestIdx]) {
                tallestIdx = i;
            }
        }

        // Printing the results
        System.out.println("Youngest friend : " + names[youngestIdx] + " ( Age : " + ages[youngestIdx] + " )");
        System.out.println("Tallest friend : " + names[tallestIdx] + " ( Height : " + heights[tallestIdx] + " )");
        
        // Close the scanner
        input.close();
    }
}
