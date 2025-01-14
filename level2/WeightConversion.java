import java.util.Scanner;
class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter weight (in pounds): ");
        double weightInPounds = input.nextDouble();
        double weightInKg = weightInPounds / 2.2;

        System.out.println("The weight of the person in pounds is "+weightInPounds+" and in kg is "+weightInKg);
		
		input.close();
    }
}

