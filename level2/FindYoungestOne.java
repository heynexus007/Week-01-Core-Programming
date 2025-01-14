//8

import java.util.Scanner;
class FindYoungestOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter ages of Amar, Akbar and Anthony
        int ageAmar = input.nextInt();
		int ageAkbar = input.nextInt();
		int ageAnthony = input.nextInt();
		
        // Enter heights of Amar, Akbar and Anthony in cm
        double heightAmar = input.nextDouble();
		double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();
        
        // Find who is youngest
        // int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
		int youngest = (ageAmar<ageAkbar)? ((ageAmar<ageAnthony)? ageAmar : ageAnthony): ((ageAkbar<ageAnthony)? ageAkbar : ageAnthony);
        String youngestFriend = (youngest == ageAmar) ? "Amar" : (youngest == ageAkbar) ? "Akbar" : "Anthony";
        
        // Find who is tallest
        // double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
		double tallest = (heightAmar>heightAkbar)? ((heightAmar>heightAnthony)? heightAmar : heightAnthony): ((heightAkbar>heightAnthony)? heightAkbar : heightAnthony);
        String tallestFriend = (tallest == heightAmar) ? "Amar" : (tallest == heightAkbar) ? "Akbar" : "Anthony";
        
        System.out.println("Youngest friend: " + youngestFriend);
        System.out.println("Tallest friend: " + tallestFriend);
		
		input.close();
    }
}