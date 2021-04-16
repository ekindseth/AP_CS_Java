import java.util.Scanner;
public class Euclidean {
	
	public static String myStr;
	public static boolean myLoop;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int entered1 = 0;
		int entered2 = 0;
		int larger, smaller, remain = 0;
		
		
		 
		boolean loopy = true;
		while (loopy) {
			int count = 0;
			myLoop = false;
			while (myLoop == false) {
				System.out.println("Please enter a integer or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					entered1 = Integer.parseInt(myStr);
					myLoop =true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
			myLoop = false;
			while (myLoop == false) {
				System.out.println("Please enter a second integer or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					entered2 = Integer.parseInt(myStr);
					myLoop =true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
		larger = Math.max(Math.abs(entered1), Math.abs(entered2));
		smaller = Math.min(Math.abs(entered1), Math.abs(entered2));
		while(smaller > 0){
			remain = larger % smaller;
			larger = smaller;
			smaller = remain;
			count ++;
			System.out.println("guess " + count + ":" + larger);
		}
		System.out.println("The GCD is " + larger);
		
			
		}
	}

}
