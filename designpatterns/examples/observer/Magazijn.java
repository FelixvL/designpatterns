package designpatterns.examples.observer;

import java.util.ArrayList;
import java.util.List;

public class Magazijn {
	List<Observer> observers = new ArrayList();
	List<String> voorraad = new ArrayList();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers(String product) {
		for(Observer observer : observers) {
			observer.update(product);
		}
	}
	
	public void krijgtLevering(Leverancier leverancier) {
		System.out.println("er wordt geleverd");
		voorraad.add(leverancier.afleveren());///
		notifyAllObservers(leverancier.afleveren());
	}
}
