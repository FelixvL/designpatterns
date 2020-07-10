package designpatterns.examples.factory;

public class Biertje implements Drankje{
	int bedrag = 275;
	@Override
	public void drinken() {
		System.out.println("Drinken in Bier");
		
	}

	@Override
	public int prijsAfrekenen() {
		System.out.println("Het bedrag dat moet worden afgerekend is:"+bedrag);
		return bedrag;
	}
}
