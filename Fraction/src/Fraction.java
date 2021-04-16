
public class Fraction {

	public int N1, N2, D1, D2;
	public int denomin, denomindiv;
	public int tempN, tempD;
	
	public Fraction(int n1, int d1,int n2, int d2) {
	N1 = n1;
	N2 = n2;
	D1 = d1;
	D2 = d2;
	denomin = D1 * D2;
	denomindiv = D1 * N2;
	}
	
	public void add() {
		tempN = (N1 * D2) + (N2 * D1);	
		tempD = D1 * D2;
	}
	
	public void subtract() {
		tempN = (N1 * D2) - (N2 * D1);	
		tempD = D1 * D2;
	}
	public void multiply() {
		tempN = N1 * N2;	
		tempD = D1 * D2;
	}

	public void divide() {
		tempN = N1 * D2;
		tempD = D1 * N2;
	}
	
	public int getDenominator() {
		return tempD;
	}
	
	public int getNumerator() {
		return tempN;
	}
	
	public void reduce() {
		for (int i = 1; i <= Math.abs(tempN) + 1 && i <= Math.abs(tempD) + 1 ; i++) {
			if (tempN < 0 && tempD < 0) {
				tempN = tempN * -1;
				tempD = tempD * -1;
			}
			if (Math.abs(tempN) % i == 0 && Math.abs(tempD) % i == 0) {
				tempN = tempN / i;
				tempD = tempD / i;
				i = 1;
			}
		}
	}
	
	public String toString() {
		if (tempN == tempD)
			return "1";
		else if (tempN == 0)
			return "0";
		else
			return (getNumerator() + "/" + getDenominator());
	}
}
