package quadraticEquation2;

import java.util.Scanner;

public class quadraticEquationTester2 {

	public static void main(String[] args) {
		

		 double a;
		 double b;
		 double c;
		 double solution1;
		 double solution2;

		System.out.println("PLease enter a \"a\" value: ");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		System.out.println("PLease enter a \"b\" value: ");
		b = input.nextDouble();
		System.out.println("PLease enter a \"c\" value: ");
		c = input.nextDouble();
		
		QuadraticEquation2 myquadraticEQquation = new QuadraticEquation2(a, b, c);
		

		
		if (myquadraticEQquation.hasSolutions())
			System.out.println("Sorry, no real solutions");
		else {
			System.out.println("The two real soultions are ");
			solution1 = myquadraticEQquation.getSolution1(); 
			solution2 = myquadraticEQquation.getSolution2(); 
			System.out.println(solution1 + solution2); 
			}
	
	}
}

