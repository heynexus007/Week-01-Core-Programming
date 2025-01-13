import java.util.Scanner;
class findAge{
public static void main (String args[]){
	Scanner ip=new Scanner (System.in);
	
	// Birth year of Harry
	int dob= 2000;
	
	// Current Year
	int curYear= 2024;
	
	System.out.println("Harry's age in "+ curYear+" is " + (curYear-dob));

	ip.close();

}
}