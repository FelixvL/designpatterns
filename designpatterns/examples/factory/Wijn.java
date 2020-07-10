package designpatterns.examples.factory;

public class Wijn implements Drankje {
	int bedrag = 350;
	@Override
	public void drinken() {
		System.out.println("Drinken in Wijn");
		
	}

	@Override
	public int prijsAfrekenen() {
		System.out.println("Het bedrag dat moet worden afgerekend is:"+bedrag);
		return bedrag;
	}
}
