package sortArray;
import java.util.Scanner;
import java.util.ArrayList;
public class sortie {

	public static String myStr;
	public static boolean myLoop;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int entered = 0;
		
		ArrayList <Integer> negList = new ArrayList<Integer>();
		ArrayList <Integer> oddList = new ArrayList<Integer>();
		ArrayList <Integer> evenList = new ArrayList<Integer>();
		
		for (int i = 0; i < 15; i++) {
			myLoop = false;
			while (myLoop == false) {
				System.out.println("Please enter a integer or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					entered = Integer.parseInt(myStr);
					myLoop = true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
			
			if (entered < 0) {
				negList.add(entered);
			}
			
			if (entered % 2 ==0) {
				evenList.add(entered);
			}
			else 
				oddList.add(entered);
				
		}
		System.out.println("The even numbers are " + evenList);
		System.out.println("The odd numbers are " + oddList);
		System.out.println("The negative numbers are " + negList);
	
	}

}