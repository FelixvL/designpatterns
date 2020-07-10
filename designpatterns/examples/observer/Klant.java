package designpatterns.examples.observer;

public class Klant extends Observer{
	private String productkeuze;
	public Klant(Magazijn magazijn, String productkeuze){
		this.magazijn = magazijn;
		this.productkeuze = productkeuze;
		this.magazijn.attach(this);
	}
	public void update() {
		System.out.println("update in Klant, voor het product: "+productkeuze);
	}
}
