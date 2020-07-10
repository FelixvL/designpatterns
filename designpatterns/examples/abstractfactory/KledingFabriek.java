package designpatterns.examples.abstractfactory;

public class KledingFabriek extends AbstractKledingFabriek{
	@Override
	Kleding bestelKleding(KledingSoort ks) {
		if(ks == KledingSoort.Broek) {
			return new Broek();
		}else {
			return new Trui();
		}
	}
}
