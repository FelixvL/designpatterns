package designpatterns.examples.observer;

import java.util.ArrayList;
import java.util.List;

public class Magazijn {
	List<Observer> observers = new ArrayList();

	public void attach(Observer observer) {
		observers.add(observer);
	}
}
