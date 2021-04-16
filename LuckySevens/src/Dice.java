import java.util.Random;

public class Dice {

	public int dieNum;
	
	
	public void roll() {
		Random generator = new Random();
		dieNum = generator.nextInt (6) + 1;
	}
	
	public int getNumDots() {
		return dieNum;
	}
	
}
