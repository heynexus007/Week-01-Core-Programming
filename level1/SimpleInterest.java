//1
import java.util.*;
class SimpleInterest {
	// Method for finding Simple Interest
	public double getSI(double Principal, double Rate, double Time ){
		double simpleInterest= (Principal*Rate*Time)/100;
		return simpleInterest;
	}
    public static void main(String[] args) {
		//Creating Scanner object for taking user input
        Scanner input=new Scanner(System.in);
		// Taking Principal input by user
		System.out.print("Enter Principal : ");
        double Principal=input.nextDouble();
		// Taking Rate input by user
		System.out.print("Enter Rate : ");
        double Rate=input.nextDouble();
		// Taking Time input by user
		System.out.print("Enter Time : ");
		double Time=input.nextDouble();
		
		// Creating class/method object
		SimpleInterest simpleInterest = new SimpleInterest();
		// getting SI by calling getSI (method or function)
		double SI= getSI(Principal,Rate,Time);
		//Print SI
        System.out.println("The Simple Interest is "+SI+" for Principal "+Principal+", Rate of Interest "+Rate+" and Time "+Time);
		
		//closing scanner object
		input.close();
    }
}