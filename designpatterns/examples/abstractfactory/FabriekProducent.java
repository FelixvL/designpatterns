package designpatterns.examples.abstractfactory;

public class FabriekProducent {
	public static AbstractKledingFabriek geefFabriek(boolean brandveilig) {
		if(brandveilig) {
			return new BrandVeiligeKledingFabriek();
		}else {
			return new KledingFabriek();
		}
	}
}
