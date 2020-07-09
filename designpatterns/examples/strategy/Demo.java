package designpatterns.examples.strategy;

public class Demo {
   public static void main(String[] args) {
	   Pallet pakket1 = new Pallet();
	   pakket1.setBreedte(120);
	   pakket1.setLengte(120);
	   pakket1.setGewicht(455);
	   pakket1.setHoogte(210);
	   pakket1.setNaam("AutoOnderdelen");
	   
      VervoersContext context = new VervoersContext(new Vrachtvervoer(23));		
      System.out.println(context.vervoerUitvoeren(pakket1));

      context = new VervoersContext(new Luchtvervoer(15));		
      System.out.println(context.vervoerUitvoeren(pakket1));

      context = new VervoersContext(new Bootvervoer());		
      System.out.println(context.vervoerUitvoeren(pakket1));
   }
}