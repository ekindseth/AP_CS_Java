import java.util.Scanner;

public class PopulationGrowth {
	
	public static double organ;
	public static double rate;
	public static double hoursOfRate;
	public static double totalHours;
	public static String temp;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		
		boolean myLoop = true;
		while (myLoop == true) {
			System.out.println("Please enter the inital number of ogranisms");
			temp = input.nextLine();
			
			try {
				organ = Integer.parseInt(temp);
				myLoop = false;
			}
			catch (NumberFormatException e) {
				myLoop = true;
				System.out.println("Bad input.");
			}
		}
		
		myLoop = true;
		while (myLoop == true) {
			System.out.println("Please enter the rate of growth");
			temp = input.nextLine();
			
			try {
				rate = Integer.parseInt(temp);
				myLoop = false;
			}
			catch (NumberFormatException e) {
				myLoop = true;
				System.out.println("Bad input.");
			}
		}
		
		myLoop = true;
		while (myLoop == true) {
			System.out.println("Please enter tthe number of hours it takes to achieve this rate");
			temp = input.nextLine();
			
			try {
				hoursOfRate = Integer.parseInt(temp);
				myLoop = false;
			}
			catch (NumberFormatException e) {
				myLoop = true;
				System.out.println("Bad input.");
			}
		}
		
		myLoop = true;
		while (myLoop == true) {
			System.out.println("Please enter number of hours during which the population grows");
			temp = input.nextLine();
			
			try {
				totalHours = Integer.parseInt(temp);
				myLoop = false;
			}
			catch (NumberFormatException e) {
				myLoop = true;
				System.out.println("Bad input.");
			}
		}
		
		int endPop = (int)(organ * (totalHours / hoursOfRate) * rate) ;
		System.out.println("The final Population prediction is " + endPop);

	}

}
