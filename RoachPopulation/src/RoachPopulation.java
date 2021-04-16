
public class RoachPopulation {
	
	public static int pop;
	
	public static void givePop(int num) {
		pop = num;
	}
	
	public static void breed() {
		pop = pop * 2;
	}
	
	public static void spray() {
		pop = (pop * 9) / 10;
	}
	
	public static int getRoaches() {
		return pop;
	}
	
}
