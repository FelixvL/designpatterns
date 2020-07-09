package designpatterns.examples.strategy;

public class Bootvervoer implements Vervoerwijze {
	
	public String vervoerBeschrijven(Pallet pallet) {
		return "Het Bootvervoer kost hoogte * breedte: " + 
						pallet.getBreedte() * pallet.getHoogte();
	}
	
	@Override
	public int vervoeren(Pallet pallet) {
		return pallet.getGewicht() * pallet.getHoogte();
	}
}
