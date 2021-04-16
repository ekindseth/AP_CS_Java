package arrayAvg;
import java.util.Scanner;
import java.util.ArrayList;

public class AverageRunner {

	public static String myStr;
	public static boolean myLoop;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double entered = 0;
		
		ArrayList <Double> List = new ArrayList<Double>();

		for (int i = 0; i < 15; i++) {
			myLoop = false;
			while (myLoop == false) {
				System.out.println("Please enter a number or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				try {
					entered = Double.parseDouble(myStr);
					myLoop = true;
				}
				catch (NumberFormatException e) {
					myLoop = false;
					System.out.println("Bad input.");
				}
			}
			
			List.add(entered);
						
			}
		getAvg myavg = new getAvg();
		double average = getAvg.avg(List);
		
		System.out.println("The average of the numbers is " + average);
		System.out.println("The numbers that are above average are  ");
		
		for (int j = 0; j < 15; j++) {
			if (List.get(j)> average){
				System.out.print(List.get(j)+ " ");
			}
		}
		
	}
}