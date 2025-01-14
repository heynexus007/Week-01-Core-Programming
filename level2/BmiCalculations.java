//7

import java.util.Scanner;
class BmiCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter weight and height of a person
		System.out.print("Enter weight in kg : ");
        double weight = input.nextDouble();
		
        System.out.print("Enter height in cm : ");
        double height = input.nextDouble();
        
		// Convert cm to meters
        double heightInM = height / 100; 
        double BMi = weight / (heightInM * heightInM);
        
        System.out.println("Your BMI is: "+ BMi);
        
        if (BMi <= 18.4) {
            System.out.println("Underweight");
        } 
		else if (BMi >= 18.5 && BMi <= 24.9) {
            System.out.println("Normal weight");
        } 
		else if (BMi >= 25.0 && BMi <= 39.9) {
            System.out.println("Overweight");
        } 
		else {
            System.out.println("Obese");
        }
		
		input.close();
    }
}