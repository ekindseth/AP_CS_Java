
public class RoachSimulation {
	
	public static void main(String[] args) {
		
		RoachPopulation.givePop(10);
		System.out.println("10 is the number of roaches before simulation.");
		
		for (int i=0; i < 4; i++) {
			RoachPopulation.breed();
			RoachPopulation.spray();
			System.out.println(RoachPopulation.getRoaches()+ " is the population of the Roaches after simutlation.");
		}
			
		

	}

}
