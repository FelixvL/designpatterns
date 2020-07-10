package designpatterns.examples.observer;

public class Klant extends Observer{
	public Klant(Magazijn magazijn){
		this.magazijn = magazijn;
		this.magazijn.attach(this);
	}
	public void update() {
		System.out.println("update in Klant");
	}
}
