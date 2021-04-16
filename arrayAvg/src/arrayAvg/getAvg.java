package arrayAvg;
import java.util.ArrayList;
public class getAvg {
	
	public static double avg(ArrayList<Double> list) {
		double total = 0;
		for (int i =0; i < 15; i++) {
			total += list.get(i);
			
		}
		
	return total / 15;
	}

}
