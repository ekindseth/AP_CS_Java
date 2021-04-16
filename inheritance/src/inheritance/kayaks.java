package inheritance;

public class kayaks {
	public void kayak() {
		boolean floats = true;
	}
	
	public static void Speed(String type){
		if (type.equalsIgnoreCase("freestyle"))
			System.out.println(type + " boats are slow");
		else if (type.equalsIgnoreCase("riverrunner"))
			System.out.println(type + " boats are medium in speed");
		else if (type.equalsIgnoreCase("creeker"))
			System.out.println(type + " boats are fast");
		else if (type.equalsIgnoreCase("recreational"))
			System.out.println(type + " boats are very fast");
		
	}
	
	
}
