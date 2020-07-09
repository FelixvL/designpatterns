package designpatterns.examples.strategy;

public class VervoersContext {
	private Vervoerwijze vervoerwijze;

	public VervoersContext(Vervoerwijze vervoerwijze) {
		this.vervoerwijze = vervoerwijze;
	}

	public String vervoerUitvoeren(Pallet pallet) {
		return vervoerwijze.vervoerBeschrijven(pallet) + " totaal: " + vervoerwijze.vervoeren(pallet);
	}
}
