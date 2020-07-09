package designpatterns.examples.strategy;

public class Vrachtvervoer implements Vervoerwijze {
	private int pricing;

	public Vrachtvervoer(int pricing) {
		this.pricing = pricing;
	}

	public int getPricing() {
		return pricing;
	}

	public void setPricing(int pricing) {
		this.pricing = pricing;
	}

	public String vervoerBeschrijven(Pallet pallet) {
		return "Het vrachtvervoer kost gewicht: " + 
						pallet.getGewicht() +" * pricing " ;
	}
	
	@Override
	public int vervoeren(Pallet pallet) {
		return pallet.getGewicht() * pricing;
	}
}
