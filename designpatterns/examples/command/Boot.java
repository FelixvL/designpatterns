package designpatterns.examples.command;

public class Boot {
	private long id;
	private String naam;
	private int aantalStoelen;
	private String kapiteinNaam;
	private int lengte;

	public Boot(int id, String naam, int aantalStoelen, String kapiteinNaam, int lengte) {
		this.id = id;
		this.naam = naam;
		this.aantalStoelen = aantalStoelen;
		this.kapiteinNaam = kapiteinNaam;
		this.lengte = lengte;
	}

	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAantalStoelen() {
		return aantalStoelen;
	}

	public void setAantalStoelen(int aantalStoelen) {
		this.aantalStoelen = aantalStoelen;
	}

	public String getKapiteinNaam() {
		return kapiteinNaam;
	}

	public void setKapiteinNaam(String kapiteinNaam) {
		this.kapiteinNaam = kapiteinNaam;
	}

	public int getLengte() {
		return lengte;
	}

	public void setLengte(int lengte) {
		this.lengte = lengte;
	}
	
	
	
	
	
	
}
