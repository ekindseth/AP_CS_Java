package objectsMass;

import java.util.Scanner;

public class objectsMass {
	public static void main(String[] args) {
		System.out.println("Type the mass (in kilograms) and velocity (in meters per second) to find the kinetic energy ");
		Scanner input = new Scanner(System.in);
		double mass = input.nextDouble();
		double velocity = input.nextDouble();
		
		System.out.println("The kientic enegry of the object is " + ( mass * (velocity * velocity) / 2));
		
	}

}
