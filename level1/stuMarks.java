
class StuMarks{
public static void main (String args[]){
	
	// Sam’s mark in subject
	int Maths = 94;
	int Physics = 95;
	int Chemistry = 96;
	
	double totalMarksObtained = Maths + Physics + Chemistry ;
	
	
	// Average percent = (Marks obtained / total marks)*100 
	double avg = ( totalMarksObtained / 300.0) * 100;
	
	System.out.println("Sam’s average marks in PCM is " + avg);          

   }
}