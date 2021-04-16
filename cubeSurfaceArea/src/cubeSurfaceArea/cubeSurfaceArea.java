package cubeSurfaceArea;

import java.util.Scanner;

public class cubeSurfaceArea {
	public static void main(String[] args) {
		System.out.println("Type the length of the edge of the cube as an interger to find out the volume ");
		Scanner input = new Scanner(System.in);
		int edge = input.nextInt(); 
		double surfaceArea = edge * edge * 6;
		System.out.println("The volume is " + surfaceArea);
	}
}
