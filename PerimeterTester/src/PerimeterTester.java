import java.awt.Rectangle;
public class PerimeterTester {
	
	public static void main(String[] args) {
		Rectangle(14,20,10,16);
	}
	
	public static void Rectangle(int x, int y, int height, int width) {
		Rectangle Mr_Boxy = new Rectangle(x, y, height, width);
		double perimeter = 2 * Mr_Boxy.getHeight() + 2 * Mr_Boxy.getWidth();
		System.out.println("The Perimeter is  " + perimeter );
		double area = Mr_Boxy.getHeight() * Mr_Boxy.getWidth();
		System.out.println("The area is  " + area);
	}
}