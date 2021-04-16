import java.util.Scanner;

public class YesNoChecker {
	
	public static boolean loopy = true;
	
	public static void main(String[]args) {
		
		String str = "";
		Scanner input = new Scanner(System.in);
		
		loopy = true;
			
		while (loopy == true){
			
			System.out.println("Do you want to continue?");
		
			str = input.nextLine();
			
			if (str.equalsIgnoreCase("n") || str.equalsIgnoreCase("no")) { 
				System.out.println("Terminating");
				loopy = false;
			}
			else if (str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("ok")|| str.equalsIgnoreCase("sure")|| str.equalsIgnoreCase("why not")) {
				System.out.println("OK");
			}
			else 
				System.out.println("Bad Input");
		}
	}
}
