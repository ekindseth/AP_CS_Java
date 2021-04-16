
public class Sin {

	public static double X1, X2, X3, X4,X5;
	public static double A;
	public static double B;
	public static double D;
	public static double period;

	public static void GiveValues(double a, double b, double x1, double d) {
	A = a;
	B = b;
	X1 = x1;
	D = d;

	}
	
	public static void Period() {
		period = (2 * Math.PI) / B;;
	}
	
	public static double getX2() {
		X5 = X1 + (period / 4);
		return X5;
	}
	public static double getX3() {
		X5 = X1 + (period / 2);
		return X5;
	}
	public static double getX4() {
		X5 = X1 + (3 * period / 4);
		return X5;
	}
	public static double getX5() {
		X5 = X1 + period;
		return X5;
	} 
}