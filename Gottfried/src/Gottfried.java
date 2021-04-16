import java.util.Scanner;

public class Gottfried {

	public static void main(String[] args) {
		
		int iterations = 0;
		double value = 0;
		double denomin = 1;
		String myStr;
		boolean myLoop = false;
		boolean positive = true;
		
		Scanner input = new Scanner(System.in);
		
		while (myLoop == false) {
			System.out.println("How many iterations would you like?");
			myStr = input.nextLine();
			
			try {
				iterations = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
			}
		}

		for (int i= 1; i <= iterations ; i++) {
			if (positive == true) {
				value = value + (1 / denomin);
				positive = false;
			}
			else {
				value = value - (1 / denomin);
				positive = true;
			}
			denomin = (denomin + 2); 
		}	
		value = value * 4;
		System.out.println("The value of Pi is " + value);
	}

}
