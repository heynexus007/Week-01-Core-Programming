//12
import java.util.Random;
class get4DigitRandomNumber {

    // Another Method2 to find average, min and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculating average
        double average = (double) sum / numbers.length;

        // Return average, min, and max in a double array
        return new double[]{average, min, max};
    }
	
	// Method1 to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];

        // Generate 4-digit random numbers
        for (int i = 0; i < size; i++) {
			// Generates numbers from 1000 to 9999
            numbers[i] = (int)(Math.random()*9000)+1000; 
        }

        return numbers;
    }

    public static void main(String[] args) {
        int size = 5;

        // Generates the 4-digit random numbers array
        int[] randomNo = generate4DigitRandomArray(size);

        // Find average, min, and max values
        double[] result = findAverageMinMax(randomNo);

        // Printing the results
        System.out.print("Generated 4-digit random numbers : ");
        for (int num : randomNo) {
            System.out.print(num + " ");
        }

        System.out.println("\nAverage : " + result[0]);
        System.out.println("Minimum : " + result[1]);
        System.out.println("Maximum : " + result[2]);
    }
}
