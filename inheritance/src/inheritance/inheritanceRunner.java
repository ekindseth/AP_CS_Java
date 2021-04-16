package inheritance;

public class inheritanceRunner {

	public static void main(String[] args) {
		Rockstar rockstar = new Rockstar();
		Mobius mobius = new Mobius();
		Zen zen = new Zen();
		Delta delta = new Delta();
		Braaap braaap = new Braaap();
		Machno mancho = new Machno();
		Marvel marvel = new Marvel();
		Journey journey = new Journey();
		
		System.out.print("from kayak: ");
		kayaks.Speed("freestyle");
		System.out.print("from freestyel: ");
		freestyle.freestylePurpose();
		System.out.print("from Rockstar: ");
		Rockstar.rockstarBrand();
		System.out.print("from Mobuis: ");
		Mobius.mobiusBrand();
		System.out.println("");
		
		System.out.print("from kayak: ");
		kayaks.Speed("riverrunner");
		System.out.print("from Riverrunner: ");
		riverRunner.riverRunnerPurpose();
		System.out.print("from Braaap: ");
		Braaap.braaapBrand();
		System.out.print("from Machno: ");
		Machno.machnoBrand();
		System.out.println("");
		
		System.out.print("from kayak: ");
		kayaks.Speed("creeker");
		System.out.print("from Creeker: ");
		creeker.creekerPurpose();
		System.out.print("from zen: ");
		Zen.zenBrand();
		System.out.print("from Delta: ");
		Delta.deltaBrand();
		System.out.println("");
		
		System.out.print("from kayak: ");
		kayaks.Speed("recreational");
		System.out.print("from recerational: ");
		recreational.recreationalPurpose();
		System.out.print("from marvel: ");
		Marvel.marvelBrand();
		System.out.print("from from Journey: ");
		Journey.journeyBrand();
		System.out.println("");
		
	
		
		
	}

}
