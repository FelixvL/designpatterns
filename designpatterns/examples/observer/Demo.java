package designpatterns.examples.observer;

public class Demo {
	public static void main(String[] args) {
		System.out.println("we gaan de observer maken");
		Magazijn magazijn = new Magazijn();
		
		Klant klant = new Klant(magazijn);
		Klant klant2 = new Klant(magazijn);
		Klant klant3 = new Klant(magazijn);
		Klant klant4 = new Klant(magazijn);
		Winkel winkel = new Winkel(magazijn);
		
		
		
		Leverancier leverancier = new Leverancier();
		magazijn.leveren(leverancier);
		
		
	}
}


// magazijn

// Magazijn Subject
	// voorraad List<String>  - dublicaten
	// productenTeKoop List<String>
	


// Observer ->
	//Product : String

// Observer Specifiek Klant
	//Product : String	

// Observer Specifiek  Winkel Groothandel
	// Product : String

// Leverancier
	// leverancier : String

