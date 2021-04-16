import java.util.Scanner;

public class LuckySevens {
	public static void main (String [] args) {
		
		Scanner reader = new Scanner(System.in);
		Dice myDice = new Dice();
		
		int die1, die2, dollars, count, maxDollars, countAtMax;
		
		System.out.print("How many dollars do you have? ");
		dollars = reader.nextInt();
		
		maxDollars = dollars;
		countAtMax = 0; 
		count = 0;
		while (dollars > 0) {
			count++;
			
			myDice.roll();
			die1 = myDice.getNumDots();
			myDice.roll();
			die2 = myDice.getNumDots();
			
			if (die1 + die2 == 7)
				dollars += 4;
			else
				dollars -= 1;
			
			if (dollars > maxDollars ) {
				maxDollars = dollars;
				countAtMax = count;
			}
		}
		
		System.out.print("You are broke after " + count + " rolls.\n" + 
		"You should have quit after " + countAtMax + 
		" rolls when you had $" + maxDollars + ".");
			
	}
}
