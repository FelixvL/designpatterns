package designpatterns.examples.factory;

public class Demo {
	public static void main(String[] args) {
		System.out.println("factory");
		
		Bar deBar = new Bar();
		
		deBar.getDrankje(Dranknaam.Wijn).drinken();
		
		Drankje drankje =deBar.getDrankje(Dranknaam.Cola);
		drankje.drinken();
		System.out.println(drankje.prijsAfrekenen());
		
		Biertje bier = (Biertje) deBar.getDrankje(Dranknaam.Biertje);
		bier.drinken();
	}
}


// productie van objecten

// controle over creatie objecten

// afhankelijk van input een bepaald object teruggeeft

// bar     bestelling -> string    -> drankje