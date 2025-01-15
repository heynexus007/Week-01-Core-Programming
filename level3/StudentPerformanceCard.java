// Importing required class from util pkg 
import java.util.Random;
import java.util.Scanner;

// Creating a class for calculating Student Scores
class StudentPerformanceCard {

    public static int[][] generatesRandomScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
			// Random marks for Physics, Chemistry and Maths (between 30 and 100)
            scores[i][0] = 30 + rand.nextInt(71);  
            scores[i][1] = 30 + rand.nextInt(71);  
            scores[i][2] = 30 + rand.nextInt(71);  
        }
        return scores;
    }

    public static double[][] calculatingScores(int[][] scores) {
		// Total, Average, Percentage
        double holdResult = new double[scores.length][4]; 
		//Loop
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            holdResult[i][0] = total;
            holdResult[i][1] = Math.round(avg * 100.0) / 100.0;  // Rounding to 2 decimals
            holdResult[i][2] = Math.round(percentage * 100.0) / 100.0;  // Rounding to 2 decimals
        }
        return results;
    }
	// Display Final Scores Card
    public static void finalScorecard(int[][] scores, double[][] holdResult) {
        System.out.println("Student Scorecard : ");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f\n",
                i + 1, scores[i][0], scores[i][1], scores[i][2],
                holdResult[i][0], holdResult[i][1], holdResult[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int numStudents = input.nextInt();

        int[][] scores = generatesRandomScores(numStudents);
        double[][] results = calculatingScores(scores);
        finalScorecard(scores, holdResult);
    }
}
