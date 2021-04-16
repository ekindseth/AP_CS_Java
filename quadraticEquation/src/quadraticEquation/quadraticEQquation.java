package quadraticEquation;

public class quadraticEQquation {

	public double solutionAdd;
	public double solutionSub;
	public double A;
	public double B;
	public double C;

	public quadraticEQquation(double a, double b, double c) {
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
		solutionAdd = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
		solutionSub = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);
		return Math.max(solutionAdd, solutionSub);
	}
	
	public double getSolution2() {
		solutionAdd = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
		solutionSub = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);
		return Math.min(solutionAdd, solutionSub);
	}
}