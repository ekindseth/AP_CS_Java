import java.util.Scanner;
public class SquareRoots {
	
	public static String myStr;
	public static boolean myLoop;
	public static double root = 0;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		
		boolean loopy = true;
		
		while (loopy) {
			boolean myLoop = false;
			while (myLoop == false) {
				System.out.println("Please enter a interger or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					a = Integer.parseInt(myStr);
					myLoop =true;
					if (a < 0 ) {
					myLoop = false;
					System.out.println("Input must be positive.");
				}
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
				
			}
	
		RootApproximator r = new RootApproximator(a);
	
		while (r.hasMoreGuesses()) 
			root = r.nextGuess();
		System.out.println("Square root: " + root);


	}
	}

}