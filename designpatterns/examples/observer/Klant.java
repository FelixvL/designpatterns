package designpatterns.examples.observer;

public class Klant extends Observer{
	private String productkeuze;
	public Klant(Magazijn magazijn, String productkeuze){
		this.magazijn = magazijn;
		this.productkeuze = productkeuze;
		this.magazijn.attach(this);
	}
	public void update(String product) {
		if(product.equals(productkeuze)) {
			System.out.println("Yes "+product+" is binnen, ik moet naar de winkel");
		}else {
			System.out.println("Dit is niet relevant, want ik had besteld "+ productkeuze);
		}
	}
}
