import java.util.Scanner;
public class Floating {
	
	public static double input1;
	public static double input2;
	public static String myStr;
	public static boolean myLoop;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean loopy = true;
		
		while (loopy) {
			
			myLoop = false;
			while (myLoop == false) {
				System.out.println("PLease enter a number or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					input1 = Double.parseDouble(myStr);
					myLoop = true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
		
			myLoop = false;
			while (myLoop == false) {
				System.out.println("PLease enter a number or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					input2 = Double.parseDouble(myStr);
					myLoop =true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
			
			double rounded1 = Math.round(input1 * 100);
			rounded1 = rounded1 / 100;
			//System.out.println("rounded1 = " + rounded1);
			double rounded2 = Math.round(input2 * 100);
			rounded2 = rounded2 / 100;
			//System.out.println("rounded2 = " + rounded2);
			
			if (rounded1 == rounded2 )
				System.out.println("They are the same when rounded to two decimal places");
			else 
				System.out.println("They are different when rounded to two decimal places");
			
			
			if (Math.abs(input1 - input2) < 0.01) 
				System.out.println("They differ by less than 0.01");
			else
				System.out.println("They do not differ by less than 0.01");
		}
	}
}
