package designpatterns.examples.abstractfactory;

public class BrandVeiligeKledingFabriek extends AbstractKledingFabriek{

	@Override
	Kleding bestelKleding(KledingSoort ks) {
		if(ks == KledingSoort.Broek) {
			return new BrandVeiligeBroek();
		}else {
			return new BrandVeiligeTrui();
		}
	}
	
}
