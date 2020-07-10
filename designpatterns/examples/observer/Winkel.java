package designpatterns.examples.observer;

public class Winkel extends Observer{
	public Winkel(Magazijn magazijn){
		this.magazijn = magazijn;
		this.magazijn.attach(this);
	}
	public void update() {
		System.out.println("update in Winkel");
	}
}
