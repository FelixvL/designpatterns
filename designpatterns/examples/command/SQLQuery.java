package designpatterns.examples.command;

public class SQLQuery {
	private Boot boot;
	
	public SQLQuery(Boot boot) {
		this.boot = boot;
	}
	
	public String update() {
		return "UPDATE boot SET naam = '"+boot.getNaam()+"', kapiteinnaam = '"
					+boot.getKapiteinNaam()+"', aantalstoelen = "+boot.getAantalStoelen()
					+", lengte = "+boot.getLengte()+" WHERE id = "+boot.getId()+";";
	}
	public String insert() {
		return "INSERT INTO Customers (id, naam, kapiteinnaam, aantalstoelen, lengte)"+
				   " VALUES ("+boot.getId()+", '"+boot.getNaam()+"', '"+boot.getKapiteinNaam()+
				   "', "+boot.getAantalStoelen()+", "+boot.getLengte()+");";
	}
	public String delete() {		
		return "DELETE FROM Boot WHERE id = " + boot.getId() + ";";
	}
	public String select() {
		return "SELECT * FROM Boot WHERE id = " + boot.getId() + ";";
	}
	
}
