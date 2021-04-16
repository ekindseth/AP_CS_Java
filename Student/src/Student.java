
public class Student {

	public static double total = 0;
	
	public static void ResetTotal() {
		total = 0;
	}
	
	public static void addQuizScores(double score) {
		total += score;
	}
	
	public static double getQuizTotal() {
		return total;
	}
	
	public static double getAverageScore(double quizes) {
		return total / quizes;
	}
}
