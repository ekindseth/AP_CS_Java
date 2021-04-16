import java.util.Scanner;
public class CurrencyConversion {

	public static double rate;
	public static double dollars;
	public static String myStr;
	public static boolean myLoop;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean loopy = true;
		
		myLoop = false;
			while (myLoop == false) {
				System.out.println("PLease enter the convertion rate from the US Dollar to Euros or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					rate = Double.parseDouble(myStr);
					myLoop = true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
		
		while (loopy) {
			
			
		
			myLoop = false;
			while (myLoop == false) {
				System.out.println("Please enter the number of dollars or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					dollars = Double.parseDouble(myStr);
					myLoop =true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
			
			double euros = dollars * rate;
			System.out.println(dollars + " Dollars is " + euros + " Euros");
			
			
		}
	}
}

