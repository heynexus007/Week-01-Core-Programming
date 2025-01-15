//9
import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for rows and columns
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();
		
        System.out.print("Enter number of columns : ");
        int columns = input.nextInt();
        
        // Creating a 2D array or (Matrix)
        int[][] matrix = new int[rows][columns];
        
        // Taking user input for 2D matrix elements
        System.out.println("Enter the elements of the matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Creating a 1D array to copy the elements
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
				index++;
            }
        }

        // Print final 1D Array
        System.out.println("Elements in 1D Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
