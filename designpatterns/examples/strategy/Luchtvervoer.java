package designpatterns.examples.strategy;

public class Luchtvervoer implements Vervoerwijze {
	private int kerosineprijs;

	public Luchtvervoer(int kerosineprijs) {
		this.kerosineprijs = kerosineprijs;
	}
	
	public int getKerosineprijs() {
		return kerosineprijs;
	}

	public void setKerosineprijs(int kerosineprijs) {
		this.kerosineprijs = kerosineprijs;
	}

	@Override
	public String vervoerBeschrijven(Pallet pallet) {
		return "Het Luchtvervoer kost omvang: " + 
						pallet.getBreedte() * pallet.getHoogte() * pallet.getLengte()
				+" gedeeld door de kerosineprijs: " + kerosineprijs ;
	}
	
	@Override
	public int vervoeren(Pallet pallet) {
		int totaal = pallet.getBreedte() * pallet.getHoogte() * pallet.getLengte();
		return totaal / kerosineprijs;
	}
}