
public class RootApproximator{
	
	double entered = 4;
	double guess = 2;
	double lastGuess = 1;
	double epsilon = 1 * Math.pow(10, -12);
	
	public RootApproximator(int a) {
	entered = a;
	}
	public boolean hasMoreGuesses() {
		if (Math.abs(guess - lastGuess) / Math.max(Math.abs(guess), Math.abs(guess)) >= epsilon)
			return true;
		else 
			return false;
	}
	
	public double nextGuess() {
		lastGuess = guess;
		guess = ((guess + ( entered / guess)) / 2);
		return guess;
	}
}
