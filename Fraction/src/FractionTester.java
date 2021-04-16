import java.util.Scanner;

public class FractionTester {
	
		public static int n1;
		public static int n2;
		public static int d1;
		public static int d2;
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String myStr;
		
		boolean myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter your first numertor: ");
			myStr = input.nextLine();
			
			try {
				n1 = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		
		myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter your first denominator: ");
			myStr = input.nextLine();
			
			try {
				d1 = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter your second numerator: ");
			myStr = input.nextLine();
			
			try {
				n2 = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		
		myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter your second denominator: ");
			myStr = input.nextLine();
			
			try {
				d2 = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
	
		Fraction myFraction = new Fraction(n1, d1, n2, d2);
		
		myFraction.add();
		myFraction.reduce();
		System.out.println("The sum of the fractions is " +  myFraction.toString());
		myFraction.subtract();
		myFraction.reduce();
		System.out.println("The diffrence of the fractions is " + myFraction.toString());
		myFraction.multiply();
		myFraction.reduce();
		System.out.println("The product of the fractions is " + myFraction.toString());
		myFraction.divide();
		myFraction.reduce();
		System.out.println("The quotient of the fractions is " + myFraction.toString());
	
	}

}
