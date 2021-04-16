import java.util.Scanner;

public class PowerOfTwo {
	public static int power;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String myStr;
		boolean myLoop = false;
		
		while (myLoop == false) {
			System.out.println("Please enter a positive interger");
			myStr = input.nextLine();
			
			try {
				power = Integer.parseInt(myStr);
				if (power == -1)
					break;
				else if (power < -1)
					System.out.println("Bad input.");
				else if (power > 0)
					System.out.println("2 to the power of " + power + " is " + Math.pow(2,power));
					
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		
		
		
		
		

	}

}
