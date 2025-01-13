import java.util.*;
class calVolume{
public static void main (String args[]){
	
	// Given raduis Of Earth
	double radius = 6378;
	
	//Calculate volume in Km and Miles
	double volumeInKm = (4/3)* Math.PI* Math.pow(radius,3);
	double volumeInMiles = volumeInKm * 0.62;
	
	System.out.println("The volume of earth in cubic kilometers is " +volumeInKm+" and cubic miles is "+volumeInMiles);

   }
}