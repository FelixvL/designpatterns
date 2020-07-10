package designpatterns.examples.factory;

public class Cola implements Drankje{
	int bedrag = 200;
	@Override
	public void drinken() {
		System.out.println("Drinken in Cola");
		
	}

	@Override
	public int prijsAfrekenen() {
		System.out.println("Het bedrag dat moet worden afgerekend is:"+bedrag);
		return bedrag;
	}

}
