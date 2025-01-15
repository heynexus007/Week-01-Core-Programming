//7
import java.util.*;
class Generate6DigitOTP {
    public static void main(String[] args) {
        // Creating array of integer type to store OTPs.
        int[] oTps = new int[10];
        boolean isUnique = true;

        // Generating 10 OTPs randomly
        for (int i = 0; i < 10; i++) {
            oTps[i] = (int)(Math.random() * 900000) + 100000; // Generate 6-digit OTP
        }

        // Checking uniqueness of the OTPs
        for (int i = 0; i < oTps.length; i++) {
            for (int j = i + 1; j < oTps.length; j++) {
                if (oTps[i] == oTps[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) break;
        }

        // Printing OTPs and result
        System.out.println("Generated OTPs : " + Arrays.toString(oTps));
        System.out.println("Are all OTPs unique? " + isUnique);
        
		// Closing Scanner 
		input.close();
    }
}