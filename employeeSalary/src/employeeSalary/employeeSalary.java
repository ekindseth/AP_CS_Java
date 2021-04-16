package employeeSalary;

import java.util.Scanner;

public class employeeSalary {
	public static void main(String[] args) {
		System.out.println("Type the hourly wage, the number of regular hours and number of overtime hours to find the emmplyee's weekly salary ");
		Scanner input = new Scanner(System.in);
		double wage = input.nextDouble();
		double hours = input.nextDouble();
		double overHours = input.nextDouble();
		
		double pay = (wage * hours) + (wage * 1.5) * overHours;
		System.out.println("The employee's weekly pay is " + pay);
		
	}
}
