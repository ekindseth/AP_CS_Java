package numGuesser;
import java.util.Scanner;
import java.util.Random;

public class numGuesser {
	
	public static String myStr;
	public static boolean myLoop;
	public static int count;
	public static int answer;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int guess = 0;
		Random generator = new Random();
		answer = generator.nextInt (99) + 1;
		
		boolean loopy = true;
		
		while (loopy) {
		//tttttttttttttttthhhhhhhhhhhhhhiiiiiiiiiiiiiiisssssssssssssss ooooooooooonnnnnnnnnnneeeeeeee
			
			
			boolean myLoop = false;
			while (myLoop == false) {
				System.out.println("Please guess a interger form 1 to 100 or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					guess = Integer.parseInt(myStr);
					myLoop =true;
					if (guess < 0 ) {
					myLoop = false;
					System.out.println("Input must be positive.");
				}
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			count++;
			
			
			}
			if (guess == answer) {
				System.out.println("You Won!");
				System.out.println("You guessed the number in " + count + " guesses.");
				answer = generator.nextInt (99) + 1;
				count = 0;
			}
			else if (guess >= answer)
				System.out.println("Your guess is too high.");
			else if (guess <= answer)
				System.out.println("Your guess is to low.");
			
		}

	}

}
