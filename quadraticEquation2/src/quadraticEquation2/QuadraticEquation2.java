package quadraticEquation2;

public class QuadraticEquation2 {

		public double solution1;
		public double solution2;
		public double A;
		public double B;
		public double C;
		
		
		public QuadraticEquation2(double a, double b, double c) {
		A = a;
		B = b;
		C = c;
		}
		public boolean hasSolutions() {
			
			if (B * B - 4 * A * C >= 0)
				return true;
			else
				return false;
			
		}

		public double getSolution1() {
			
			solution1 = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
			return solution1;
			
		}
		public double getSolution2() {
			
			solution2 = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);
			return solution2;
		}
		
		
	}
