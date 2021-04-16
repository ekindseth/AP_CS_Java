import java.util.Scanner;

public class StudentTester {
	
	public static String name = "";
	public static double quizes  = 0;
	public static double score = 0;
	public static boolean loopy = true;
	public static String response = "";

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		Student myStudent = new Student();
		
		while (loopy = true) {
			
			myStudent.ResetTotal();
			quizes = 0;
			score = 0;
			name = "";
			
			System.out.println("Please enter the student's name or \"-1\" to quit.");
			name = input.nextLine();
			if (name.equals("-1"))
					break;
		
			System.out.println("Please enter the number of quiz scores you wish to enter or \"-1\" to quit.");
			quizes = input.nextInt();
			if (quizes == -1)
				break;
		
			for (int i = 0; i < quizes; i++) {
				System.out.println("Please enter the quiz score or \"-1\" to quit.");
				score = input.nextDouble();
				if (score == -1)
					break;
				myStudent.addQuizScores(score);
			
			}
			if (score == -1)
				break;
			System.out.println("The students name is " + name );
			System.out.println("The number of quizes is " + quizes );
			System.out.println(name + "'s total quiz score is " + myStudent.getQuizTotal());
			System.out.println(name + "'s average quiz score is " + myStudent.getAverageScore(quizes));
			System.out.println();
		
		 
		
		}
		
	}

}
