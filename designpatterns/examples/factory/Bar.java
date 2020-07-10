package designpatterns.examples.factory;

public class Bar {

	public Drankje getDrankje(Dranknaam bestelling) {
		switch(bestelling) {
		case Biertje:
			return new Biertje();
		case Cola:
			return new Cola();
		case Wijn:
			return new Wijn();
		default:
			System.out.println("Deze bestelling kan ik niet verwerken");
			return null;

		}
	}
}
