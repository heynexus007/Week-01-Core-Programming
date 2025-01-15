//1
//importing Random and Scanner package
import java.util.Random;
import java.util.Scanner;

//making a class for finding shortest tallest and mean height of the football players
public class FootballTeamSquad {
    public static void main(String[] args) {
		// function 1 for finding Sum
		public static int getSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
		// function 1 for finding Mean
		public static double getMean(int sum, int length) {
        return (double) sum / length;
    }
		// function 1 for finding Shortest
		public static int getShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
		// function 1 for finding Tallest
		public static int getTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
        // Creating Scanner class object 
        Scanner input = new Scanner(System.in);
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 11; i++) {
			// Random height between 150 and 250
            heights[i] = rand.nextInt(101) + 150; 
        }
		// Storing in Result in particular variable
        int v1 = getSum(heights);
        double v2 = getMean(v1, heights.length);
        int v3 = getShortest(heights);
        int v4 = getTallest(heights);

        System.out.println("Sum of heights : " + v1);
        System.out.println("Mean height : " + v2);
        System.out.println("Shortest height : " + v3);
        System.out.println("Tallest height : " + v4);
		
		// Closing Scanner 
		input.close();
    }
}
