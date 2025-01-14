import java.util.Scanner;
class CalculateGrades{
public static void main (String args[]){
	Scanner input = new Scanner(System.in);
	// Sam’s mark in subject
	int Maths = input.nextInt();
	int Physics = input.nextInt();;
	int Chemistry = input.nextInt();;
	
	double totalMarksObtained = Maths + Physics + Chemistry ;
	
	
	// Average percent = (Marks obtained / total marks)*100 
	double avg = ( totalMarksObtained / 300.0) * 100;
	
	if(avg>=80)
		System.out.println("Grade: A, Remarks: (Level 4, above agency-normalized standards) and Average marks: " + avg);
	
	else if(avg>=70 && avg<80)
		System.out.println("Grade: B, Remarks: (Level 3, at agency-normalized standards) and Average marks: " + avg);
	
	else if(avg>=60 && avg<70)
		System.out.println("Grade: C, Remarks: (Level 2, but approaching agency-normalized standards) and Average marks: " + avg);
	
	else if(avg>=50 && avg<60)
		System.out.println("Grade: D, Remarks: (Level 1, well below agency-normalized standards) and Average marks: " + avg);
	
	else if(avg>=40 && avg<50)
		System.out.println("Grade: E, Remarks: (Level 1, too below agency-normalized standards) and Average marks: " + avg);
	
	else if(avg<39)
		System.out.println("Grade: R, Remarks: (Remedial tandards) and Average marks: " + avg);          

   }
}