package dataset;
import java.util.Scanner;

public class Datasettester {
	
	public static void main(String[] args) {
		
		Dataset storage = new Dataset(Dataset.numOne, Dataset.numTwo, Dataset.numThree, Dataset.numFour);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type an integer then press enter:");
		storage.numOne = input.nextInt();
		Dataset.addValue(storage.numOne);
		
		System.out.println("The data set has the integers: " + storage.numOne);
		System.out.println("The largest value in the data set is: " + Dataset.getLargest());
		System.out.println("The smallest value in the data set is: " + Dataset.getSmallest());
		
		System.out.println ("Type another integer then press enter:");
		storage.numTwo = input.nextInt();
		Dataset.addValue(storage.numTwo);
		
		System.out.println("The data set has the integers: " + storage.numOne + " , " + storage.numTwo);
		System.out.println("The largest value in the data set is: " + Dataset.getLargest());
		System.out.println("The smallest value in the data set is: " + Dataset.getSmallest());
		
		System.out.println ("Type another integer then press enter:");
		storage.numThree = input.nextInt();
		Dataset.addValue(storage.numThree);
		
		System.out.println("The data set has the integers: " + storage.numOne + " , " + storage.numTwo + " , " + storage.numThree);
		System.out.println("The largest value in the data set is: " + Dataset.getLargest());
		System.out.println("The smallest value So Far: " + Dataset.getSmallest());
		
		System.out.println ("Type another integer then press enter:");
		storage.numFour = input.nextInt();
		Dataset.addValue(storage.numFour);
		
		System.out.println("The final data set has the integers: " + storage.numOne + " , " + storage.numTwo + " , " + storage.numThree + " , " + storage.numFour);
		System.out.println("The final largest value in the data set is: " + Dataset.getLargest());
		System.out.println("The final smallest value in the data set is: " + Dataset.getSmallest());
		
	}
		
}
