import java.util.Scanner;
public class GPA {

	public static String str;
	public static boolean exit;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean myloop = true;
		
		while (myloop) {
			
			boolean loopy = true;
			while (loopy) {
				System.out.println("Please enter a letter grade or \"Q\" to quit");
				str = input.nextLine();
			
				if (str.equalsIgnoreCase("A+") || str.equalsIgnoreCase("A") || str.equalsIgnoreCase("A-") || str.equalsIgnoreCase("B+") || str.equalsIgnoreCase("B") || str.equalsIgnoreCase("B-") || str.equalsIgnoreCase("C+") || str.equalsIgnoreCase("C") || str.equalsIgnoreCase("C-") || str.equalsIgnoreCase("D+") || str.equalsIgnoreCase("D") || str.equalsIgnoreCase("D-") || str.equalsIgnoreCase("F")) 
					loopy = false;
				else if (str.equalsIgnoreCase("Q"))
					System.exit(0);
				else 
					System.out.println("Sorry bad input");
			}
		
			if (str.equalsIgnoreCase("A+"))
				System.out.println("4.0");
			else if (str.equalsIgnoreCase("A"))
				System.out.println("4.0");
			else if (str.equalsIgnoreCase("A-"))
				System.out.println("3.7");
			else if (str.equalsIgnoreCase("B+"))
				System.out.println("3.3");
			else if (str.equalsIgnoreCase("B"))
				System.out.println("3.0");
			else if (str.equalsIgnoreCase("B-"))
				System.out.println("2.7");
			else if (str.equalsIgnoreCase("C+"))
				System.out.println("2.3");
			else if (str.equalsIgnoreCase("C"))
				System.out.println("2.0");
			else if (str.equalsIgnoreCase("C-"))
				System.out.println("1.7");
			else if (str.equalsIgnoreCase("D+"))
				System.out.println("1.3");
			else if (str.equalsIgnoreCase("D"))
				System.out.println("1.0");
			else if (str.equalsIgnoreCase("D-"))
				System.out.println("0.7");
			else if (str.equalsIgnoreCase("F"))
				System.out.println("0.0");
			
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
