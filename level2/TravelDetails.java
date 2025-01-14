import java.util.Scanner;
class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user inputs for traveller details
        // Enter your name
        String name = input.nextLine();

        // Enter the city you are traveling from
        String fromCity = input.nextLine();

        // Enter the city you are traveling via
        String viaCity = input.nextLine();

        // Enter the final destination city
        String toCity = input.nextLine();

        // Enter the distance from " + fromCity + " to "  
        // + viaCity + " (in miles)
        double fromToVia = input.nextDouble();

        // Enter the distance from " + viaCity + " to " 
        // + toCity + " (in miles)
        double viaToFinalCity = input.nextDouble();

        // Enter the time taken for the journey (in hours)
        double timeTaken = input.nextDouble();

        // Calculating total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and " + "Average speed is " + averageSpeed + " miles per hour");

	  input.close();
    }
}

