package employeeSalary;

import java.util.Scanner;

public class salaryDay {
	public static void main(String[] args) {
		System.out.println("Type the employee's hourly wage. ");
		Scanner input = new Scanner(System.in);
		double wage = input.nextDouble();
		System.out.println("Type the number of regular hours and number of overtime hours worked on Monday. ");
		double hoursMon = input.nextDouble();
		double overHoursMon = input.nextDouble();
		System.out.println("Type the number of regular hours and number of overtime hours worked on Tuesday. ");
		double hoursTues = input.nextDouble();
		double overHoursTues = input.nextDouble();
		System.out.println("Type the number of regular hours and number of overtime hours worked on Wednesday. ");
		double hoursWed = input.nextDouble();
		double overHoursWed = input.nextDouble();
		System.out.println("Type the number of regular hours and number of overtime hours worked on Thursday. ");
		double hoursThurs = input.nextDouble();
		double overHoursThurs = input.nextDouble();
		System.out.println("Type the number of regular hours and number of overtime hours worked on Friday. ");
		double hoursFri = input.nextDouble();
		double overHoursFri = input.nextDouble();


		double hours =  hoursMon + hoursTues + hoursWed + hoursThurs + hoursFri ;
		double overHours =  overHoursMon + overHoursTues + overHoursWed + overHoursThurs + overHoursFri ;
		double pay = (wage * hours) + (wage * 1.5) * overHours;
		System.out.println("The employee's weekly pay is " + pay);
	}
}
