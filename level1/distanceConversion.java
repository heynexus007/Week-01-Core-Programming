import java.util.Scanner;
class distanceConversion{
public static void main (String args[]){
	Scanner input = new Scanner(System.in);
	
	// Given distance in km
	double distance = input.nextDouble();
	
	// Convert in Miles (1Km = 0.62 Miles)
	double miles = distance*0.62;
	
	System.out.println("The total miles is " + miles +" or the given "+ distance +" km");          

   }
}