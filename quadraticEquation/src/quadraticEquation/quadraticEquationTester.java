package quadraticEquation;

import java.util.Scanner;

public class quadraticEquationTester {
	
		public static double a ;
		public static double b;
		public static double c;
		public static double solution1;
		public static double solution2;
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String myStr;
		
		boolean myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter a \"a\" value: ");
			myStr = input.nextLine();
			
			try {
				a = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		
		myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter a \"b\" value: ");
			myStr = input.nextLine();
			
			try {
				b = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter a \"c\" value: ");
			myStr = input.nextLine();
			
			try {
				c = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
	
		quadraticEQquation myquadraticEQquation = new quadraticEQquation(a, b, c);
		
		if (myquadraticEQquation.hasSolutions() == false)
			System.out.println("Sorry, no real solutions");
		else {
			solution1 = myquadraticEQquation.getSolution1(); 
			solution2 = myquadraticEQquation.getSolution2();
			if (solution1 == solution2) {
				System.out.println("The one real soultion is "); 
				System.out.println(solution1); 
				}
			else {
				System.out.println("The two real soultions are "); 
				System.out.println(solution1 + " and "+ solution2); 
			}
		}
		
	
	}
}