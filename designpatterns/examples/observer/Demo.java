package designpatterns.examples.observer;

import java.util.Scanner;

public class Demo {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("we gaan de observer maken");
		Magazijn magazijn = new Magazijn();
		magazijn.voorraad.add("Melk");
		magazijn.voorraad.add("Water");
		magazijn.voorraad.add("Brood");
		
		
		boolean doorgaan = true;

		while(doorgaan) {
			
			String keuze = keuzeMenu();
			if(keuze.equals("q")) {
				doorgaan = false;
			}else {
				new Klant(magazijn, keuze);
			}
		}
		
		Leverancier leverancier = new Leverancier("Soep");
		magazijn.krijgtLevering(leverancier);
		System.out.println("Einde programma");
		
	}
	static String keuzeMenu() {
		System.out.println("Type het product in waarvoor je je wilt inschrijven");
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

