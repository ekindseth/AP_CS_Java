import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class BulgarianSolitaire {
	public static ArrayList <Integer> List = new ArrayList<Integer>();
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		
		Random generator = new Random();
		
		int x = 45;
		while (x > 0) {
		
			int j = (generator.nextInt (x) + 1);
			List.add(j);
			x -= j;
		}
		System.out.println("All the printed numbers are the number in each stack at each stage from smallest pile to largest");
		Collections.sort(List);
		System.out.println(List);
		check();
		
		
		boolean myLoop = true;
		while(myLoop) {
			int bigness =  List.size();
			for (int i = 0; i < List.size(); i ++ ) {
				List.set(i, (List.get(i)-1));
			}
			boolean loopy = true;
			while (loopy) {
				loopy = false;
				for (int i = 0; i < List.size(); i ++ ) {
					if (List.get(i) == 0) {
						List.remove(i);
						loopy = true;
					}
				}
			}
				
			
			List.add(bigness);
			
			//System.out.println(List);
			Collections.sort(List);
			System.out.println(List);
			check();
			counter++;

		}

	}
	
	public static void check() {
		if (List.size() == 9) {
			if(List.get(0) == 1 && List.get(1) == 2 &&List.get(2) == 3 &&List.get(3) == 4 &&List.get(4) == 5 &&List.get(5) == 6 &&List.get(6) == 7 &&List.get(7) == 8 &&List.get(8) == 9) {
				System.out.println("It took " + counter + " tries");
				System.exit(0);
			}
		}
	}

}
