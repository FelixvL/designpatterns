package designpatterns.examples.observer;

public class Demo {
	public static void main(String[] args) {
		System.out.println("we gaan de observer maken");
		Magazijn magazijn = new Magazijn();
		Klant klant = new Klant(magazijn);
		Winkel winkel = new Winkel(magazijn);
		
		
		
		
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

