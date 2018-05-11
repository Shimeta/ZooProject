package zoo.Gehege;

import zoo.Zoo;
import zoo.Tier.Tier;

public class LandsaeugeTierGehege extends Gehege {

	public LandsaeugeTierGehege(String name, Zoo owner) {
		super(name, owner);
	}
	
	public void setTiere(Tier[] tiere) {
		//Array von Tieren werden hier übergegeben
		//Hier muss noch eingeschränkt werden ... also dass z.B nur Vögel dem Vogelgehege zugeordnet werden dürfen	
		
		this.tiere = tiere;
		for(int i = 0; i < tiere.length; i++) {
			System.out.println(tiere[i].getName()+" wurde dem " + this.getName() + " zugeordnet");
		}
	}
	
	public void addTier(Tier tier) {
		//ein einzelnes Tier wird hinzugefügt zum Gehege
		//muss auch noch eingeschränkt werden ~> isses nun o/
		//ich würds so machen
		
		if((tier.getTypName()=="Loewe") || (tier.getTypName()=="Zebra")) {
			//kann zugeordnet werden
			//referenz: System.out.print("\n " + tier.getTypName());
			
			int tiere_array_counter = 0;
			for(int l= 0; l< this.tiere.length; l++) {
				if(this.tiere[l] != null) {	
					tiere_array_counter++;
				}
			}
			this.tiere[tiere_array_counter+1] = tier;
			System.out.println(tier.getName()+ " wurde dem "+ this.getName()+" zugeordnet");
		} else {
			//krepiert elendig oder kann nicht zugeordnet werden
			System.out.println(tier.getTypName() + " konnte dem Gehege nicht zugeordnet werden (Grund: unpassendes Gehege");
		}
	}
	
	//Zustandsausgabe erstellt
	public void addTierAlternative(Tier tier) {
		
		//setzt das Tier in den Array ein nur einmal 
		boolean anima_inside = false;
		
		for(int l= 0; l< this.tiere.length; l++) {
			if(this.tiere[l] == null && anima_inside == false) {
				this.tiere[l] = tier;				
				anima_inside = true; // glaub man könnte hier auch einfach nur ein break verwenden.
				
			}
		}
		System.out.println(tier.getName()+ " wurde dem "+ this.getName()+" zugeordnet");
	}
	
	
	
}
