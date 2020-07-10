package designpatterns.examples.observer;

public class Winkel extends Observer{
	public Winkel(Magazijn magazijn){
		this.magazijn = magazijn;
		this.magazijn.attach(this);
	}
	public void update(String product) {
		System.out.println("update in Winkel");
	}
}


