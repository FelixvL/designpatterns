package designpatterns.examples.abstractfactory;

public class Demo {
	public static void main(String[] args) {
		System.out.println("abstract factory");
		AbstractKledingFabriek akf = FabriekProducent.geefFabriek(false);
		Kleding k = akf.bestelKleding(KledingSoort.Broek);
		
		k.aantrekken();
		Dier dier = new Egel();
		DierenAmbulance da = new DierenAmbulance();
		da.ophalen(new Egel());
		da.ophalen(new Kat());
	//	da.ophalen(new Ladder()); // Kan niet
	}
}


class Asiel{
	Dier ophalen(){
		return new Egel();
	}
}


class DierenAmbulance{
	void ophalen( Dier e ) {  // Dont Repeat Yourself
		
	}

}
class Ladder {}

abstract class Dier{}
class Egel extends Dier{}
class Vogel extends Dier{}
class Hamster extends Dier{}
class Kat extends Dier{}

// Normale kleding					// Normale Kleding Factory
// BrandVeilige Kleding				// BrandVeilige Kleding Factory

// Kleding


// Broek
// BrandVeiligeBroek

// Trui
// BrandVeiligeTrui

