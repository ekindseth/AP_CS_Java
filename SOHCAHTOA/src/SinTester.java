import java.util.Scanner;

public class SinTester {
	
		public static double a ;
		public static double b;
		public static double d;
		public static double X1, X2, X3, X4, X5;
		public static int trig;
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String myStr;
		
		System.out.println("Format ATrig(B(x-x1)) + D ");
		boolean myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter an \"a\" value: ");
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
			System.out.println("PLease enter a \"X1\" value: ");
			myStr = input.nextLine();
			
			try {
				X1 = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		myLoop = false;
		while (myLoop == false) {
			System.out.println("PLease enter a \"d\" value: ");
			myStr = input.nextLine();
			
			try {
				d = Integer.parseInt(myStr);
				myLoop =true;
			}
			catch (NumberFormatException e) {
				myLoop = false;
				System.out.println("Bad input.");
			}
		}
		System.out.println("PLease enter a \"sin\" to use a sin graph or \"cos\" to use a cos graph: ");
		myStr = input.nextLine();
		if (myStr.equals("sin")) {
			trig = 1;
		}
		else 
			trig = 2;
		
		Sin.GiveValues(a, b, X1, d);
		Sin.Period();
		if (trig == 1) {
			System.out.println("Point at x1 is (" + X1 + "," + d + ")");
			System.out.println("Point at x2 is (" + Sin.getX2() + "," + (d + a) + ")");
			System.out.println("Point at x3 is (" + Sin.getX3() + "," + d + ")");
			System.out.println("Point at x4 is (" + Sin.getX4() + "," + (d - a) + ")");
			System.out.println("Point at x5 is (" + Sin.getX5() + "," + d + ")");
		}
		else {
			System.out.println("Point at x1 is (" + X1 + "," + (d + a) + ")");
			System.out.println("Point at x2 is (" + Sin.getX2() + "," + d + ")");
			System.out.println("Point at x3 is (" + Sin.getX3() + "," + (d - a) + ")");
			System.out.println("Point at x4 is (" + Sin.getX4() + "," + d + ")");
			System.out.println("Point at x5 is (" + Sin.getX5() + "," + (d + a) + ")");
		}
	
	}
}