package designpatterns.examples.observer;

public class Leverancier {
	private String product;
	public Leverancier(String product) {
		this.product = product;
	}
	public String afleveren() {
		return product;
	}
}
