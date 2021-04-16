import java.util.Scanner;

public class StringHandling {

	public static void main(String[] args) {
		System.out.println("Enter below a sentence under 20 characters (Include 4 spaces)");
		Scanner input = new Scanner(System.in);
		String original = input.nextLine();
		
		System.out.println("The entered line is:" + original);
		System.out.println("The length of the line is:" + original.length());
		System.out.println("The location of the first space is:" + original.indexOf( " "));
		
		String afterFirstSpace = original.substring(original.indexOf(" ") + 1, original.length());
		String afterSecondSpace = afterFirstSpace.substring(afterFirstSpace.indexOf(" ") + 1, afterFirstSpace.length());
		String afterThirdSpace = afterSecondSpace.substring(afterSecondSpace.indexOf(" ") + 1, afterSecondSpace.length());
		
		System.out.println("The word after the thrid space is:" + afterThirdSpace.substring(0, afterThirdSpace.indexOf(" ")));
		System.out.println("The string from charater 12 is:" + original.substring(12, original.length()));
		System.out.println("The first 8 charatcers are:" + original.substring(0, 8));
		System.out.println("The word after the thrid space canactinated with the string from charater 12 is:" + afterThirdSpace + "/" + original.substring(12, original.length()));
		System.out.println("The charaters at index 5,9, and 12 are:" + original.charAt(5) + original.charAt(9) + original.charAt(12));
		System.out.println("The index of the first \"th\" and \"os\" are:" + original.indexOf("th") + " and " + original.indexOf("os"));
	}
}
