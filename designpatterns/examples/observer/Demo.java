package designpatterns.examples.observer;

import java.util.Scanner;

public class Demo {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("we gaan de observer maken");
		Magazijn magazijn = new Magazijn();

		boolean doorgaan = true;
		while(doorgaan) {
			String keuze = keuzeMenu();
			if(keuze.equals("q")) {
				doorgaan = false;
			}else {
				new Klant(magazijn);
			}
		}
		
		Leverancier leverancier = new Leverancier();
		magazijn.krijgtLevering(leverancier);
		System.out.println("Einde programma");
		
	}
	static String keuzeMenu() {
		System.out.println("Kies 1 om je aan te melden");
		String keuze = scanner.nextLine();
		return keuze;
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

