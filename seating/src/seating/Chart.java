cpackage seating;
import java.util.Scanner;

public class Chart {
	public static String myStr;
	public static boolean myLoop;
	public static boolean priceMode;
	public static int entered;
	public static int entered2;
	public static int temp;
	public static boolean exit = false;
	public static int[][] chartOSeating = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10 } , {10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, 
			{10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, {10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, {20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }};
	
	public static void seatLocal(int price) {
		exit = false;
		for (int i = 0; i < chartOSeating.length; i++ ) {
			for (int j = 0; j < chartOSeating.length + 1; j++) {
				temp = j;
				if (chartOSeating[i][j] == entered) {
					chartOSeating[i][j] = 0;	
					System.out.println("Your set is in row " + (i + 1) + " seat number " + (j + 1));
					exit = true;
					break;
				}
				if (i == chartOSeating.length -1 && temp == chartOSeating.length) {
					System.out.println("There are no seats available for that price");
				}
			}
			if (exit)
				break;
		}
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Boolean open = true;
		
		while (open == true) {
			
			myLoop = false;
			while (myLoop == false) {
				System.out.println("Would you like to  get a seat by price or by seat? Enter \"P\" for price or \"S\" for seat or \"Q\" to quit");
				myStr = input.nextLine();
				if (myStr.equalsIgnoreCase("Q"))
					System.exit(0);
				else if (myStr.equalsIgnoreCase("P")) {
					priceMode = true;
					myLoop = true;
				}
				else if (myStr.equalsIgnoreCase("S")) {
					priceMode = false;
					myLoop = true;
				}
				else 
					System.out.println("Bad input.");
			}
		
			if (priceMode == true) {
				myLoop = false;
				while (myLoop == false) {
					System.out.println("Please enter a price, the options are 10, 20, 30, 40, or 50 or \"Q\" to quit");
					myStr = input.nextLine();
					if (myStr.equalsIgnoreCase("Q"))
						System.exit(0);
					if (myStr.equals("10") || myStr.equals("20")|| myStr.equals("30")|| myStr.equals("40")|| myStr.equals("50")) {
						entered = Integer.parseInt(myStr);
						myLoop = true;
					}
					else 
						System.out.println("Bad input.");
				}
				seatLocal(entered);
			}
		
			if (priceMode == false) {
				boolean loopy = true;
				while (loopy) {
					myLoop = false;
					while (myLoop == false) {
						System.out.println("Please enter the row you would like to be in or \"Q\" to quit");
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
						if (entered >= 10 || entered <= 0 ){
							myLoop = false;
							System.out.println("Bad input.");
							entered = 0;
						}
				
					}
			
					myLoop = false;
					while (myLoop == false) {
						System.out.println("Please enter the seat number you would like to have or \"Q\" to quit");
						myStr = input.nextLine();
						if (myStr.equalsIgnoreCase("Q"))
						System.exit(0);
						try {
							entered2 = Integer.parseInt(myStr);
							myLoop = true;
						}
						catch (NumberFormatException e) {
							myLoop = false;
							System.out.println("Bad input.");
						}
						if (entered2 > 10 || entered2 < 0 ){
							myLoop = false;
							System.out.println("Bad input.");
							entered2 = 0;
						}
					}
					if (chartOSeating[entered - 1][entered2 - 1] > 0) {
						System.out.println("Your set is in row " + entered + " seat number " + entered2 + " the price is " + chartOSeating[entered - 1][entered2 - 1]);
						chartOSeating[entered - 1][entered2 -1] = 0;
						loopy = false;
					}
					else 
						System.out.println("That seat is taken");
				}
			}
			for (int i = 0; i < chartOSeating.length; i++ ) {
				for (int j = 0; j < chartOSeating.length + 1; j++) {
					temp = j;
					if (chartOSeating[i][j] > 0) {
						open = true;
						break;
					}
					else 
						open = false;
				}
				if (chartOSeating[i][temp] > 0)
					break;
			}
		}
		System.out.println("all seats are taken");
	}
}