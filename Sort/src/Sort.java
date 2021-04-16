import java.util.Scanner;

public class Sort {
	
	public static double input1;
	public static double input2;
	public static double input3;
	public static String myStr;
	public static boolean myLoop;
	public static boolean exit; 
	public static void main(String[] args) {
	
		boolean loopy = true;
		
		Scanner input = new Scanner(System.in);
		
		while(loopy) {
	
			myLoop = false;
			while (myLoop == false) {
				System.out.println("PLease enter a number or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					input1 = Double.parseDouble(myStr);
					myLoop =true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
	
			myLoop = false;
			while (myLoop == false) {
				System.out.println("PLease enter a number or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					input2 = Double.parseDouble(myStr);
					myLoop =true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
	
			myLoop = false;
			while (myLoop == false) {
				System.out.println("PLease enter a number or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					input3 = Double.parseDouble(myStr);
					myLoop =true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
	
			if (input1 <= input2 && input1 <= input3) {
				if (input2 <= input3)
					System.out.println(input1 + "," + input2 + "," + input3);
				else 
					System.out.println(input1 + "," + input3 + "," + input2);
			}
			else if (input2 <= input1 && input2 <= input3) {
				if (input1 <= input3)
					System.out.println(input2 + "," + input1 + "," + input3);
				else 
					System.out.println(input2 + "," + input3 + "," + input1);
			}
			else 
				if (input1 <= input2)
					System.out.println(input3 + "," + input1 + "," + input2);
				else 
					System.out.println(input3 + "," + input2 + "," + input1);

			String response = "";
			exit = true;
			while (exit == true) {
				System.out.println("Would you like to continue? enter \"Y\" to continue or \"Q\" to quit");
				response = input.nextLine();
				if (response.equalsIgnoreCase("Q"))
					System.exit(0);
				else if (response.equalsIgnoreCase("Y")) 
					exit = false;
				else 
					System.out.println("Bad input.");
			}
		}
	}
	
}
