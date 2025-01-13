import java.util.*;
class penDistribution{
public static void main (String args[]){
	
	// Given Pens and Students
	int pens = 14;
	int students = 3;
	
	// find 
	int havePen = pens%students; //Math.floor(pens/students);
	int remPens= pens/students;
	
	System.out.println("The Pen Per Student is " +havePen+" and the remaining pen not distributed is "+remPens);

   }
}