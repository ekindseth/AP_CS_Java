package numGuesser;
import java.util.Scanner;
import java.util.Random;

public class numGuesser {
	
	public static String myStr;
	public static boolean myLoop;
	public static int count = 1;
	public static int bottom = 0;
	public static int top = 100;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Think of a number form 1 to 100");
		
		boolean loopy = true;
		
		while (loopy) {
			
			
			boolean myLoop = false;
			while (myLoop == false) {
				System.out.println("Is the number " + (top + bottom) / 2);
				System.out.println("Please enter \"H\" if the guess is to high, \"L\" if the guess is to low, \"Y\" if it is correct, or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				else if (myStr.equalsIgnoreCase("H"))
					top = (top + bottom) / 2;
				else if (myStr.equalsIgnoreCase("L"))
					bottom = (top + bottom) / 2;
				else if (myStr.equalsIgnoreCase("Y")) {
					System.out.println("I guessed the number in " + count + " guesses");
					System.out.println("Think of a number form 1 to 100");
					count = 0;
					top = 100;
					bottom = 0;
				}
				else {
					System.out.println("bad input");
					count--;
				}
				
			
				count++;
			
			}
		
		}

	}

}
