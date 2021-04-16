package lettersort;
import java.util.Scanner;

public class sortLetters {
	
	public static int one, two, three;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean loopy = true;
		
		while (loopy) {
			System.out.println("Please enter a word or \"-1\" to quit");
			String input1 = input.nextLine();
			if (input1.equalsIgnoreCase("-1"))
				System.exit(0);
		
			System.out.println("Please enter a word or \"-1\" to quit");
			String input2 = input.nextLine();
			if (input2.equalsIgnoreCase("-1"))
				System.exit(0);
			
			System.out.println("Please enter a word or \"-1\" to quit");
			String input3 = input.nextLine();
			if (input3.equalsIgnoreCase("-1"))
				System.exit(0);
		
			one = input1.compareToIgnoreCase(input2);
			//System.out.println(one);
			two = input1.compareToIgnoreCase(input3);
			//System.out.println(two);
			three = input2.compareToIgnoreCase(input3);
			//System.out.println(three);
		
			if (one <= 0 && two <= 0) {
				if (three <= 0)
					System.out.println(input1 + "," + input2 + "," + input3);
				else 
					System.out.println(input1 + "," + input3 + "," + input2);
			}
			else if (one >= 0 && three <= 0) {
				if (two <= 0)
					System.out.println(input2 + "," + input1 + "," + input3);
				else 
					System.out.println(input2 + "," + input3 + "," + input1);
			}
			else {
				if (one <= 0)
					System.out.println(input3 + "," + input1 + "," + input2);
				else 
					System.out.println(input3 + "," + input2 + "," + input1);
		
			}
		
		}
	}
}
