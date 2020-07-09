package designpatterns.examples.strategy;

public interface Vervoerwijze {
	public int vervoeren(Pallet pallet);
	
	public String vervoerBeschrijven(Pallet pallet);
}
