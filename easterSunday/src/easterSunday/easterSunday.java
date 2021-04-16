package easterSunday;
import java.util.Scanner;
public class easterSunday {
	public static void main(String[] args) {
		System.out.println("Enter the year that you would like to know the date of Easter Sunday");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		
		
		
		int y = year ;
		int a = y % 19 ;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = ((8 * b) + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + (11 * h)) /  319; 
		int r = (2 * e +2 * j - k - h + m +32) % 7;
		int n = (h - m + r + 90) / 25 ;
		int p = (h - m + r + n + 19) % 32 ;
		
		System.out.println("The year you requested is " + year);
		GetEasterSundayDay(n, year);
		GetEasterSundayMonth(p, year);
		
	}
	public static void GetEasterSundayMonth(int p, int year) {
		
		System.out.println("The day of Easter in " + year + " is " + p);
	}
	public static void  GetEasterSundayDay(int n, int year) {
	
		System.out.println("The month of Easter in " + year + " is " + n);
	}
	
	
}
